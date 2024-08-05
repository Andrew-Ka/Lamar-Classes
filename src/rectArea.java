//**********************************
// COSC 1336 CS 1
// Name: Andrew Kalathra
// Data: 9/01/2021
// compute the area of the rectangle
//**********************************

import java.util.Scanner;

public class rectArea {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double area = 0.0;
		
		System.out.print("Enter length of rectangle: ");
		double length = input.nextDouble();
		System.out.print("Enter width of rectangle: ");
		double width = input.nextDouble();
		
		area = length * width;
		
		System.out.println("The area of a rectangle with a length of " + length + " and a width of " + width + " is " + area);
		
		
input.close();
	}

}
