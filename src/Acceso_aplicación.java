import javax.swing.*;
public class Acceso_aplicación {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Agustin";
		
		String password = "";
		
		while(!clave.contentEquals(password)) {
			
			password = JOptionPane.showInputDialog("Introduce la contaseña");
			if(!clave.equals(password)) {
				System.out.println("Constraseña incorrecta");
			}
		}
		
		System.out.println("Contraseña correcta");
		
	}

}
