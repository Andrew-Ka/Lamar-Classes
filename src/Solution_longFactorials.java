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
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
    	extraLongFactorials(n,BigInteger.valueOf(1));

    }
    public static void extraLongFactorials(int n, BigInteger c) {
    	if(n!=0) {
    		c = BigInteger.valueOf(n).multiply(c);
    		extraLongFactorials(n-1, c);
    	}
    	else {
    		System.out.println(c);
    	}
    }

}

public class Solution_longFactorials {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.extraLongFactorials(n);

        bufferedReader.close();
    }
}
