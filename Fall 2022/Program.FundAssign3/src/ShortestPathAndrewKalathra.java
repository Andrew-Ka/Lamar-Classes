
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShortestPathAndrewKalathra {
	public static void main(String args[]) throws FileNotFoundException {
		// user input for file, works with text files, all that is
		// needed to be entered is the file path, without quotation
		// marks
		Scanner input = new Scanner(System.in);
		System.out.println("Input a file (enter the path to the file: ");
		String graphPath = input.nextLine();
		File graphFile = new File(graphPath);

		// user input vertices
		System.out.print("Enter two vertices: ");
		int vert1 = input.nextInt();
		int vert2 = input.nextInt();
		input.close();

		System.out.println();

		// scanner to read the filw
		Scanner fileReader = new Scanner(graphFile);
		int vertices = Integer.valueOf(fileReader.nextLine());
		System.out.println("The number of vertices is " + vertices);

		ArrayList<WeightedEdge> edges = new ArrayList<>();
		ArrayList<Integer> verticesList = new ArrayList<>();

		// continuously read the whole file until all weighted edges are read
		String nextNumb = fileReader.next();
		while (fileReader.hasNext()) {

			int loc1 = Integer.valueOf((nextNumb).replace(",", ""));
			int loc2 = Integer.valueOf((fileReader.next()).replace(",", ""));
			int weight = Integer.valueOf((fileReader.next()));

			if (!verticesList.contains(loc1)) {
				verticesList.add(loc1);
			}
			if (!verticesList.contains(loc2)) {
				verticesList.add(loc2);
			}
			edges.add(new WeightedEdge(loc1, loc2, weight));
			edges.add(new WeightedEdge(loc2, loc1, weight));

			if (fileReader.hasNext()) {
				nextNumb = fileReader.next();
			}
			if (nextNumb.equals("|")) {
				// System.out.println("l1"); used this to check if pipe was read
				nextNumb = fileReader.next();
			}
		}
		fileReader.close();

		// I assume they are going to be out of order,
		// so just to double check might as well sort
		Collections.sort(verticesList);
		Collections.sort(edges);

		// this creates our weighted graph
		WeightedGraph<Integer> graph = new WeightedGraph<Integer>(verticesList, edges);
		graph.printWeightedEdges();

		// these will print the shortest path between vert1 and vert2
		if (vert1 > vert2) {
			graph.getShortestPath(vert2).printPath(vert1);
		} else if (vert2 > vert1) {
			graph.getShortestPath(vert1).printPath(vert2);
		} else {
			System.out.println("Cannot input same location");
		}

	}

}
