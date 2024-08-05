/*
Andrew Kalathra
COSC 2336-01
Instructor: Dr. Jiangjiang Liu
Programming Assignment 3
Due: 9/21/22
Description: This code will take in values to run the EvaluateExpressionAndrewKalathra program
*/
import java.util.Scanner;
public class TestEvaluateExpressionAndrewKalathra{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input an expression to be evaluated: ");
		String in = input.next();
		String[] inArr = new String[1];
		inArr[0]= in;
		EvaluateExpressionAndrewKalathra.main(inArr);
		input.close();
	}

}
