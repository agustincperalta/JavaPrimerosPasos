public class EnumDemo {
    // Una enumeración de variedades de manzanas
    enum Apple{ Jonathan, GoldenDel, RedDel, Winesap, Cortland}
    // Constantes de enumeración son public static final
    // Son del tipo de la enumeración que fueron declarados
    // en este caso apples --> selftyped

    public static void main(String[] args) {
        // definen un tipo de clase pero no las instancias usando new
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("Valor de ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        // Compara dos valores enum

        if (ap == Apple.GoldenDel){
            System.out.println("ap contiene GoldenDel.\n");
        }

        // Un tipo enumerado puede ser usado como controlador de un switch

        switch (ap){
            case Jonathan:
                System.out.println("Jonathan es rojo");
                break;
            case GoldenDel:
                System.out.println("Golden Del es amarilla");
                break;
            case RedDel:
                System.out.println("Red Del es roja");
                break;
            case Winesap:
                System.out.println("Winesap es roja");
                break;
            case Cortland:
                System.out.println("cortland es roja");
                break;
        }

    }
}
