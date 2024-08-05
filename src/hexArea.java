import java.util.Scanner;

//**********************************
// COSC 1336 CS 1
// Name: Andrew Kalathra
// Data: 9/21/2021
// compute the area of a hexagon
//**********************************

public class hexArea {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter a side length of a hexagon: ");
		double side = input.nextDouble();
		
		double numerator = 6.0 * side * side;
		double denominator = 4.0 * Math.tan(Math.PI/6);
		
		double area = numerator / denominator;
		
		System.out.printf("The area of the hexagon with the side length of %.2f is %.2f", side, area );
		
	input.close();	
	}

}
