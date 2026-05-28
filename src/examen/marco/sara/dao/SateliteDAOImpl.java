package examen.marco.sara.dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import examen.marco.sara.motores.*;
import examen.marco.sara.beans.*;

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

 private static final String SQL_FIND_ALL =
                            "SELECT * " +
                                    "FROM satelite " +
                                    "ORDER BY id";
private static final String SQL_FIND =
            "SELECT * " +
                    "FROM satelite " +
                    "WHERE id = ?";


private static final String SQL_FIND_BY_ORBITA =
                    "SELECT * " +
                            "FROM satelite " +
                            "WHERE orbita = ? " +
                            "ORDER BY nombre";
        
private static final String SQL_FIND_BY_AGENCIA =
                    "SELECT * " +
                            "FROM satelite " +
                            "WHERE id_agencia= ? " +
                            "ORDER BY nombre DESC";

                            
    
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
                        mapSatelite(rs);
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
        ArrayList<Satelite> s =
        new ArrayList<>();

try{

    motorSQL.connect();

    motorSQL.prepare(SQL_FIND_ALL);

    ResultSet rs =
            motorSQL.executeQuery();

    while(rs.next()){

        s.add(
                mapSatelite(rs));
    }

}catch (Exception e){

    printError(e);

}finally {

    motorSQL.close();
}

return s;
    }
    

    private Satelite mapSatelite(
        ResultSet rs)
        throws Exception {

    Satelite s=
            new Satelite();

    s.setId(
            rs.getInt("id"));

    s.setNombre(
            rs.getString("nombre"));

    s.setOrbita(
            rs.getString("orbita"));
    s.setPeso(rs.getInt("peso"));

    s.setCoste(rs.getInt("coste"));

    s.setActivo(rs.getBoolean("activo"));
    return s;
}
// CONSULTAS AVANZADAS 
    @Override
    public ArrayList<Satelite> findByOrbita(String orbita) {
        ArrayList<Satelite> satelites =
        new ArrayList<>();

try{

    motorSQL.connect();

    motorSQL.prepare(
            SQL_FIND_BY_ORBITA);

    motorSQL.getPs().setString(
            1,
            orbita);

    ResultSet rs =
            motorSQL.executeQuery();

    while(rs.next()){

        satelites.add(
                mapSatelite(rs));
    }

}catch (Exception e){

    printError(e);

}finally {

    motorSQL.close();
}

return satelites;
    }

    @Override
    public ArrayList<Satelite> findByAgencia(String agencia) {
        ArrayList<Satelite> satelites =
                new ArrayList<>();
        try{
            motorSQL.connect();
            motorSQL.prepare(
                    SQL_FIND_BY_AGENCIA);
            motorSQL.getPs().setString(
                    1,
                    agencia);
            ResultSet rs =
                    motorSQL.executeQuery();
            while(rs.next()){
                satelites.add(
                        mapSatelite(rs));
            }
        }catch (Exception e){
            printError(e);
        }finally {
            motorSQL.close();
        }

        return satelites;
    }
    public static void main(String[] args){

    SateliteDAOImpl sateliteDAO = new SateliteDAOImpl(MotorFactory.create(MotorFactory.POSTGRE));

    System.out.println("prueba unitaria : ADD");

    // Prueba Unitaria: ADD Película
       Satelite s = new Satelite();
       s.setNombre("Prueba");
       s.setAgencia(new Agencia(1, "Aprobada:)","Imagi Nacion"));
       s.setOrbita("Pluto");
       s.setPeso(2222);

       sateliteDAO.add(s);
       System.out.println("Fin prueba unitaria");


        // Prueba Unitaria: LISTAR SATELITES
        ArrayList<Satelite> lstSatelite = sateliteDAO.findAll();
        for (Satelite sat :lstSatelite
             ) {
            System.out.println(sat.toString());
        }
        // Fin Prueba Unitaria: LISTAR PELÍCULAS
        System.out.println("Prueba Unitaria: ELIMINAR");
        // Prueba Unitaria: ELIMINAR
            sateliteDAO.delete(2);
        // Prueba Unitaria: FIN ELIMINAR
        System.out.println("Fin prueba unitaria");

        System.out.println("Prueba Unitaria: FIND");
        // Prueba Unitaria: FIND
        sateliteDAO.find(2);
        System.out.println("Fin prueba unitaria");

        System.out.println("Prueba Unitaria: UPDATE");
        // Prueba Unitaria: UPDATE
        sateliteDAO.update(3, s );
        System.out.println("Fin prueba unitaria");

    
    }
}


