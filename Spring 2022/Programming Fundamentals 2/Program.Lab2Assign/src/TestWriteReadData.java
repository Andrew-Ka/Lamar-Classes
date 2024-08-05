/**
 * Objective: Add to the scores sheed
 * Algorithm: Description how to resolve the problem.
 *Input and Output:Input more students and scores, output more
 * Created by: Andrew Kalathra
 * Date:2/13/21
 * Version:1
 */

import java.io.*;

public class TestWriteReadData extends WriteDataWithAutoClose{

	public static void main(String[] args) throws Exception{
		//WriteDataWithAutoClose iClass = new WriteDataWithAutoClose();
		//File file = new File("scores.txt");
		
		
		try (FileWriter moreStudents = new FileWriter("scores.txt", true);
			BufferedWriter b = new BufferedWriter(moreStudents);
			PrintWriter p = new PrintWriter(b);){
			
			p.print("John B Doe ");
			p.println(58);
			p.print("Oliver L Twist ");
			p.println(92);
			p.print("Red R Hood ");
			p.println(79);
		}catch (IOException i) {
            i.printStackTrace();
        }
	}
}
