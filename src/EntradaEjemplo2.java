import javax.swing.JOptionPane;
public class EntradaEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad");
		int edad_usuario = Integer.parseInt(edad);
		edad_usuario++;
		System.out.println("Hola " + nombre_usuario + " .En un año tendrás " + (edad_usuario)
				+ " años");
		
	}

}
