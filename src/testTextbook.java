//**********************************
// COSC 1336 CS 1 Fundamentals
// Name: Andrew Kalathra
// Data: 11/8/2021
// test the textbook class
//**********************************
public class testTextbook {

	public static void main(String[] args) {
			
			
			textbook book1 = new textbook(9780134414232L, "Chemistry: The Central Science (MasteringChemistry)", 319.99, 14);
			textbook book2 = new textbook(9780134670942L, "Introduction to Java Programming and Data Structures, Comprehensive Version", 186.65, 11);
			textbook book3 = new textbook(9780134707310L, "Microbiology: An Introduction", 39.96, 13);
			
		 	System.out.printf("The title of book 1 is: " + "%58s %n",book1.getTitle());
			System.out.printf("%43s %n", book1.getEdition() + "th Edition" );
			System.out.printf("The ISBN number of book 1 is: " + "%14s %n",book1.getISBN());
			System.out.printf("The price of book 1 is: " + "%13s %n",book1.getPrice());
			System.out.println("__________________________________________________________");
			
			System.out.printf("The title of book 2 is: " + "%2s %n",book2.getTitle());
			System.out.printf("%43s %n", book2.getEdition() + "th Edition" );
			System.out.printf("The ISBN number of book 2 is: " + "%14s %n",book2.getISBN());
			System.out.printf("The price of book 2 is: " + "%13s %n",book2.getPrice());
			System.out.println("_________________________________________________________");
			
			System.out.printf("The title of book 3 is: " + "%36s %n",book3.getTitle());
			System.out.printf("%43s %n", book3.getEdition() + "th Edition" );
			System.out.printf("The ISBN number of book 3 is: " + "%14s %n",book3.getISBN());
			System.out.printf("The price of book 3 is: " + "%12s %n",book3.getPrice());
			System.out.println("_________________________________________________________");
			
			System.out.println("Textbook Title:                          Edition:    ISBN:                Price:");
			Object[] b1Array = textbookArray(book1);
			Object[] b2Array = textbookArray(book2);
			Object[] b3Array = textbookArray(book3);
			
			Object[][] allBooksArray = allBooks(b1Array, b2Array, b3Array);
			
			for (int i = 0; i < 3; i++) {
				for(int j = 0; j < 4; j++) {
					System.out.printf("%16s ", allBooksArray[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("The sum of all the textbooks is: " + totalCost(allBooksArray));

	}
	
	public static Object[] textbookArray(textbook book){
		Object [] textbooks = new Object [4];
		
		for (int j=0; j < 4; j++) {
			if(j==0) {
				String title = book.getTitle();
				if (title.length() > 29) {
					title = title.substring(0,29);
				}
				textbooks[j]= title;
			}else if(j==1){
				textbooks[j]=book.getEdition();
			}else if (j==2) {
				textbooks[j]=book.getISBN();
			}else {
				textbooks[j]=book.getPrice();
			}
		}
	return textbooks;
	}
	public static Object[][] allBooks(Object[] b1, Object[] b2, Object[] b3) {
		Object collect[][] = new Object[3][4];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++){
				if (i==0) {
					collect[i][j]= b1[j];
				}
				if (i==1) {
					collect[i][j]= b2[j];
				}
				if (i==2) {
					collect[i][j]= b3[j];
				}
				
			}
		}
		return collect;
	}
	public static Double totalCost(Object[][] allbooksArray) {
		
		double totalCost = 0.0;
		for (int i = 0; i < 3; i++) {
				double x = (double) (allbooksArray[i][3]);
				totalCost = totalCost + x;
		}
		return totalCost;
	}
}
