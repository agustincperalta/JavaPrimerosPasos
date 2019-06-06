package poo;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador2 {
    public static void main(String[] args) {

        Reloj mireloj = new Reloj();
        mireloj.enMarcha(3000, true);
        JOptionPane.showMessageDialog(null, "Aceptar para terminar");
        System.exit(0);
    }
}

class Reloj {

    public void enMarcha(int intervalo, final boolean sonido) {
        // clase interna local
        class DameLaHora2 implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                Date ahora = new Date();
                System.out.println("Te pongo la hora cada 3 seg" + ahora);
                if (sonido) { // Accediendo a variable de ejemplar que ya está encapsulada
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        ActionListener oyente = new DameLaHora2();
        Timer mitemporizador = new Timer(intervalo, oyente);
        mitemporizador.start();
    }



}