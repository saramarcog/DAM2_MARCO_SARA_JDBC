package examen.marco.sara.dao;
import java.util.ArrayList;

import examen.marco.sara.beans.*;
import examen.marco.sara.motores.MotorSQL;

public class AgenciaDAOImpl extends AbstractDAO<Agencia>{

    public AgenciaDAOImpl(MotorSQL motorSQL) {
        super(motorSQL);
    }
    // ALGUNOS METODOS HABRIA QUE REVISARLOS PORQUE NO LOS UTILIZA EL AGENCIADAOImpl.Solicion, crear diferentes AbstracDAO, para que asi solo lo implemente quien lo use.
    @Override
    public void add(Agencia object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void update(int id, Agencia object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Agencia find(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'find'");
    }

    @Override
    public ArrayList<Agencia> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public ArrayList<Agencia> findByOrbita(String genero) {
        // ESTOS METODOS HABRIA QUE REVISARLOS PORQUE NO LOS UTILIZA EL AGENCIADAOImpl.
        throw new UnsupportedOperationException("Unimplemented method 'findByOrbita'");
    }

    @Override
    public ArrayList<Agencia> findByAgencia(String director) {
        // ESTOS METODOS HABRIA QUE REVISARLOS PORQUE NO LOS UTILIZA EL AGENCIADAOImpl. 
        throw new UnsupportedOperationException("Unimplemented method 'findByAgencia'");
    }
    
}
