/*
Andrew Kalathra
COSC 2336
Programming Assignment 11+12
Due:  11/28/22
This program finds the shortest path
between two points
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShortestPathsAndrewKalathraTry1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a file (enter the path to the file: ");
		String graphPath = input.nextLine();
		File graph = new File(graphPath);

		System.out.print("Enter two vertices: ");
		int vert1 = input.nextInt();
		int vert2 = input.nextInt();
		input.close();

		System.out.println();
		// System.out.println();

		Scanner fileReader = new Scanner(graph);
		int vertices = Integer.valueOf(fileReader.nextLine());
		int[][] graphArray = new int[vertices][vertices];

		String nextNumb = fileReader.next();
		while (fileReader.hasNext()) {

			int row = Integer.valueOf((nextNumb).replace(",", ""));
			int column = Integer.valueOf((fileReader.next()).replace(",", ""));
			graphArray[row][column] = Integer.valueOf((fileReader.next()));
			// String pipe = fileReader.next();
			// System.out.println(pipe);

			if (fileReader.hasNext()) {
				nextNumb = fileReader.next();
			}
			if (nextNumb.equals("|")) {
				// System.out.println("l1"); used this to check if pipe was read
				nextNumb = fileReader.next();
			}

		}
		for (int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				if (graphArray[i][j] == 0) {
					graphArray[i][j] = graphArray[j][i];
				} else if (graphArray[j][i] == 0) {
					graphArray[j][i] = graphArray[i][j];
				}
				System.out.print(graphArray[i][j] + "      ");
			}
			System.out.println();
		}

	}

}
