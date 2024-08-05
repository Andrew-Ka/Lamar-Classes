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

class Result1 {

	/*
	 * Complete the 'waiter' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER_ARRAY number 2. INTEGER q
	 */

	public static List<Integer> waiter(List<Integer> number, int q) {
		//
		List<Integer> answer = new ArrayList<Integer>();
		Stack<Integer> A = new Stack<Integer>();
		Stack<Integer> B = new Stack<Integer>();
		for (int i = 0; i < number.size(); i++) {
			int hold = number.get(number.size()-i-1);
			if (hold % 2 == 0) {
				B.add(hold);
			} else {
				A.add(hold);
			}
		}
		while(!B.empty()) {
			answer.add(B.pop());
		}

		for (int i = 1; i < q; i++) {
			int iteration = ithPrimeNumber(i + 1);
			Stack<Integer> temp = new Stack<Integer>();
			while(!A.empty()) {
				int holdA = A.pop();
				if (holdA % iteration == 0) {
					B.add(holdA);
				}else {
					temp.add(holdA);
				}
			}
			while(!temp.empty()) {
				A.add(temp.pop());
			}
			/*A = temp;
			temp.clear();*/
			while(!B.empty()) {
				answer.add(B.pop());
			}

		}
		while(!A.empty()) {
			answer.add(A.pop());
		}
		return answer;

	}

	public static int ithPrimeNumber(int i) {
		if (i == 1) {
			return 2;
		} else {
			int count = 1;
			int m = 1;
			while (count != i) {
				m += 2;
				if (isPrime(m)) {
					count++;
				}
			}
			return m;
		}
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= (num / 2); i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
}

public class Solution_Waiter {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int q = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> number = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> result = Result1.waiter(number, q);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}
