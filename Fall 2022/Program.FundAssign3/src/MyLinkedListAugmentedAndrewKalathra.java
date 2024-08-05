/*
Andrew Kalathra
COSC 2336
Instructor: Dr. Jiangjiang Liu
Programming Assignment 7
Due: 10/19/22
This program test the 
*/
import java.util.LinkedList;
import java.util.Scanner;
public class MyLinkedListAugmentedAndrewKalathra {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//make a linked list
		LinkedList<String> original = new LinkedList<String>();
		
		//add the people to the list
		original.add("Mike");
		original.add("Jim");
		original.add("Alice");
		original.add("George");
		original.add("Stevie");
		original.add("Cheryl");
		original.add("George");
		original.add("Jane");
		original.add("Ella");
		original.add("Jenny");
		original.add("Kathy");
		original.add("Jane");
		
		//get user info
		System.out.println("Original list:");
		System.out.println(original);
		System.out.print("Enter a name: ");
		String name = input.next();
		System.out.print("Enter an index at which to store this name: ");
		int index = input.nextInt();
		
		original.add(index, name);
		
		//show the changes to the list
		System.out.println("Revised list: ");
		System.out.println(original);
		System.out.println("List contains " + name + ": " + original.contains(name));
		System.out.println("Item at index " + index + ": " + original.get(index));
		System.out.println("Index of " + original.get(index+1) + ": " + (index+1));
		System.out.println("Last index of " + original.get(index+1) + ": " + original.lastIndexOf(original.get(index+1)));

	}

}
