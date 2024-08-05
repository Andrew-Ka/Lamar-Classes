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

class Result {

	/*
	 * Complete the 'equalStacks' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY h1 2. INTEGER_ARRAY h2 3. INTEGER_ARRAY h3
	 */
	//this took too long, the pgrm quit, stacks is faster

	public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
		int sum1 = sum(h1);
		int sum2 = sum(h2);
		int sum3 = sum(h3);
		
		if ((sum1 == sum2)&&(sum2 == sum3)){  
			return sum1;
		}else if ((sum1 >= sum2) && (sum1 >= sum3)) {
			h1.remove(0);
			return equalStacks(h1, h2, h3);
		} else if ((sum2 >= sum1) && (sum2 >= sum3)) {
			h2.remove(0);
			return equalStacks(h1, h2, h3);
		} else { //((sum3 >= sum2) && (sum3 >= sum1))
			h3.remove(0);
			return equalStacks(h1, h2, h3);
		} 
	}

	public static int sum(List<Integer> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}
		return sum;
	}

}

public class sameHeightStack_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n1 = Integer.parseInt(firstMultipleInput[0]);

		int n2 = Integer.parseInt(firstMultipleInput[1]);

		int n3 = Integer.parseInt(firstMultipleInput[2]);

		List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = Result.equalStacks(h1, h2, h3);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
