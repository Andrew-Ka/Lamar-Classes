//**********************************
// COSC 1336 CS 1 Lab
// Name: Andrew Kalathra
// Data: 9/27/2021
// show a list converting kilograms to pounds
//**********************************

import java.util.Scanner;

public class arrayFun {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		
		double[] normalVal = new double[10];
		
		System.out.println("Enter 10 numbers (separated by spaces): ");
		
		for (int i = 0; i < 10; i++) {
			normalVal [i] = input.nextDouble();
		}
		input.close();
		reverse(normalVal);
		max(normalVal);
		min(normalVal);
		average(normalVal);
		
	}
	
	public static void min(double[] args) {
		double min = args[0];
		
		for(int i = 1; i < args.length; i++) {
			if (min > args[i]) {
				min = args[i]; 
			}else{}
		}
		System.out.println("The lowest value in your set was " + min);
	}
	public static void reverse(double[] args) {
		for (int i = 0; i < (args.length)/2; i++) {
			double temporary = args [i];
			args [i] = args[args.length-i-1];
			args[args.length-i-1] = temporary;	
		}
		System.out.println("The reverse of this set was :");
		for (double value : args)
		System.out.print(value + " ");
		System.out.println();
	}
	public static void max(double[] args) {
		double max = args[0];
		
		for(int i = 1; i < args.length; i++) {
			if (max < args[i]) {
				max = args[i]; 
			}else{}
		}
		System.out.println("The highest value in your set was " + max);
	}
	public static void average(double[] args) {
		double sum = 0.0;
		int j = 0;
		
		for (int i = 0; i< args.length -1 ; i++) {
			sum = sum + args[i];
		}
		System.out.println("The sum of the set was " + sum);
		double avg = sum / args.length;
		System.out.println("The average of the set was " + avg);
		for (int i = 0; i < args.length -1; i++) {
			if (args[i] > avg) {
				j++;
			}
		}
		System.out.println(j + " was the amount of numbers of set above the average");
	}
	
}
