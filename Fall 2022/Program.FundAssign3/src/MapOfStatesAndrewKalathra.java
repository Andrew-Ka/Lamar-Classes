/*
Andrew Kalathra
COSC 2336-01
Instructor: Dr. Jiangjiang Liu
Programming Assignment 4
Due:  9/28/22
This program will be able to give the capital 
of any state the user inputs that is in the US
*/
import java.util.*;
public class MapOfStatesAndrewKalathra {

	public static void main(String[] args) {
		//just a HashMap of the States and their capitals
		//I will be using the states as keys
		
		HashMap<String, String> stateCapitalMap = new HashMap<String, String>();
		stateCapitalMap.put("Alabama", "Montgomery");
		stateCapitalMap.put("Alaska", "Juneau");
		stateCapitalMap.put("Arizona", "Phoenix");
		stateCapitalMap.put("Arkansas", "Little Rock");
		stateCapitalMap.put("California", "Sacramento");
		stateCapitalMap.put("Colorado", "Denver");
		stateCapitalMap.put("Connecticut", "Hartford");
		stateCapitalMap.put("Delaware", "Dover");
		stateCapitalMap.put("Florida", "Tallahassee");
		stateCapitalMap.put("Georgia", "Atlanta");
		stateCapitalMap.put("Hawaii", "Honolulu");
		stateCapitalMap.put("Idaho", "Boise");
		stateCapitalMap.put("Illinois", "Springfield");
		stateCapitalMap.put("Indiana", "Indianapolis");
		stateCapitalMap.put("Iowa", "Des Moines");
		stateCapitalMap.put("Kansas", "Topeka");
		stateCapitalMap.put("Kentucky", "Frankfort");
		stateCapitalMap.put("Louisiana", "Baton Rouge");
		stateCapitalMap.put("Maine", "Augusta");
		stateCapitalMap.put("Maryland", "Annapolis");
		stateCapitalMap.put("Massachusettes", "Boston");
		stateCapitalMap.put("Michigan", "Lansing");
		stateCapitalMap.put("Minnesota", "Saint Paul");
		stateCapitalMap.put("Mississippi", "Jackson");
		stateCapitalMap.put("Missouri", "Jefferson City");
		stateCapitalMap.put("Montana", "Helena");
		stateCapitalMap.put("Nebraska", "Lincoln");
		stateCapitalMap.put("Nevada", "Carson City");
		stateCapitalMap.put("New Hampshire", "Concord");
		stateCapitalMap.put("New Jersey", "Trenton");
		stateCapitalMap.put("New York", "Albany");
		stateCapitalMap.put("New Mexico", "Santa Fe");
		stateCapitalMap.put("North Carolina", "Raleigh");
		stateCapitalMap.put("North Dakota", "Bismark");
		stateCapitalMap.put("Ohio", "Columbus");
		stateCapitalMap.put("Oklahoma", "Oklahoma City");
		stateCapitalMap.put("Oregon", "Salem");
		stateCapitalMap.put("Pennslyvania", "Harrisburg");
		stateCapitalMap.put("Rhode Island", "Providence");
		stateCapitalMap.put("South Carolina", "Columbia");
		stateCapitalMap.put("South Dakota", "Pierre");
		stateCapitalMap.put("Tennessee", "Nashville");
		stateCapitalMap.put("Texas", "Austin");
		stateCapitalMap.put("Utah", "Salt Lake City");
		stateCapitalMap.put("Vermont", "Montpelier");
		stateCapitalMap.put("Virginia", "Richmond");
		stateCapitalMap.put("Washington", "Olympia");
		stateCapitalMap.put("West Virginia", "Charleston");
		stateCapitalMap.put("Wisconsin", "Madison");
		stateCapitalMap.put("Wyoming", "Cheyenne");

		//take in the user's input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a State: ");
		String state = input.next();
		//need to check if input is actually a state
		if ((stateCapitalMap.containsKey(state)) == true) {
			//if it is a state, get the capital
			System.out.println(stateCapitalMap.get(state));
		} else {
			//if it is not a state, print the line below
			System.out.println("No such state");
		}
		input.close();
	}
}
