package examen.marco.sara.dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import examen.marco.sara.motores.*;
import examen.marco.sara.beans.*;
import examen.marco.sara.motores.MotorSQL;

public class SateliteDAOImpl extends AbstractDAO<Satelite> {
    public SateliteDAOImpl(MotorSQL motorSQL) {
        super(motorSQL);
    }
    private static final String SQL_INSERT =
            "INSERT INTO satelite " +
                    "(" +
                    "nombre, " +
                    "orbita, " +
                    "peso, " +
                    "coste, " +
                    "activo" +
                    "agencia_id" +
                    "autor_examen" +
                    ") " +
                    "VALUES " +
                    "(" +
                    "?, ?, ?, ?, ?, ?, SaraMarco " +
                    ")";
    private static final String SQL_UPDATE =
            "UPDATE satelite " +
                    "SET " +
                    "nombre = ?, " +
                    "orbita = ?, " +
                    "peso = ?, " +
                    "coste = ?, " +
                    "activo = ? " +
                    "agencia_id = ? " +
                    "WHERE id = ?";

  private static final String SQL_DELETE =
                    "DELETE FROM satelite " +
                            "WHERE id = ?";
    public void check() {
        try {
             motorSQL.connect();
            if (motorSQL.conn != null &&
                    !motorSQL.conn.isClosed()) {
                System.out.println("CONEXION OK");
            }
        } catch (Exception e) {
            printError(e);
        } finally {
            motorSQL.close();
        }
    
    @Override
    public void add(Satelite satelite) {
        try{
            motorSQL.connect();
            motorSQL.prepare(SQL_INSERT);
            motorSQL.getPs().setString(1, satelite.getNombre());
            motorSQL.getPs().setString(2, satelite.getOrbita());
            motorSQL.getPs().setInt(3, (int) satelite.getPeso());
            motorSQL.getPs().setInt(4,(int)satelite.getCoste());
            motorSQL.getPs().setBoolean(5, satelite.isActivo());

            int rows = motorSQL.executeUpdate();
            System.out.println(
                    "INSERTADOS: " +
                            rows);

        }catch (Exception e){

            printError(e);

        }finally {

            motorSQL.close();
        }
    }

    @Override
    public void update(int id, Satelite satelite) {
        try{
            motorSQL.connect();
            motorSQL.prepare(SQL_UPDATE);
            motorSQL.getPs().setString(1, satelite.getNombre());
            motorSQL.getPs().setString(2, satelite.getOrbita());
            motorSQL.getPs().setInt(3, (int) satelite.getPeso());
            motorSQL.getPs().setInt(4,(int)satelite.getCoste());
            motorSQL.getPs().setBoolean(5, satelite.isActivo());
            motorSQL.getPs().setInt(
                    6,
                    id);
            int rows =
                    motorSQL.executeUpdate();
            System.out.println(
                    "ACTUALIZADOS: " +
                            rows);
        }catch (Exception e){
            printError(e);
        }finally {
            motorSQL.close();
        }
    }

    @Override
    public void delete(int id) {
        try{

            motorSQL.connect();

            motorSQL.prepare(SQL_DELETE);

            motorSQL.getPs().setInt(
                    1,
                    id);

            int rows =
                    motorSQL.executeUpdate();

            System.out.println(
                    "BORRADOS: " +
                            rows);

        }catch (Exception e){

            printError(e);

        }finally {

            motorSQL.close();
        }
    }

    @Override
    public Satelite find(int id) {
        Satelite satelite = null;

        try{
            motorSQL.connect();
            motorSQL.prepare(SQL_FIND);
            motorSQL.getPs().setInt(
                    1,
                    id);
            ResultSet rs =
                    motorSQL.executeQuery();
            if(rs.next()){

                satelite =
                        mapPelicula(rs);
            }

        }catch (Exception e){

            printError(e);

        }finally {

            motorSQL.close();
        }

        return satelite;
    }
    @Override
    public ArrayList<Satelite> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    

    private Satelite mapPelicula(
        ResultSet rs)
        throws Exception {

    Satelite pelicula =
            new Satelite();

    pelicula.setId(
            rs.getInt("id"));

    pelicula.setNombre(
            rs.getString("nombre"));

    pelicula.setOrbita(
            rs.getString("orbita"));


    pelicula.setAnyo(
            rs.getInt("anyo"));

    pelicula.setDuracion(
            rs.getInt("duracion"));

    return pelicula;
}
}
