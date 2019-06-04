import java.util.Scanner;

public class Uso_Tallas {

    //enum Talla  {MIN, MEDIANO, GRANDE, MUY_GRANDE};
    enum Talla {
        MINI("S"), MEDIANO("M"), GRANDE("G"), MUY_GRANDE("XL");

        private String abb;

        //Constructor privado
        private Talla(String abb) {
            this.abb = abb;
        }

        //Getter
        public String getAbb() {
            return abb;
        }
    }
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("Escribe una talla: MINI, MEDIANO; GRANDE, MUY_GRANDE");
        String entrada_datos = kbd.next().toUpperCase();
        Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
        System.out.println("Talla = " + la_talla);
        System.out.println("Abreviatura= " + la_talla.getAbb());
    }
}
