package examen.marco.sara.beans;

import java.util.ArrayList;

public class Agencia {
    private int id;
    private String nombre;
    private String pais;

    ArrayList<Satelite> satelites = new ArrayList<>();
    //para guardar los diferentes satelites pertenecientes a la agencia

    public Agencia(int id, String nombre, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
