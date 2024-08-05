//**********************************
// COSC 1336 CS 1 Lab
// Name: Andrew Kalathra
// Data: 9/27/2021
// show a list converting kilograms to pounds
//**********************************

import java.util.Scanner;
public class classGrades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//How many kids
		System.out.print("Enter the number of kids in your class: ");
		int numStudents = input.nextInt();
		double[] students = new double[numStudents];
		
		//grades for kids
		System.out.println("Enter " + numStudents + " scores: ");
		for (int i = 0; i < students.length; i++) {
			students[i] = input.nextDouble();
		}
		letterGrade(students);
		average(students);
		
		input.close();
		
	
	}
	
	
	public static void letterGrade(double[] args) {
		double best = args[0];
		for (int i = 1; i < args.length; i++) {
			if (best < args[i]) {
				best = args[i];
			}
		}
		
		String letter;
		for (int i = 0; i < args.length ; i++) {
			{
				if (args[i] >= best - 10) {
					letter = "A";
				}
				else if(args[i] >= best - 20) {
					letter = "B";
				}
				else if(args[i] >= best - 30) {
					letter = "C";
				}
				else if(args[i] >= best - 40) {
					letter = "D";
				}
				else {
					letter = "F";
				}
			}
			System.out.println("Student " + i + " had a grade of " + args[i] + " which was a " + letter);
			
		}
		
	}
	
	public static void average(double[] args) {
		double sum = 0.0;
		for (int i = 0; i < args.length; i++) {
			sum = args[i] + sum;
		}
		double average = sum / args.length;
		
		System.out.println("The average of the set was " + average);
		
		int aboveAvg = 0;
		int belowAvg = 0;
		for (int i = 0; i < args.length; i++) {
			if (args[i] >= average) {
				aboveAvg++;
			}
			else {
				belowAvg++;
			}
		}
		System.out.println(aboveAvg + " student(s) were above or were average.");
		System.out.println(belowAvg + " student(s) were below average");
	}

}
