import java.util.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kbd = new Scanner(System.in)
				;
		int aleatorio = (int) (Math.random()*100);
		
		System.out.println(aleatorio);
		
		int numero = 0;
		int intentos = 0;
		
		do{
			intentos++;
			System.out.println("Introduce un número");
			numero = kbd.nextInt();
			
			if(aleatorio < numero) {
				System.out.println("Más bajo");
			} else if(aleatorio > numero) {
				System.out.println("Más alto");
			}
		}while(numero != aleatorio); 
		
		System.out.println("Correcto, lo haz conseguido en " + intentos + " intentos.");
		
		
	}

}
