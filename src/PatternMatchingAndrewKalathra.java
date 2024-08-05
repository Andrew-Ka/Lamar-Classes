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
public class PatternMatchingAndrewKalathra {
	//public char[][] needCheck;
	public static void main(String[] args) {
		//prompt user for s1 and s2
		Scanner input = new Scanner(System.in);
		//something new I figured out, I have to use
		//nextLine to include space, nice to know!
		System.out.print("Enter a string s1: ");
		String s1 = input.nextLine();
		
		System.out.print("Enter a string s2: ");
		String s2 = input.nextLine();
		
		//finding s2 in s1
		//j keeps track of if word was fully found in
		//s1, and pos keeps the position
		int j=0;
		int pos =0;
		//boolean result to check if s1 even has s2 
		if(s1.contains(s2)== true) {
			//for statement to stop searching past length
			//of s1
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)== s2.charAt(j)) {
					//check next letter and update position
					j++;
					pos++;
					//System.out.println(j);
					//I used this ^ to debug my code, it is
					//easier to see where things went wrong
				}else {
					//if full word not found, restart looking for
					//s2, but still update position
					j=0;
					pos++;
				}
				//break function to get out of for loop if 
				//s2 is fully found in s1
				if(j == s2.length()){
					System.out.println("matched at index " + (pos-s2.length()));
					break;
				}
			}
		}else {
			System.out.println("unmatched");
		}
		input.close();
	}
}
