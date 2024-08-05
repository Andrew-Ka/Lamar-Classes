//**********************************
// COSC 1336 CS 1
// Name: Andrew Kalathra
// Data: 9/08/2021
// compute the area of volume of cylinder
//**********************************

import java.util.Scanner;

public class cylindVol {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double area = 0.0;
		double pi = 3.1415926;
		
		System.out.print("Enter radius of circle: ");
		double radius = input.nextDouble();
		
		area = radius * radius * pi;
		
		System.out.println("The area of the circle was " + area);
		
		System.out.print("Enter length of cylinder: ");
		double length = input.nextDouble();
		
		double volume = area * length;
		System.out.print("The total volume of your cylinder was " + volume);
		

input.close();
	}
}

