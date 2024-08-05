import java.util.Scanner;
public class PrimeNumbs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("The x'th prime number where x is: ");
		int index = input.nextInt();
		//System.out.println();
		long answer = prime(index, 1);
		System.out.println("The #"+ index+" prime number is "+ answer);
		
	}
	static int prime(int i, int primeNumb) {
		if((i == 1) && (primeNumb == 1)) {
			return 2;
		}else if(i==1){
			return primeNumb;
		}else if((i==2) && (primeNumb == 1)){
			return 3;
		}else {
			primeNumb += 2;
			//int hold = primeNumb/2; //only int, no remainder
			while(1==1) {
				if(((primeNumb % 3) == 0) && (primeNumb != 3)) {
					primeNumb += 2;
				}else if(((primeNumb % 5) == 0) && (primeNumb != 5)) {
					primeNumb += 2;
				}else if (((primeNumb % 7) == 0) && (primeNumb != 7)){
					primeNumb += 2;
				}else {//this is prime
					break;
				}
			}
			return prime(i-1, primeNumb);
		}
	}

}
