
public class EjemploArray2D {

	public static void main(String[] args) {
		
		double acum;
		double interes = 0.10;
		
		double [][] saldo = new double[6][5];
		
		for(int i = 0; i < 6; i++) {
			saldo[i][0] = 10000;
			acum = 10000;
			
			for(int j = 1; j<5; j++) {
				acum +=(acum*interes);
				saldo[i][j] = acum;
			}
			
			interes += 0.01;
		}
		
		for(int z = 0; z< 6; z++) {
			System.out.println();
			for(int h = 0; h<5; h++) {
				System.out.printf("%1.3f", saldo[z][h]);
				System.out.print(" ");
			}
		}
	}

}
