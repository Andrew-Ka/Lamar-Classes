/**
 * Objective: Track transactions using a modified account program
 * Algorithm: create a new variable that saves and tracks transactions
 * 			  and call it using a for loop
 *Input and Output: I:None
 *					O:Account transactions
 * Created by: Andrew Kalathra
 * Date: 2/4/22
 * Version: 1
 */
 
public class Transaction {

	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transaction(char type, double amount, double balance, String desc) {
		
		date = new java.util.Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = desc;
	}
//everything below was auto-made getter and setter methods 
	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
