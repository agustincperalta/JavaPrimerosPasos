import javax.swing.JOptionPane;

public class EntradaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = JOptionPane.showInputDialog("Introduce un número");
		
		double num2 = Double.parseDouble(num1);
		System.out.print("La raíz de " + num2 + " es: ");
		System.out.printf("%1.4f", Math.sqrt(num2));
	
	
	}

}
