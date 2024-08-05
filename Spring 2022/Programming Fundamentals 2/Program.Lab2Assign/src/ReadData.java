/**
 * Objective: Read the txt doc
 * Algorithm: Description how to resolve the problem.
 *Input and Output:Input a txt doc, output what it says
 * Created by: Andrew Kalathra
 * Date:2/13/21
 * Version:1
 */

import java.util.Scanner;

public class ReadData {
	public static void main(String[] args) throws Exception {
		// Create a File instance
		java.io.File file = new java.io.File("scores.txt");

		// Create a Scanner for the file
		Scanner input = new Scanner(file);

		// Read data from a file
		while (input.hasNext()) {
			String firstName = input.next();
			String mi = input.next();
			String lastName = input.next();
			int score = input.nextInt();
			System.out.println(firstName + " " + mi + " " + lastName + " " + score);
		}

		// Close the file
		input.close();
	}
}