package poo;

public class UsoVehiculo {

    public static void main(String[] args) {

        Coche micoche1 = new Coche();

        micoche1.establece_color("rojo");

        Furgoneta mifurgoneta1 = new Furgoneta(7, 580);

        mifurgoneta1.establece_color("blanco");
        mifurgoneta1.configuraAsientos("si");
        mifurgoneta1.configuraClimatizador("si");

        System.out.println(micoche1.dimeDatos() + " " +micoche1.dimeColor());
        System.out.println(mifurgoneta1.dimeDatos() + "\n" +mifurgoneta1.getDatos());



  /*      Coche micoche = new Coche();

        micoche.establece_color(JOptionPane.showInputDialog("Dime el color del auto"));

        //micoche.color = "moron"; Esto nunca se debe permitir
        System.out.println(micoche.dimeDatos());
        System.out.println(micoche.dimeColor());

        micoche.configuraAsientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
        System.out.println(micoche.dimeAsientos());

        micoche.configuraClimatizador(JOptionPane.showInputDialog("Tiene aclimatizador?"));
        System.out.println(micoche.dime_climatizador());

        System.out.println(micoche.dime_peso_coche());

        System.out.println("El precio final del coche es " + micoche.precioCoche());*/

    }

}
