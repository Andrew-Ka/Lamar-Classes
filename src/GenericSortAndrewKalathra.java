/*
Andrew Kalathra
COSC 2336
Instructor: Dr. Jiangjiang Liu
Programming Assignment 2
Due: 9/14/22
This program will sort integers and strings entered by the user.
*/

import java.util.*;
import java.util.Scanner;
public class GenericSortAndrewKalathra {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//prompt user for integers
		System.out.print("Enter 10 integers: ");
		ArrayList<Integer> numbList = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			numbList.add(input.nextInt());
		}
		//sorting and printing integers
		sort(numbList);
		System.out.print("The sorted numbers are: ");
		printArray(numbList);
		//prompt user for strings
		System.out.print("Enter 5 Strings: ");
		ArrayList<String> words = new ArrayList<String>();
		for(int i=0;i<5;i++) {
			words.add(input.next());
		}
		//sorting and printing strings
		sort(words);
		System.out.print("The sorted strings are: ");
		printArray(words);
		
		input.close();
	}
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		//2 variables, one as index holder, 1 as actual 'thing'
		E currentMin;
		int indexMin;
		//this for loop will initially assign the the i value the minimum
		for(int i = 0; i < list.size()-1; i++) {
			currentMin = list.get(i);
			indexMin = i;
			
			//this for loop will keep track of the actual minimum
			for(int j=i+1;j<list.size();j++) {
				if(currentMin.compareTo(list.get(j))>0) {
					currentMin = list.get(j);
					indexMin = j;
				}
			}
			//this will actually put the minimum at that point in the correct spot
			if(indexMin != i) {
				list.set(indexMin,list.get(i));
				list.set(i, currentMin);
			}
		}
	}
	//this will print out the array
	public static <E> void printArray(ArrayList<E> list){
		for(int i = 0; i< list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
	}
}
