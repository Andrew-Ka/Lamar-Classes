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

class Result2 {

	/*
	 * Complete the 'equalStacks' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY h1 2. INTEGER_ARRAY h2 3. INTEGER_ARRAY h3
	 */

	public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
		Stack<Integer> s1 = new Stack<Integer>();
		s1 = stacker(h1);
		Stack<Integer> s2 = new Stack<Integer>();
		s2 = stacker(h2);
		Stack<Integer> s3 = new Stack<Integer>();
		s3 = stacker(h3);
		int height = 0;

		while (!s1.empty() && !s2.empty() && !s3.empty()) {
			int hs1 = s1.peek();
			int hs2 = s2.peek();
			int hs3 = s3.peek();

			if (hs1 == hs2 && hs2 == hs3) {
				height = hs1;
				break;
			} else if ((hs1 >= hs2) && (hs1 >= hs3)) {
				s1.pop();
			} else if ((hs2 >= hs1) && (hs2 >= hs3)) {
				s2.pop();
			} else if ((hs3 >= hs2) && (hs3 >= hs1)) {
				s3.pop();
			}
		}
		return height;
	}

	public static Stack<Integer> stacker(List<Integer> list) {
		Stack<Integer> stackOfAdditions = new Stack<Integer>();
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(list.size() - i - 1);
			stackOfAdditions.push(sum);
		}
		return stackOfAdditions;
	}
}

public class sameHeightStack_2 {
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

		int result = Result2.equalStacks(h1, h2, h3);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
