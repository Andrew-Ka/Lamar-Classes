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
     * Complete the 'maxSubarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> maxSubarray(List<Integer> arr) {
    	int subarray = subArray(arr);
    	int subsequence = 0;
    	//subsequence
    	for(int i = 0; i<arr.size();i++) {
    		if(arr.get(i)>0) {
    			subsequence = arr.get(i)+ subsequence;
    		}
    	}
    	return Arrays.asList(subarray,subsequence);

    }
    public static int subArray(List<Integer> arr) {
    	int maxVal = 0;
    	int lftVal=0;
    	int rhtVal=0;
    	for(int i =0; i < arr.size();i++) {
    		maxVal = maxVal + arr.get(i);
    	}
    	int min = arr.get(0);
    	int minPos = 0;
    	for(int i = 1; i < arr.size();i++) {
    		if(min>arr.get(i)) {
    			min = arr.get(i);
    			minPos = i;
    		}
    	}
    	if(minPos == (arr.size()-1)) {
    		for(int i = 0; i<minPos; i++) {
    			lftVal = lftVal + arr.get(i);
    		}
    	}else if (minPos == 0) {
    		for(int i = 1; i < arr.size();i++) {
    			rhtVal = rhtVal + arr.get(i);
    		}
    	}else {
    		for(int i = 0; i < minPos; i++) {
    			lftVal = lftVal + arr.get(i);
    		}
    		for(int i = (minPos +1) ;i < arr.size();i++) {
    			rhtVal = rhtVal + arr.get(i);
    		}
    	}
    	
    	if((maxVal > lftVal) && (maxVal > rhtVal)) {
    		return maxVal;
    	}else if ((lftVal > maxVal)&&(lftVal>rhtVal)) {
    		return subArray(arr.subList(0, (minPos)));
    	}else if ((rhtVal > maxVal)&&(rhtVal>lftVal)){
    		return subArray(arr.subList((minPos+1),(arr.size())));
    	}//if((maxVal > lftVal) &&(maxVal > rhtVal)) 
    	else {
    		return maxVal;
    	}
    }

}

public class Solution_maxSubArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> result = Result2.maxSubarray(arr);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
