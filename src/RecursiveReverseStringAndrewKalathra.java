/*
Andrew Kalathra
COSC 2336-01
Programming Assignment 1
Due:  9/2/2022
Submitted:  9/3/22
The program should be able to take in a string and reverse it.
*/

import java.util.Scanner;
public class RecursiveReverseStringAndrewKalathra {

	public static void main(String[] args) {
		//Make a scanner and ask for user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		
		//our variables for the reverseDisplay method
		String normal = input.next();
		int length = normal.length();
		int index = 0;
		
		//The main output line and calling the method
		System.out.print("The reversal of " + normal + " is " );
		reverseDisplay(normal, length, index);
		input.close();
	}
	public static void reverseDisplay(String word, int length, int index) {
		//base case is when the word length is 0
		if(length > 0){
			System.out.print(word.charAt(length-1));
			//recursion, call the method again, but with a substring of 1 less letter from 
			//the back, 1 less number of letters in integers, and 1 movement up of our index
			reverseDisplay(word.substring(0, word.length()-1), length-1, index+1);
		}
	}
	

}
