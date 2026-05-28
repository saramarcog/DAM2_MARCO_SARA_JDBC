package examen.marco.sara.dao;
import examen.marco.sara.motores.*;
import java.util.ArrayList;

public abstract class AbstractDAO<T>
        implements DAO<T> {
    protected MotorSQL motorSQL;
    public AbstractDAO(MotorSQL motorSQL) {
        this.motorSQL = motorSQL;
    }
    protected void printError(Exception e){
        System.out.println(
                "[ERROR] " +
                        e.getMessage());
    }
    
     
    public abstract ArrayList<T> findByOrbita(String genero);
    public abstract ArrayList<T> findByAgencia(String director);
}
