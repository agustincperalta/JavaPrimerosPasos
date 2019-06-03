import java.util.Scanner;

public class EvaluaEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		System.out.println("Introduce tu edad, por favor");
		
		int edad = kbd.nextInt();
		
		if(edad < 18) {
			System.out.println("Eres un adolescente");
		} else if(edad < 40) {
			System.out.println("Eres Joven");
		} else if (edad < 65) {
			System.out.println("Eres maduro");
		} else {
			System.out.println("Cuidate");
		}
		
	}

}
