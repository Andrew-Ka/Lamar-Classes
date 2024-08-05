//**********************************
// COSC 1336 CS 1 Lab
// Name: Andrew Kalathra
// Data: 11/1/2021
// add multidimensional arrays
//**********************************

import java.util.Scanner;
public class funArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double [][] user = new double[3][4];
		
		System.out.println("Enter a 3x4 Matrix Below:");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				user[i][j]= input.nextDouble();
			}
		}
		System.out.println("This was your matrix:");
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(user[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("Sum of the elements at column " + i + " is " + sumColumn(user,i));
		}
		System.out.println();
		for (int l = 0; l < 3; l++) {
			System.out.println("Sum of the elements at row " + l + " is " + sumRow(user, l));
		}
		input.close();
	}
	
	public static double sumRow(double[][] m, int rowIndex){
		double sum = m[rowIndex][0] + m[rowIndex][1] + m[rowIndex][2] + m[rowIndex][3];
		return sum;
	}
	public static double sumColumn(double [][] m, int columnIndex) {
		double sum = m[0][columnIndex] + m[1][columnIndex] + m[2][columnIndex];
		return sum;
	}

}
