//Made by Andrew Kalathra

public class TextIntegerMatrix {
	public static void main(String[] args) {
		
		Integer[][] m1 = new Integer[][] {{1,2,3},{4,5,6},{7,8,9}};
		Integer[][] m2 = new Integer[][] {{9,8,7},{6,5,4},{3,2,1}};
		
		IntegerMatrix integerMatrix = new IntegerMatrix();
		
		System.out.println("\nm1 + m2 is ");
		GenericMatrix.printResult(m1, m2, integerMatrix.addMatrix(m1, m2), '+');
		
		System.out.println("\nm1 * m2 is ");
		GenericMatrix.printResult( m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');
		
	}

}
