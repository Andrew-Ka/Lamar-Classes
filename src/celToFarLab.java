//**********************************
// COSC 1336 CS 1 Lab
// Name: Andrew Kalathra
// Data: 9/27/2021
// show a list converting kilograms to pounds
//**********************************

import java.util.Scanner;

public class celToFarLab {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double celsius;
		// converts form Celsius to Fahrenheit
		System.out.println("Please enter Celcius value");
		celsius = input.nextDouble();
		double farenheit = celsiusToFahrenheit(celsius);
		
		System.out.println(celsius + " Celsuius is " + farenheit + " Farenheit");
		
		System.out.print("Would you like to see a conversion list you can enter in? (yes or no) ");
		String answer = input.next();
			if ((answer.equals( "yes")) || (answer.equals("Yes"))) {
				list();
				
			}
			else {
				
			}
		
		input.close();
		
		}
	
	public static double celsiusToFahrenheit (double cel) {
		double farenheit = (cel * (9.0/5.0)) + 32.0;
		return farenheit;
		
	}
	public static void list() {
		System.out.println("**********************");
		System.out.println("Celsius     Fahrenheit");
		
		for (double cel = 41.0; cel > 30.0; cel--) {
			
			double fahr = celsiusToFahrenheit(cel);
			System.out.printf(cel + "%42.2f", fahr);
			System.out.println();
		}
	}
	
	}
	
