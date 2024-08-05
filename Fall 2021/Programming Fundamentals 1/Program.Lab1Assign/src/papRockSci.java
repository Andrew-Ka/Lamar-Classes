//**********************************
// COSC 1336 CS 1 Lab
// Name: Andrew Kalathra
// Data: 9/15/2021
// Play Paper Rock Scissors 
//**********************************

import java.util.Scanner;

public class papRockSci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// Prompt to let the user input Scissor (0), rock(1), paper (2) .
		System.out.println("Do you think you could beat me in paper rock scissors? Enter 0 for scissors, 1 for rock, and 2 for paper.");
		int personPlay = input.nextInt();
		
		int computerPlay = (int)(Math.random()*3);
		System.out.println("My pick was " + computerPlay);
		
		//See who won. Use nested ifs instead of &&.
		if (personPlay == computerPlay) {
			System.out.println("It's a tie!");
		}else {
			if (personPlay == 0) {
				if (computerPlay == 1) {
					System.out.println("Rock beats scissors, I win");
				}else { 
					System.out. println("Scissors beat paper, you won");
				}
			}else if (personPlay == 1) {
				if (computerPlay == 0) {
					System.out.println("Rock beats scissors, you won");
				}else {
					System.out.println("Paper beats rock, I win");
				}
			}else {
				if (computerPlay == 0) {
					System.out.println("Scissors beats paper, I win");
				}else {
					System.out.println("Paper beats rock, you won");
				}
			}
		}
					
	input.close();	
		
		} 
		
	}
