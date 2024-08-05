import java.util.Scanner;

public class tenkindsofpeople {
	private int row;
	private int column;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		int c = input.nextInt();
		int[][] map = new int[r][c];
		for (int m = 0; m < r; m++) {
			for (int n = 0; n < c; n++) {
				map[m][n] = input.nextInt();
			}
		}

		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			possible(input.nextInt() - 1, input.nextInt() - 1, input.nextInt() - 1, input.nextInt() - 1, map);
		}
	}

		// tester for map
		/*
		 * for(int i = 0; i<r; i++) { for(int j = 0; j<c; j++) {
		 * System.out.print(map[i][j] + " "); } System.out.println(); }
		 * }
		 */
		

	public static void possible(int r1, int c1, int r2, int c2, int[][] map) {
    	int origin = map[r1][c1];
    	int destination = map[r2][c2];
    	if(origin != destination) {
    		System.out.println("neither");
    	}
    }

	public static void pathFinder(int[][] map, int currentR1, int currentC1, int destinationR2, int destinationC2, int symbol) {
    	if((currentR1==destinationR2)&&(currentC1==destinationC2)) {
    		if(map[currentR1][currentC1]=='0') {
    			System.out.println("binary");
    		}else {
    			System.out.println("decimal");
    		}
    	}//else if
    }
}