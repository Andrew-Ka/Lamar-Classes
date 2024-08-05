import java.util.Scanner;

/*
 * Camel Case is a naming style common in many programming languages. In Java, method and variable names typically start with a lowercase letter, with all subsequent words starting with a capital letter (example: startThread). Names of classes follow the same pattern, except that they start with a capital letter (example: BlueCar).

Your task is to write a program that creates or splits Camel Case variable, method, and class names.

Input Format

Each line of the input file will begin with an operation (S or C) followed by a semi-colon followed by M, C, or V followed by a semi-colon followed by the words you'll need to operate on.
The operation will either be S (split) or C (combine)
M indicates method, C indicates class, and V indicates variable
In the case of a split operation, the words will be a camel case method, class or variable name that you need to split into a space-delimited list of words starting with a lowercase letter.
In the case of a combine operation, the words will be a space-delimited list of words starting with lowercase letters that you need to combine into the appropriate camel case String. Methods should end with an empty set of parentheses to differentiate them from variable names.
Output Format

For each input line, your program should print either the space-delimited list of words (in the case of a split operation) or the appropriate camel case string (in the case of a combine operation).

S;M;plasticCup()

C;V;mobile phone

C;C;coffee machine

S;C;LargeSoftwareBook

C;M;white sheet of paper

S;V;pictureFrame

To:

plastic cup

mobilePhone

CoffeeMachine

large software book

whiteSheetOfPaper()

picture frame
*
*/
public class CamelCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String inCase = input.next();

		String result = "";
		if (inCase.startsWith("S")) {
			result = split(inCase.substring(2));
		} else {
			result = combine(inCase.substring(2));
		}
		System.out.println(result);

	}

	public static String split(String inCase) {
		/*
		System.out.println("split");
		if (inCase.charAt(0) == 'M') {// its M, method
			inCase = inCase.substring(2);
		} else if (inCase.charAt(0) == 'C') {// its C, class
			System.out.println("Class");
			inCase = (inCase.charAt(3) + ' ') + inCase.substring(3);
		} else {// its V, variable
			inCase = inCase.substring(2);
		}
		for (int i = 0; i < inCase.length(); i++) {
			if ((inCase.charAt(i) >= 65) && (inCase.charAt(i) <= 90)) {
				inCase = inCase.substring(0, i - 1) + ' ' + inCase.substring(i + 1);
			} else if (inCase.charAt(i) == 40) {
				inCase = inCase.substring(0, i - 1);
				//return inCase;
			} else {
				//return inCase;
			}
		}
		return inCase;*/
		inCase = inCase.substring(4);
		for(int i=0; i<inCase.length(); i++) {
			if((inCase.charAt(i) >= 65)&&(inCase.charAt(i)<=90)) {
				
			}
		}
	}

		
		
	public static String combine(String inCase) {
		return "hppelp";

	}

}
