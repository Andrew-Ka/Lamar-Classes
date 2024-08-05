/**
 * Objective: Make a txt doc called scores with a few scores 
 * Algorithm: Description how to resolve the problem.
 *Input and Output: Input people and scores, output a txt doc
 * Created by: Andrew Kalathra
 * Date:2/13/21
 * Version:1
 */

public class WriteDataWithAutoClose{

	public static void main(String[] args) throws Exception {
		java.io.File file = new java.io.File("scores.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}

		try (
				// Create a file
				java.io.PrintWriter output = new java.io.PrintWriter(file);) 
		{
			// Write formatted output to the file
			output.print("John T Smith ");
			output.println(90);
			output.print("Eric K Jones ");
			output.println(85);
		}
	}
}
