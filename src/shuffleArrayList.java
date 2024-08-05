import java.util.ArrayList;
import java.util.*;

public class shuffleArrayList {
	public static void main(String[] args) {
		//list to store numbers
		ArrayList<Integer> normNumbs = new ArrayList<>();
			
		// adding 5 numbers in order
		normNumbs.add(10);
		normNumbs.add(20);
		normNumbs.add(30);
		normNumbs.add(40);
		normNumbs.add(50);
		
		System.out.println("Original list: " + normNumbs.toString());
		
		ArrayList<Integer> randNumbs = new ArrayList<>(randomList(normNumbs));
		
		//Collections.shuffle(normNumbs);
		System.out.println("Random list: " + randNumbs.toString());
		
	}
	
	public static ArrayList<Integer> randomList(ArrayList<Integer> list) {
	
		Collections.shuffle(list);
		return list;			
		
	}

}
