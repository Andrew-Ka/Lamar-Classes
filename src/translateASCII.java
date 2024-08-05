//**********************************
// COSC 1336 CS 1 Fund
// Name: Andrew Kalathra
// Data: 9/14/2021
// display the character correlated to the number the user enters
//**********************************

import java.util.Scanner;

public class translateASCII {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the number you want to know for the specific ASCII character (from 0 to 127): ");
		int numAscii = input.nextInt();
		
		System.out.println("The integer " + numAscii + " is " + ((char)numAscii) + " in ASCII");
		
input.close();
	}

}
