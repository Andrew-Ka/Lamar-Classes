//**********************************
// COSC 1336 CS 1 Lab
// Name: Andrew Kalathra
// Data: 9/14/2021
// display a random month
//**********************************




public class randMonth {

	public static void main(String[] args) {
		
		int monthNum = (int)(Math.random() * 12 + 1);
		
		System.out.println("The random integer is " + monthNum);
		
		switch(monthNum) {
		case 1 :
			System.out.println("Your month was January. What's your New Years Resolution?");
			break;
		case 2 :
			System.out.println("Your month was Febuary. Don't forget your Valentine's day card!");
			break;
		case 3 :
			System.out.println("Your month was March. Enjoy the nice weather, spring is a a great season.");
			break;
		case 4 :
			System.out.println("Your month was April. Just remember, don't let don't let April fools sneak up on you!");
			break;
		case 5 :
			System.out.println("Your month was May. School's almost out, just hold on a little bit longer...");
			break;
		case 6 :
			System.out.println("Your month was June. Summer has started, any plans?");
			break;
		case 7:
			System.out.println("Your month was July. Make sure your wear some sun screen, it is hot out there!");
			break;
		case 8:
			System.out.println("Your month was August. It's back to school time!");
			break;
		case 9:
			System.out.println("Your month was September. How's school going?");
			break;
		case 10:
			System.out.println("Your month was October. Watch out for all the ghooosts!");
			break;
		case 11:
			System.out.println("Your month was November. What are you thankful for?");
			break;
		case 12:
			System.out.println("Your month was December. Are you on the naughty or nice list?");
			break;
		default:
			System.out.println("Invalid number/month, run again");
			break;
		}
		
			
		
	}

}
