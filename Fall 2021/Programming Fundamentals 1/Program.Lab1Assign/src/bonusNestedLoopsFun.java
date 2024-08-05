//**********************************
// COSC 1336 CS 1 Fund
// Name: Andrew Kalathra
// Data: 9/27/2021
// show 3 patterns using nest loops
//**********************************
public class bonusNestedLoopsFun {

	public static void main(String[] args) {
		//first pattern
		System.out.println("Pattern 1:");
		for (int i = 1; i<5; i++) {
			System.out.println("*********");
		}
		//second pattern
		System.out.println("Pattern 2:");
		for (int k=1; k<6; k++) {
			for (int j = 0; j<k; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		//third pattern
		System.out.println("Patter 3:");
		for (int b = 6; b>0; b--) {
			for (int a = 1; a<b; a++) {
				System.out.print(a);
			}
		System.out.println();
		}
	}

}
