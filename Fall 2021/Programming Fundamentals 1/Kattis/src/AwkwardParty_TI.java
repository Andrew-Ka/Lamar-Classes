import java.util.Scanner;

public class AwkwardParty_TI {
	
	public static void main (String [] args) {
		
		// Read in guest list
		Scanner input = new Scanner(System.in);
		int numGuests = input.nextInt();
		int [] guestList = new int [numGuests];
		for (int i = 0; i < numGuests; i++) {
			guestList[i] = input.nextInt();
		}
		
		// Figure out how many languages there are
		int maxLanguages = 0;
		for (int i = 0; i < numGuests; i++) {
			int language = guestList[i];
			if (language > maxLanguages) {
				maxLanguages = language;
			}
		}
		
		// Make a list called languageCount (1 through maxLanguages)
		int [] languageCount = new int [maxLanguages+1];
		for (int i = 0; i < numGuests; i++) {
			int language = guestList[i];
			languageCount[language]++;
		}
		
		/*// print the language counts
		for (int i = 1; i <= maxLanguages; i++) {
			System.out.printf("Language %d has a count of %d\n", i, languageCount[i]);
		}*/
		
		// For all language counts > 1, find minimum awkwardness level
		int [] minDist = new int [maxLanguages+1];
		for (int i = 0; i <= maxLanguages; i++) {
			minDist[i] = numGuests;
		}
		
		// For each language, test how many spaces between guests who speak same language
		for (int lang = 1; lang <= maxLanguages; lang++) {
			minDist[lang] = numGuests;
			int min = numGuests;
			if (languageCount[lang] > 1) {
				int count = 0;
				int marker1 = -1;
				int marker2 = -1;
				for (int guest = 0; guest < numGuests; guest++) {
					if (guestList[guest] == lang) {
						//System.out.printf("guestList[%d] = %d\n", guest, guestList[guest]);
						if (marker1 == -1) {
							marker1 = guest;
							//System.out.println("in marker1 loop");
						}
						else if (marker2 == -1) {
							marker2 = guest;
							count = marker2 - marker1;
							//System.out.println("in marker2 loop");
							if (count < min) {
								min = count;
								//System.out.println("In first else loop");
							}
						}
						else {
							marker1 = marker2;
							marker2 = guest;
							count = marker2 - marker1;
							if (count < min) {
								min = count;
								//System.out.println("In else loop");
							}							
						}
					}
				} // end for guest	
				minDist[lang] = min;
			}  // end if languageCount[lang] > 1
			//System.out.println(minDist[lang]);
			
		} // End for loop iterating through unique languages
		
		//Check through minDist[] array to see which language has minimum distance.  This is awkwardness level.
		int minAwk = numGuests;
		for (int lang = 1; lang <= maxLanguages; lang++) {
			if (minDist[lang] < minAwk) {
				minAwk = minDist[lang];
			}
		}
		System.out.println(minAwk);
	}
}