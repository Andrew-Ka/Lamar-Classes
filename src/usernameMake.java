//**********************************
// COSC 1336 CS 1 Fund
// Name: Andrew Kalathra
// Data: 9/14/2021
// display the character correlated to the number the user enters
//**********************************

import java.util.Scanner;

public class usernameMake {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your first and last name below (seperated by a space):");
		String firstName = input.next();
		String lastName = input.next();
		
		int randNum = ((int)(Math.random() * 11));
		
		char firstInit = firstName.charAt(0);
		
		String username = (firstInit + lastName + randNum);
		System.out.println("Your username is " + username);
		
input.close();
	}

}
