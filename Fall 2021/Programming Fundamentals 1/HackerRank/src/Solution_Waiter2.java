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

class Result_2 {

	/*
	 * Complete the 'waiter' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER_ARRAY number 2. INTEGER q
	 */

	public static List<Integer> waiter(List<Integer> number, int q) {
		//
		/*
		 * int[] ithPrimeNumber = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
		 * 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127,
		 * 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199,
		 * 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283,
		 * 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383,
		 * 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467,
		 * 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577,
		 * 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661,
		 * 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769,
		 * 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877,
		 * 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983,
		 * 991, 997, 1009, 1013, 1019, 1021, 1031, 1033, 1039, 1049, 1051, 1061, 1063,
		 * 1069, 1087, 1091, 1093, 1097, 1103, 1109, 1117, 1123, 1129, 1151, 1153, 1163,
		 * 1171, 1181, 1187, 1193};
		 */
		int init_prime = 2;
		List<Integer> answer = new ArrayList<>();
		List<Integer> A = new ArrayList<>();
		List<Integer> B = new ArrayList<>();
		while (q > 0) {
			for (int i = number.size() - 1; i >= 0; i--) {
				if (number.get(i) % init_prime == 0) {
					B.add(number.get(i));
				} else {
					A.add(number.get(i));
				}
			}
			number = A;
			A.clear();

			for (int i = B.size() - 1; i >= 0; i--) {
				answer.add(B.get(i));
			}
			B = new ArrayList<>();
			init_prime = primeCal(init_prime);
			q--;
		}
		System.out.println(number);
		if (number.size() > 0) {
			for (int i = number.size() - 1; i >= 0; i--) {
				answer.add(number.get(i));
			}
		}
		return answer;

	}

	private static int primeCal(int prime) {
		prime++;
		for (int i = 2; i < prime; i++) {
			if (prime % i == 0) {
				return primeCal(prime);
			}
		}
		return prime;
	}

	/*
	 * public static int ithPrimeNumber(int i) { if (i == 1) { return 2; } else {
	 * int count = 1; int m = 1; while (count != i) { m += 2; if (isPrime(m)) {
	 * count++; } } return m; } }
	 * 
	 * public static boolean isPrime(int num) { for (int i = 2; i <= (num / 2); i++)
	 * { if ((num % i) == 0) { return false; } } return true; }
	 */

}

public class Solution_Waiter2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int q = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> number = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> result = Result_2.waiter(number, q);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}
