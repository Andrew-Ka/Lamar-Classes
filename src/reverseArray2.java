import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class reverseArray2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list of integers: ");
		List<Integer> in = new LinkedList<Integer>();
		for(int i=0;i<3;i++) {
			in.set(i, input.nextInt());
		}
		
		System.out.println("This is the reverse list: ");
		List<Integer> reversed = reverse(in);
		for(int j = 0; j<in.size();j++) {
			System.out.print(reversed.get(j));
		}
		input.close();
	}
	public static List<Integer> reverse(List<Integer> a) {
		List<Integer> z = new LinkedList<>();
		int j = a.size();
		//= new List<Integer>();
		for(int i = 0; i<j;i++) {
			z.set(i, a.get(j-i));
			//z[i]=a[j-i];
		}
		return z;
		
	}


}
