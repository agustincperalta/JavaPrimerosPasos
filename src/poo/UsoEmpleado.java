package poo;

import java.util.*;

public class UsoEmpleado {

    public static void main(String[] args) {
        /*
        Empleado empleado1 = new Empleado(
                "Paco Gómez", 85000, 2019, 03, 15);
        Empleado empleado2 = new Empleado(
                "Ana Lopez", 95000, 1995, 06, 02);
        Empleado empleado3 = new Empleado(
                "Maria Martin", 10500, 2002, 03, 15);

        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);

        System.out.println("Nombre: " + empleado1.dameNombre() +
                " Sueldo: "+ empleado1.dameSueldo() + " Fecha de alta: " + empleado1.dameFechaContrato());
        System.out.println("Nombre: " + empleado1.dameNombre() +
                " Sueldo: "+ empleado2.dameSueldo() + " Fecha de alta: " + empleado2.dameFechaContrato());
        System.out.println("Nombre: " + empleado1.dameNombre() +
                " Sueldo: "+ empleado3.dameSueldo() + " Fecha de alta: " + empleado3.dameFechaContrato());
*/
        Jefatura jefe_TI = new Jefatura("Laura", 50500, 2020, 1, 3);

        jefe_TI.setIncentivo(2022);

        Jefatura jefe_Administracion = new Jefatura("Pedro",
                30230, 2012, 3, 3);
        jefe_Administracion.setIncentivo(2020);

        Empleado[] misEmpleados = new Empleado[7];
        misEmpleados[0] = new Empleado("Agustin Peralta",
                30000, 2019, 11, 23);
        misEmpleados[1] = new Empleado("Ana Lopez",
                3300, 2013, 12, 3);
        misEmpleados[2] = new Empleado("María Martín",
                13420, 2015, 1, 23);
        misEmpleados[3] = new Empleado("Rosario Maya");

        misEmpleados[4] = jefe_TI; // Polimorfismo en Acción
        misEmpleados[5] = new Jefatura("Blanca", 98223,
                1999, 3, 12); // Polimorfismo
        misEmpleados[6] = jefe_Administracion; // Más polimorfismo (Jefatura <-> Empleado)
        Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5]; // Casting de Objetos
        jefa_Finanzas.setIncentivo(400000);


    /* for(int i = 0; i< misEmpleados.length; i++){
            misEmpleados[i].subeSueldo(5);
        }*/
        for (Empleado e : misEmpleados) {
            e.subeSueldo(5);
        }
/*
        for (int i = 0; i < misEmpleados.length; i++){
            System.out.println("Nombre: " + misEmpleados[i].dameNombre()+
                    " Sueldo: " + misEmpleados[i].dameSueldo()
            + " Fecha Alta: "+ misEmpleados[i].dameFechaContrato());
        }*/
        for (Empleado e : misEmpleados) {

            System.out.println("Nombre: " + e.dameNombre() +
                    " Sueldo: " + e.getSueldo() +
                    " Fecha Alta " + e.dameFechaContrato());
        }

    }

}

class Empleado {
    // Constructor simple
    public Empleado(String nom, double sue, int agno, int mes, int dia) {

        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
    }

    // Constructor sobrecargado
    public Empleado(String nom) {
        this(nom, 3000, 2000, 01, 01);
    }

    // Getter
    public String dameNombre() {
        return nombre;
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
    private String nombre;
    private double sueldo;
    private Date altaContrato;
}

final class Jefatura extends Empleado {

    private double incentivo;

    public Jefatura(String nom, double sue, int agno, int mes, int dia) {
        super(nom, sue, agno, mes, dia);
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double getSueldo() { // Sobrescribe el metodo heredado (lo invalida)
        double sueldoJefe = super.getSueldo(); // llama al metodo heredado sobrescrito
        return sueldoJefe + incentivo;
    }

}

