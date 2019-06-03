
public class Arrays_bidimensionales {

	public static void main(String[] args) {
		
		int[][] matrix = {
				{10, 4, 32, 43, 3},
				{43, 42, 43, 2, 3},
				{3, 54, 3, 5, 6},
				{4, 6, 0, 23, 4}};
		
		
		System.out.println(matrix[matrix.length - 1].length);
		
		
		for(int[] fila: matrix) {
			System.out.println();
			for(int z: fila) {
				System.out.print(z + " ");
			}
		}
	}

}
