//**********************************
// COSC 1336 CS 1 Fundamentals
// Name: Andrew Kalathra
// Data: 10/7/2021
//check if sides of a triangle are valid and give the area
//**********************************

import java.util.Scanner;

public class triangChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three sides of your triangle (separate with spaces): ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		
		//I was trying this out, seems to work
		System.out.println(isValid(side1, side2, side3)? "The area of your traingle is " + area(side1, side2, side3) : "You have an invalid input");
		
		
		input.close();
		

	}
	public static boolean isValid(double side1, double side2, double side3) {
		boolean valid = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
			return valid;
	
		
		
	}
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3)/2;
		
		double insqrt = s * (s-side1) * (s-side2) * (s-side3);
		double finarea = Math.sqrt(insqrt);
		
		return finarea;
	}
	
		
}
