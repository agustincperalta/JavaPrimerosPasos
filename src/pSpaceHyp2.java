package IO;

// Utiliza character streams con try-with-resources
import java.io.*;
public class pSpaceHyp2 {
    public static void main(String[] args) {
        int c;

        // Verifica que los parametros se pasaron correctamente
        if (args.length != 2){
            System.out.println("Uso: pSpaceHyp2 f1 f2");
            return;
        }

        try(var f1 = new BufferedReader(new FileReader(args[0]));
            var f2 = new BufferedWriter(new FileWriter(args[1]))){

            do {
                c = f1.read();
                if (c == ' ') f2.write('-');
                else f2.write(c);
            }while(c!= -1);
        }catch (IOException e){
            System.out.println("Error IO " + e);
        }


    }
}
