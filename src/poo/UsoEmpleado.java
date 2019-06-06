package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

    public static void main(String[] args) {

        Jefatura jefe_TI = new Jefatura("Laura", 5500, 2020, 1, 3);

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

        System.out.println(jefa_Finanzas.tomarDecisiones("Viernes Casual"));
        System.out.println("El Jefe "+ jefa_Finanzas.dameNombre() + "Tiene un bonus de: " +
                 jefa_Finanzas.establece_bonus(500));
        System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " +
                misEmpleados[3].establece_bonus(200));

        for (Empleado e : misEmpleados) {
            e.subeSueldo(5);
        }

        Arrays.sort(misEmpleados);

        for (Empleado e : misEmpleados) {

            System.out.println("Nombre: " + e.dameNombre() +
                    " Sueldo: " + e.getSueldo() +
                    " Fecha Alta " + e.dameFechaContrato());
        }

    }

}

class Empleado implements Comparable, Trabajadores {
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

    public double establece_bonus(double gratificacion){
        return Trabajadores.bonusBase + gratificacion;
    }


    public String dameNombre() {
        // Getter
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

    // Implementación de la Interfaz compareTo de Comparable

    public int compareTo(Object miObjeto) {
        // hacer un casting de objeto a objeto empleado
        Empleado otroEmpleado = (Empleado) miObjeto;
        if (this.sueldo < otroEmpleado.sueldo) {
            return -1;
        }
        if (this.sueldo > otroEmpleado.sueldo) {
            return 1;
        }
        return 0;
    }

    // Propiedades encapsuladas
    private String nombre;
    private double sueldo;
    private Date altaContrato;
}

final class Jefatura extends Empleado implements Jefes {

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

    // Implementa tomarDecisiones
    public String tomarDecisiones(String decision) {
        return "Un miembro de la dirección ha tomado la decisión de: " + decision;
    }

    // Implementa estableceBonus
    public double establece_bonus(double gratificacion) {
        double prima = 2000;
        return Trabajadores.bonusBase + gratificacion + prima;
    }

}

