//Made by Andrew Kalathra
public abstract class GenericMatrix<E extends Number> {

	protected abstract E add(E o1, E o2);
	
	protected abstract E multiply(E o1, E o2);
	
	protected abstract E zero();
	
	public E[][] addMatrix(E[][] matrix1, E[][] matrix2){
		if((matrix1.length != matrix2.length)||(matrix1[0].length != matrix2[0].length)) {
			throw new RuntimeException("The matrices don't have the same size");
		}
		E[][] result = (E[][])new Number[matrix1.length][matrix1[0].length];
		
		for(int i=0;i<result.length;i++) 
			for(int e=0;e<result[i].length;e++) {
				result[i][e]= add(matrix1[i][e], matrix2[i][e]);
			}
			return result;
		}
		public E[][] multiplyMatrix(E[][] matrix1, E[][] matrix2){
		if((matrix1[0].length != matrix2.length)) {
			throw new RuntimeException("The matrices don't have the same size, so can't be multiplied");
		}
		
		E[][] result = (E[][]) new Number[matrix1.length][matrix2[0].length];
		
		for(int i=0;i<result.length;i++) {
			for(int e=0;e<result[0].length;e++) {
				result[i][e]= zero();
				
				for(int k=0;k<matrix1[0].length;k++) {
					result[i][e]= add(result[i][e], multiply(matrix1[i][k], matrix2[k][e]));
				}
			}
		}
		return result;
	}
	
	public static void printResult(Number[][] m1, Number[][] m2, Number[][] m3, char op) {
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				System.out.print(" " + m1[i][j]);
			}
			if (i == m1.length / 2) {
				System.out.print(" " + op + " ");
			}else{
				System.out.print("   ");
			}
			for (int j = 0; j < m2.length; j++) {
				System.out.print(" " + m2[i][j]);
			}
			if (i == m1.length / 2) {
				System.out.print(" = ");
			}else{
				System.out.print("   ");
			}
			for (int j = 0; j < m3.length; j++) {
				System.out.print(m3[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}
