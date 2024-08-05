//**********************************
// COSC 1336 CS 1 Fundamentals
// Name: Andrew Kalathra
// Data: 10/7/2021
// display a list of characters between two specified characters
//**********************************

import java.util.Scanner;
public class charInBetween {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first character: ");
		char cha1 = input.next().charAt(0); 
		
		System.out.print("Enter the second character: ");
		char cha2 = input.next().charAt(0);
		
		System.out.print("Enter how many characters per line you want: ");
		int num = input.nextInt();
		
		
		System.out.println("Your first character was " + cha1 + " and your second character was " + cha2 + " while the characters per row was " + num);
		printChar(cha1, cha2, num);
		
		input.close();
	}

	public static void printChar(char ch1, char ch2, int numberPerLine) {
		for (; (ch1<ch2);) {
			for (int i = 0; (i < numberPerLine)&&(ch1<(ch2+1)); i++) {
				System.out.print(ch1 + " ");
				ch1++;
			}
			System.out.println();
		}
	}
}

