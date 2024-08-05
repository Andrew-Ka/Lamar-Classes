//test the CD class
import java.util.Scanner;
public class testCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please type in the the price, number of songs, and the singer for the first CD:");
		double p1 = input.nextDouble();
		int n1 = input.nextInt();
		String s1 = input.nextLine();
		CD disk1 = new CD(p1, n1, s1);
		Object[] disk1Array = CDArray(disk1);
		
		System.out.println("Please type in the the price, number of songs, and the singer for the second CD:");
		double p2 = input.nextDouble();
		int n2 = input.nextInt();
		String s2 = input.nextLine();
		CD disk2 = new CD(p2, n2, s2);
		Object[] disk2Array = CDArray(disk2);
		
		Object[][] allCDArray = allArray(disk1Array, disk2Array);
		
		System.out.println("This is an array of the price, the number of songs, and the singer from both CD's:");
		for (int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print( allCDArray[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("The sum of all the textbooks is: " + totalCost(allCDArray));
	
	input.close();
	}
	
	public static Object[] CDArray(CD disk) {
		Object [] disks = new Object[3];
		
		for (int j=0; j < 3; j++) {
			if(j==0) {
				disks[j]= disk.getPrice();
			}else if(j==1){
				disks[j]=disk.getNumSongs();
			}else if (j==2) {
				disks[j]= disk.getSinger();
				}
			}
		return disks;
	}
	
	public static Object[][] allArray(Object [] CD1, Object [] CD2) {
		Object[][] big = new Object[2][3];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++){
				if (i==0) {
					big[i][j]= CD1[j];
				}
				if (i==1) {
					big[i][j]= CD2[j];
				}
				
			}
		}
		 return big;
	}
	
	public static Double totalCost(Object[][] allArray) {
		double cost = 0.0;
		for (int i = 0; i < 2; i++) {
			double x = (double)(allArray[i][0]);
			cost = cost + x;
		}
	
	return cost;
	}
}
