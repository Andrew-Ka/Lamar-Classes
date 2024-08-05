//**********************************
// COSC 1336 CS 1 Fund
// Name: Andrew Kalathra
// Data: 10/18/2021
// add multidimensional arrays
//**********************************

import java.util.Scanner;
public class addMultiArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Trying to add arrays?");
		System.out.println("Enter your first 3x3 matrix (separate by spaces):");
		
		int [][] first = new int[3][3];
		for (int row = 0; row < first.length; row++) {
			for (int col = 0; col < first[row].length; col++) {
				first[row][col] = input.nextInt();
			}
		}
		
		System.out.println("Enter your second 3x3 matrix: ");
		
		int [][] second = new int[3][3];
		for (int row = 0; row < second.length; row++) {
			for (int col = 0; col < second[row].length; col++) {
				second[row][col] = input.nextInt();
			}
		}
		
		System.out.println("Your first matrix was:");
		for (int row = 0; row < first.length; row++) {
			  for (int column = 0; column < first[row].length; column++) {
			    System.out.print(first[row][column] + " ");
			  }

			  System.out.println();
			} 
		System.out.println("Your second matrix was:");
		for (int row = 0; row < second.length; row++) {
			  for (int column = 0; column < second[row].length; column++) {
			    System.out.print(second[row][column] + " ");
			  }

			  System.out.println();
			} 
		addMatrix(first, second);
		input.close();
	}
	
	public static void addMatrix(int mat1[][], int mat2[][]) {
		int [][] mat3 = new int[3][3];
		
		for (int f = 0; f < mat3.length; f++) {
			for (int s = 0; s < mat3[f].length; s++) {
				mat3[f][s] = mat1[f][s] + mat2[f][s];
			}
		}
		System.out.println("Adding the matrix's resulted in this:");
		for (int row = 0; row < mat3.length; row++) {
			  for (int column = 0; column < mat3[row].length; column++) {
			    System.out.print(mat3[row][column] + " ");
			  }
			  System.out.println();
			} 
	}

}
