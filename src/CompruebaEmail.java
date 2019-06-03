import javax.swing.JOptionPane;

public class CompruebaEmail {

	public static void main(String[] args) {
		String correo = JOptionPane.showInputDialog("Introduce mail");
		
		int arroba = 0;
		boolean punto = false;
		for(int i =0;i< correo.length(); i++) {
			if(correo.charAt(i) == '@') {
				arroba++;
			}
			if(correo.charAt(i) == '.') {
				punto=true;
			}
		}
		
		
		if(arroba == 1 && punto) {
		System.out.print("Es correcto");}
		else {
			System.out.println("No es correcto");
		}
		
	}

}
