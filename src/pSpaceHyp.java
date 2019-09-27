package IO;
// Copia un archivo de texto sustituye todos los espacios en guiones

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class pSpaceHyp {
    public static void main(String[] args) {
        int c;
        FileInputStream f1 = null;
        FileOutputStream f2 = null;
        // Verifica que los parametros son correctos
        if (args.length != 2){
            System.out.println("Uso: pSpaceHyp f1 f2");
            return;
        }

        try{
            f1 = new FileInputStream(args[0]);
            f2 = new FileOutputStream(args[1]);
            do {
                c = f1.read();
                if (c == -1) break;
                if (c == (int) ' ') f2.write('-');
                else f2.write(c);
            }while(c != -1);

        } catch (IOException e){
            System.out.println("IO Error: " + e);
        }finally {
            try{
                if (f1 != null) f1.close();
            } catch (IOException e){
                System.out.println("Error al cerrar el archivo");
            }

            try{
                if(f2 != null) f2.close();
            } catch (IOException e){
                System.out.println("Error al cerrar el archivo");
            }
        }


    }
}
