//**********************************
// COSC 1336 CS 1
// Name: Andrew Kalathra
// Data: 9/08/2021
// guess if the program chose heads or tails
//**********************************

import java.util.Scanner;
import java.util.Random;

public class coinToss {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("I am going to toss a coin, try guessing if it was heads or tails!");
		System.out.println("Type 1 for heads and 0 for tails");
		
		
		System.out.print("Enter your guess: ");
		int guess = input.nextInt();
		
		Random coin = new Random();
		int flip = coin.nextInt(2);
		System.out.println("Coin has been flipped");
		
		if (guess > 1) {
			System.out.print("Please re-run and enter a value of 1 or 0");
		}
		
		else if (guess != flip) {
			if (flip == 1) {
				System.out.println("It was heads, your guess " + guess + " was incorrect, better luck next time!");
			}else {
				System.out.println("It was tails, your guess " + guess + " was incorrect, better luck next time!");
			}
		}	
		else {
			if (guess == flip && guess == 1) {
				System.out.println("It was heads, you guessed correctly!");
			}else if (guess == 0){
				System.out.println("It was tails, you guessed correctly!");
			}
		}	
			
		input.close();

	}

}
