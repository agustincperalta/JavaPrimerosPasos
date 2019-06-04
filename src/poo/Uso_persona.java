package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_persona {

    public static void main(String[] args) {

        Persona[] lasPersonas = new Persona[2];

        lasPersonas[0] = new Empleado2("Agustin", 30000, 2019, 11, 23);
        lasPersonas[1] = new Alumno("Jose", "Informatica");


        for (Persona e: lasPersonas){
            System.out.println(e.getNombre() + ", " + e.dameDescripcion());
        }
    }
}

abstract class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String dameDescripcion();


}


class Empleado2 extends Persona {
    // Constructor simple
    public Empleado2(String nom, double sue, int agno, int mes, int dia) {
        super(nom);
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
    }

    // Método abstracto
    public String dameDescripcion(){
        return "Este empleado tiene un sueldo" + sueldo;
    }




    // Getter
    public double getSueldo() {
        return sueldo;
    }

    //Getter
    public Date dameFechaContrato() {
        return altaContrato;
    }

    // Setter
    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    // Propiedades encapsuladas
    private double sueldo;
    private Date altaContrato;
}

class Alumno extends Persona{

    public Alumno(String nombre, String carrrera) {
        super(nombre);
        this.carrera = carrrera;
    }

    private String carrera;

    public String dameDescripcion(){
        return "Este alumno está estudiando la carrera de " + carrera;
    }
}