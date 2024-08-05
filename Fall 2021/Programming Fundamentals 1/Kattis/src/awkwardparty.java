import java.util.Scanner;
import java.util.ArrayList;
public class awkwardparty {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// my way is just find spacing of occurrence and print out highest numb
		int n = input.nextInt();
		
		ArrayList<Integer> awk = new ArrayList<Integer>(n);
		int[] diff = new int[n-1];
		
		int temp = 0;
		for(int i = 0; i<n; i++) {
			temp = input.nextInt();
			/*if(awk.contains(temp)) {
				
			}*/
			awk.add(temp);
			
		}
		
		
		for(int i = 0;i<n-1;i++) {
			int holder = awk.get(0);
			//System.out.println(holder);
			awk.remove(0);
			if(awk.contains(holder)) {
				diff[i]= awk.indexOf(holder)+1;
				//System.out.println(diff[i]);
			}else{
				diff[i]=0;
				//System.out.println(diff[i]);
			}
		}
		
		int awklvl = getLowest(diff);
		System.out.println("\n" + awklvl);
		
		input.close();
	}
	public static int getLowest(int[] array) {
		
		int max = 0;
		
		for(int i = 0; i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
			}
			if(max != 0) {
				break;
			}
		}
		int low = max;
		
		for(int j = 0;j<array.length;j++) {
			if((array[j] < low)&&(array[j]!=0)) {
				low = array[j];
				//System.out.println(low);
			}
		}
		if(low !=0) {
			return low;
		}else {
			return array.length + 1;
		}
		
	}
	

}
