/**
 * Objective: Copy images and text
 * Algorithm: Description how to resolve the problem.
 *Input and Output:Output another file
 * Created by: Andrew Kalathra
 * Date:4/16/22
 * Version:1
 */

import java.io.*;
public class Copying {

	public static void main(String[] args) throws IOException {
		if (args.length !=2) {
			System.out.println("Usage: java Copying sourceFile targetFile");
			System.exit(0);
		}
		
		File sourceFile = new File(args[0]);
		
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[0] + " does not exist");
			System.exit(0);
		}
		
		File targetFile = new File(args[1]);
		if(targetFile.exists()) {
			System.out.println("Target File " + args[1] + " already exists");
			System.exit(0);
		}
		
		BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
		BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));
		
		int r;
		int numberOfBytesCopied = 0;
		
		while((r = input.read()) !=-1) {
			output.write((byte) r);
			numberOfBytesCopied++;
		}
		
		input.close();
		output.close();
		
		System.out.println(numberOfBytesCopied + " bytes copied");
	}

}
