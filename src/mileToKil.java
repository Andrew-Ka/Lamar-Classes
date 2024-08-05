//**********************************
// COSC 1336 CS 1 Fund
// Name: Andrew Kalathra
// Data: 9/14/2021
// show a list converting miles to kilometers
//**********************************

public class mileToKil {

	public static void main(String[] args) {
		
		System.out.println("___________________________");
		System.out.println("Miles            Kilometers");
		for (int i=2; i < 201; i+=2) {
			 System.out.print(i);
			 
			 double j = i * 1.609;
			 System.out.printf("%24.3f", j);
			 System.out.println();
			
		}
	}

}
