package examen.marco.sara.motores;

public class MotorFactory {
    public static final String ORACLE = "ORACLE";
    public static final String POSTGRE = "POSTGRE";
    public static final String MARIADB = "MARIADB";

    public static MotorSQL create(String motor) {
        switch (motor) {
            case MARIADB:
                return null;
            case POSTGRE:
                return PostgreMotorSQL.getInstancia();
            case ORACLE:
                return null;
            default:
                throw new IllegalArgumentException("Motor no soportado: " + motor);
        }
    }
}
