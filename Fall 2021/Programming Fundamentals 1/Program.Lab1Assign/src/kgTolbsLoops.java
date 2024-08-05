//**********************************
// COSC 1336 CS 1 Lab
// Name: Andrew Kalathra
// Data: 9/27/2021
// show a list converting kilograms to pounds
//**********************************


public class kgTolbsLoops {

	public static void main(String[] args) {
		
		//print title
		System.out.println("----------------------------");
		System.out.println("Kilograms           Pounds");
		System.out.println("----------------------------");
		
		int kg = 1;
		
		while (kg < 200) {
			double lbs = kg * 2.2;
			
			System.out.printf(kg + "%24.1f", lbs);
			System.out.println();
			kg += 2;
		}
		System.out.println("----------------------------");


			
	}

}
