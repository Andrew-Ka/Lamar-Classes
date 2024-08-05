import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ithPrimeNumberTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int i = input.nextInt();
		System.out.print("The " +i+ " prime number is " + ithPrimeNumber(i));
		List<Integer> ty = new ArrayList<Integer>();
		Stack<Integer> ty1 = new Stack<Integer>();
		ty.add(1);
		ty.add(2);
		ty.add(3);
		ty1.add(1);
		ty1.add(2);
		ty1.add(3);
		System.out.println();
		System.out.println(ty1.size());
		for(int z =0; z< ty.size();z++) {
			System.out.println();
			int hold = ty1.pop();
			System.out.print(hold + "      ");
			System.out.println(ty.get(z));
		}
		System.out.println(ty1);
		System.out.println(ty);
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
