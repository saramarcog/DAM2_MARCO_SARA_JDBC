package examen.marco.sara.beans;

public class DetalleSatelite {
    private int id;
    private int velocidadMaxima;
    private double combustible;
    private int vidaUtil;

    public DetalleSatelite(int id, int velocidadMaxima, double combustible, int vidaUtil) {
        this.id = id;
        this.velocidadMaxima = velocidadMaxima;
        this.combustible = combustible;
        this.vidaUtil = vidaUtil;
    }

    @Override
    public String toString() {
        return "DetalleSatelite{" +
                "id=" + id +
                ", velocidadMaxima=" + velocidadMaxima +
                ", combustible=" + combustible +
                ", vidaUtil=" + vidaUtil +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }
}
