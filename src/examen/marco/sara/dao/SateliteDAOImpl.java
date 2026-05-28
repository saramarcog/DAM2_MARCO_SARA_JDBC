package examen.marco.sara.dao;
import java.util.ArrayList;
import examen.marco.sara.motores.*;
import examen.marco.sara.beans.*;

public class SateliteDAOImpl extends AbstractDAO<Satelite> {
    public SateliteDAOImpl(
            MotorSQL motorSQL) {
        super(motorSQL);
    }
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
    public void add(Satelite object) {
    
    }

    @Override
    public void update(int id, Satelite object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Satelite find(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'find'");
    }

    @Override
    public ArrayList<Satelite> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    
}
