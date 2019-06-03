import javax.swing.JOptionPane;

public class UsoArrays2 {

	public static void main(String[] args) {
		int [] matrizAleatorios = new int[1000];
		
		for(int i = 0; i < matrizAleatorios.length; i++) {
			matrizAleatorios[i] = (int) Math.round(Math.random() * 100);
		}
		
		for(int numeros:matrizAleatorios) {
			System.out.print(numeros + " ");
		}
		
	}

}
