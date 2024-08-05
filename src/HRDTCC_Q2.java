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

class Result6 {

	/*
	 * Complete the 'findTotalQuestions' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY questions as parameter.
	 */

	public static int findTotalQuestions(List<Integer> questions) {
		// Write your code here
		// List<Integer> ansArr = new ArrayList<Integer>();
		int ans = 0;
		while (questions.size() != 0) {

			int min[] = getMin(questions);
			ans += min[0];
			if (min[1] < questions.size() - 1) {
				questions.remove(min[1] + 1);
			}
			if (min[1] != 0) {
				questions.remove(min[1]);
				questions.remove(min[1] - 1);
			}
			// questions.remove(min[1]-1);

			// [7, 6, 4, 9, 10, 34, 56, 54]
			// S1: min=[4,2]
			// S2: ansArr=[4]
			// S3: remove 4
			// S4: remove 6
			// S5: remove 9
		}
		/*
		 * int ans = 0; for (int i = 0; i < ansArr.size(); i++) { ans +=
		 * ansArr.indexOf(i); }
		 */
		return ans;

	}

	public static int[] getMin(List<Integer> list) {
		int hold = list.get(0);
		int pos = 0;
		for (int i = 1; i < list.size(); i++) {
			if (hold > list.get(i)) {
				hold = list.get(i);
				pos = i;
			}
		}
		int[] temp = { hold, pos };
		return temp;

	}

}

public class HRDTCC_Q2 {
	public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * int questionsCount = Integer.parseInt(bufferedReader.readLine().trim());
		 * 
		 * List<Integer> questions = IntStream.range(0, questionsCount).mapToObj(i -> {
		 * try { return bufferedReader.readLine().replaceAll("\\s+$", ""); } catch
		 * (IOException ex) { throw new RuntimeException(ex); }
		 * }).map(String::trim).map(Integer::parseInt).collect(toList());
		 * 
		 * int result = Result6.findTotalQuestions(questions);
		 * 
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter array list");
		List<Integer> questions = new ArrayList<Integer>(8);
		for (int i = 0; i < 8; i++) {
			questions.set(i, input.nextInt());
		}
		int result = Result6.findTotalQuestions(questions);
		System.out.println(result);*/
	}
}
