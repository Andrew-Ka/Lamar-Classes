/**
 * Objective: Make and read a file, and then tell how many characters and words there are
 * Algorithm: Make a file with characters, then read it with scanner
 *Input and Output: Input a file, output amount of characters and words in the files
 * Created by: Andrew Kalathra
 * Date:2/13/21
 * Version:1
 */

import java.util.Scanner;
import java.io.*;
public class Exercise12_13 {

	public static void main(String[] args) throws Exception{
		
		//make a java doc so I don't have to pull a file
		//from my computer, but I can't check if file
		//has already been made
		File testDoc = new File("Welcome.java");
		//adding stuff to the document
		PrintWriter edit = new PrintWriter(testDoc);
		
		//entering many words into the file
		String w = "Words";
		edit.println("Welcome to Java");
		for(int i=0; i<5; i++) {
			for (int j=0; j<4; j++) {
				edit.printf("%-20s ", w);
			}
			edit.printf("%-20s %n", w);
		}
		edit.close();
		
		//making a scanner to read how many lines and characters there are
		Scanner input = new Scanner(testDoc);
		
		//making the variables
		int lines = 0;
		int words = 0;
		int characters = 0;
		
		//counting up the lines and characters 
		while(input.hasNext()) {
			lines++;
			//String term = input.next();
			String termLine = input.nextLine();
			characters += termLine.length();
		}
		//making a scanner to count the words
		Scanner justForWords = new Scanner(testDoc);
		//counting up the words
		while(justForWords.hasNext()) {
			words++;
			justForWords.next();
		}
		
		//closing the scanners
		justForWords.close();
		input.close();
		
		//printing out the information
		System.out.println("File " + testDoc.getName()+ " has:");
		System.out.println(characters + " characters");
		System.out.println(words + " words &");
		System.out.println(lines + " lines");
	}

}
