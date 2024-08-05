//**********************************
// COSC 1336 CS 1 Fundamentals
// Name: Andrew Kalathra
// Data: 11/8/2021
// arrange textbooks
//**********************************

public class textbook {
	private long ISBN;
	private String title;
	private double price;
	private int edition;
	private static int numberOfObjects=0;
	
	
	//default constructors
	textbook(){
		ISBN = 0;
		title = " ";
		price = 0;
		edition = 0;
	}
	textbook(long newISBN, String newTitle, double newPrice, int newEdition){
		if(newPrice >0){
			price = newPrice;
			ISBN = newISBN ;
			title= newTitle ;
			edition = newEdition;
			numberOfObjects++;
		} 
		else
			System.out.println("price can not be negative or zero");
		
	}
	public double getPrice() {
		return price;
	}
	public long getISBN() {
		return ISBN;
	}
	public String getTitle() {
		return title;
	}
	public int getEdition() {
		return edition;
	}
	public void setPrice(double newPrice) {
		if(newPrice > 0) {
			price=newPrice;
		}else {
			System.out.println("Price must be greater than 0.");
		}
	}
	public void setISBN(long newISBN) {
		int length = String.valueOf(newISBN).length();
		if(length > 9) {
			ISBN=newISBN;
		}else {
			System.out.println("ISBN number must have more than 9 numbers.");
		}
	}
	public void setTitle(String newTitle) {
		if(newTitle.length() > 1) {
			title=newTitle;
		}else {
			System.out.println("Title must have more than 1 characters.");
		}
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
}