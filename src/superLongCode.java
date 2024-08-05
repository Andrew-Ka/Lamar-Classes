/*
Andrew Kalathra
COSC 2336-01
Instructor: Dr. Jiangjiang Liu
Programming Assignment 5
Due:  10/10/22
This program will be able to give the location of
a substring in a string, both entered by the user
*/
import java.util.Scanner;
public class superLongCode {
	//public char[][] needCheck;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string s1: ");
		String s1 = input.next();
		System.out.print("Enter a string s2: ");
		String s2 = input.next();
		//int s2Length = s2.length();
		//int wordsInS1 = wordCount(s1);
		//String[] splitS1 = s1.split("\\s+");
		// char [][] 
		//needCheck = new char [wordsInS1][];
		//char [][] checkList = s1Arrays(splitS1, wordsInS1, s2Length);
		int j=0;
		int pos =0;
		//boolean result;
		if(s1.contains(s2)== true) {
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)== s2.charAt(j)) {
					j++;
					pos++;
					System.out.println(j);
				}else {
					j=0;
					pos++;
				}
				if(j == s2.length()){
					System.out.println("matched at index " + (pos-s2.length()));
					break;
				}/*else {
					System.out.println("unmatched");
				}*/
			}
		}else {
			System.out.println("unmatched");
		}
		input.close();
	}
	/*public static int wordCount(String s1) {
		char space = ' ';
		int count=0;
		
		for(int i = 0;i<s1.length();i++) {
			if(s1.charAt(i)==space) {
				count++;
			}
		}
		return count;
		
		//s1.getChars(0, 0, null, 0);
		/*for(int i=0; i<s1.length();i++) {
			pen[i]=s1.charAt(i);
		}
	}
	public static char[][] s1Arrays(String[] words, int wordAmount, int s2) {
		//if(words[])
		char[][] needCheck = new char [wordAmount][];
		int counter=0;
		for(int i = 0; i< wordAmount+1;i++) {
			if(s2>=words[i].length()) {
				for(int j = 0; j<words[i].length();j++) {
					needCheck[counter][j]= words[i].charAt(j);
				}
				counter++;
			}
		}
		return needCheck;
		int s2Length = s2.length(); 
		if(wordAmount>-1) {
			
		}
	}
	public static void Checker(char[][] list, String s2) {
		//int length = s2.length();
		char[] newS2 = s2.toCharArray();
		int rows = list.length;
		int columns = list[0].length;
		int index;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(newS2[i]==list[i][j]) {
					index = i;
				}
				
			}
			//if(s2[i]==list)
		}
	}*/
	

}
