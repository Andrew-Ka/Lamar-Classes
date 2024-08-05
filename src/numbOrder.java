//**********************************
// COSC 1336 CS 1
// Name: Andrew Kalathra
// Data: 9/08/2021
// return inputed values in increasing and decreasing order
//**********************************

import java.util.Scanner;
 
public class numbOrder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you want to order 3 integers?");
		
		
		System.out.print("Please enter 3 integers (Separate them by a space): ");
		
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
	
		
		if (a < b && a < c) {
			if (b < c)
				System.out.println("The order of your numbers from lowest to highest is: " + a + " " + b + " " + c);
			else
				System.out.println("The order of your numbers from lowest to highest is: " + a + " " + c + " " + b);
		}
		else if (b < a && b < c) {
			if (a < c)
				System.out.println("The order of your numbers from lowest to highest is: " + b + " " + a + " " + c);
			else 
				System.out.println("The order of your numbers from lowest to highest is: " + b +" " +  c +" " +  a);
		}
		else {
			if (a < b)
				System.out.println("The order of your numbers from lowest to highest is: " + c +" " +  a +" " +  b);
			else 
				System.out.println("The order of your numbers from lowest to highest is: " + c +" " +  b +" " +  a);
		}
	input.close();
	}

}
