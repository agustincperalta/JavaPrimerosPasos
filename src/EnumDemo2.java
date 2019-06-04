// Usando los metodos incorporados de enumeración

// Variedades de lenguajes de programación

enum ProgrammingLang{java, python, cplusplus, csharp, ruby, javascript}
public class EnumDemo2 {

    public static void main(String[] args) {
        ProgrammingLang software;
        System.out.println("Aqui están todas las constantes de" +
                " lenguajes de programación");

        // usando values()
        ProgrammingLang lenguajes[] = ProgrammingLang.values();
        for (ProgrammingLang p: lenguajes){
            System.out.println(p);
        }
        System.out.println();

        // Usando valueof()
        software = ProgrammingLang.valueOf("java");
        System.out.println("software contiene: " + software);
    }
}
