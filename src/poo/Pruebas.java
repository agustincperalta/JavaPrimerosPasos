package poo;

public class Pruebas {
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Agustin");
        Empleados trabajador2 = new Empleados("Ana");
        trabajador1.setSeccion("Informática");
        Empleados trabajador3 = new Empleados("Raul");
        Empleados trabajador4 = new Empleados("Maria");


        System.out.println(trabajador1.getDatos() + "\n"
                + trabajador2.getDatos() + "\n"
                + trabajador3.getDatos() + "\n"
                + trabajador4.getDatos());
        System.out.println(Empleados.dameIdSiguiente());
    }


}

class Empleados {
    final private String nombre;
    private String seccion;
    private int Id;
    public static int IdSiguiente = 1;

    public static String dameIdSiguiente() {
        return "El Id Siguiente es " + IdSiguiente;
    }


    public Empleados(String nombre) {
        this.nombre = nombre;
        seccion = "Administración";
        Id = IdSiguiente;
        IdSiguiente++;

    }

    public void setSeccion(String sec) {
        seccion = sec;
    }

    public String getDatos() {
        return "El nombre es: " + nombre + " Su sección es: " + seccion +
                " y el Id es: " + Id;
    }

}