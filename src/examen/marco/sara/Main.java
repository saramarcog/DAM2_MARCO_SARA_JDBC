package examen.marco.sara;

import examen.marco.sara.motores.MotorSQL;
import examen.marco.sara.motores.PostgreMotorSQL;

public class Main {
    
public static void main(String[] args) {

    System.out.println("Pruebas examen - Sara Marco");
    MotorSQL motorSQL = PostgreMotorSQL.getInstancia();
    

}
}