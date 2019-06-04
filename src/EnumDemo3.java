enum Montañas {
    // Define los objetos de tipo enum con su valor de construcción
    Everest(8848), K2(8611), Kachenjunga(8586), Lhotse(8516),
    Paranguaricutirimicuaro;
    // Define una variable de instancia
    private int altura;
    // Constructor

    Montañas(int altura) {
        this.altura = altura;
    }

    // Constructor Sobrecargado
    Montañas(){
        altura = 0;
    }

    //Getter

    public int getAltura() {
        return altura;
    }
}

public class EnumDemo3 {

    public static void main(String[] args) {

        // Muestra la altura del everest
        System.out.println(Montañas.Everest.getAltura());
        // Muestra todas las alturas de las 5 montañas más grandes
        System.out.println("Todas las alturas:");

        for (Montañas m: Montañas.values()){
            System.out.println(m + " mide " + m.getAltura());
        }

    }
}
