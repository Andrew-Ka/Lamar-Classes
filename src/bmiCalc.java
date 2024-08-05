//**********************************
// COSC 1336 CS 1
// Name: Andrew Kalathra
// Data: 9/01/2021
// Calculate BMI (Body Mass Index)
//**********************************

import java.util.Scanner;

public class bmiCalc {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double mass = 0.0;
		double heightmeters = 0.0;
		
		
		System.out.print("Do you know your weight in kg? (answer in true or false) ");
		boolean a = input.nextBoolean();
			if (a == true) {
				System.out.print("Enter your mass in kg: ");
				mass = input.nextDouble();
			}else {
				double weight = 0.0;
				System.out.print("Enter your weight in lbs: ");
				weight = input.nextDouble();
				mass = weight * 0.4536;
				System.out.println("Your mass in kg is " + mass);
			}
			
		System.out.print("Do you know you height in meters? (answer in true or false) ");
		boolean b = input.nextBoolean();
			if (b == true) {
				System.out.print("Enter you height in meters: ");
				heightmeters = input.nextDouble();
			}else {
				double heightfeet = 0.0;
				System.out.print("Enter your height in feet: ");
				heightfeet = input.nextDouble();
				heightmeters = heightfeet / 3.281;
				System.out.println("Your height in meters is " + heightmeters);
			}
			
		double BMI = 0.0;
		BMI = mass / (heightmeters * heightmeters);
		System.out.println("You BMI is : " + BMI);
		input.close();
	}

}
