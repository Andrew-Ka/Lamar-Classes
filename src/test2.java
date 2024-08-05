
public class test2 {

	public static void main(String[] args) {
		/*
		
		System.out.println("These are your random students grades:");
		int [][] grades = new int[60][15];
		for (int i = 0; i < 60; i++) {
			for (int j = 0; j < 15; j++) {
				grades[i][j] = (int)(Math.random()*100);
			}
		}
		
		for (int row = 0; row < 60; row++) {
			  for (int column = 0; column < 15; column++) {
			    System.out.print(grades[row][column] + " ");
			  }

			  System.out.println();
			} 
		System.out.println("The average grade for each student:");
		
		for (int student = 0; student < 60; student++) {
			System.out.print("Student " + (student+1) + ": ");
			double num = 0; 
			double average = 0;
			for (int task = 0; task < 15; task++) {
				num = num + grades[student][task];
			}
			average = num / 15;
			System.out.print(average);
			System.out.println();
		}
		*/
	}
	
	public static double MeterToFeet(double meter) {
		double feet = 3.279 * meter;
		return feet;
	}

}
