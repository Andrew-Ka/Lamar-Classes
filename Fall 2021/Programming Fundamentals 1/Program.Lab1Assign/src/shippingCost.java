//**********************************
// COSC 1336 CS 1 Lab
// Name: Andrew Kalathra
// Data: 9/14/2021
// compute the cost of shipment based on weight
//**********************************

import java.util.Scanner;

public class shippingCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input the weight of the package (in pounds): ");
		double weight = input.nextDouble();
		System.out.print("Please input the price of the product (in dollars): ");
		double price = input.nextDouble();
		
		double shipprice = 0;
		
		if (weight <= 0) {
			System.out.println("Please enter higher weight than 0 lbs.");
		}else if (weight <= 1) {
			System.out.println("Your shipping cost for " + weight + " lbs is 3.5.");
			shipprice = 3.5;
		}else if (weight <= 3) {
			System.out.println("Your shipping cost for " + weight + " lbs is 5.5.");
			shipprice = 5.5;
		}else if (weight <= 10) {
			System.out.println("Your shipping cost for " + weight + " lbs is 8.5.");
			shipprice = 8.5;
		}else if (weight <= 20) {
			System.out.println("Your shipping cost for " + weight + " lbs is 10.5.");
			shipprice = 10.5;
		}else if (weight > 20) {
			System.out.println("Your package cannot be shipped, it is too heavy, enter weight below 20 lbs.");
		}
		
		double totamount = price + shipprice ;
		
		System.out.println("The total amount in dollars for the weight of " + weight + " lbs is " + totamount);
		
		
input.close();

		}
}

