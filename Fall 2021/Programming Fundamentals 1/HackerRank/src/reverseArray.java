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

public class reverseArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list of integers: ");
		List<Integer> in = new LinkedList<Integer>();
		for(int i=0;i<3;i++) {
			in.add(i, input.nextInt());
		}
		
		System.out.println("This is the reverse list: ");
		List<Integer> reversed = reverse(in);
		for(int j = 0; j<3;j++) {
			System.out.print(reversed.get(j) + " ");
		}
		input.close();
	}
	public static List<Integer> reverse(List<Integer> a) {
		List<Integer> z = new LinkedList<>();
		int j = a.size();
		for(int i=0; i<j;i++) {
			z.add(i, a.get(j-i-1));
			//z[i]=a[j-i];
		}
		return z;
		
	}
	 

}
