import javax.swing.JOptionPane;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long resultado = 1L;
		long numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		
		for(long i = numero; i > 0; i--) {
			resultado = resultado * i;
		}
		
		System.out.print("El factorial de " + numero + " es " + resultado);
	}

}
