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

//this class holds all the variables and constructors/methods
class Account {
	public int id;
	public double balance;
	public static double annualInterestRate;
	public java.util.Date dateCreated;
	public String name;
	java.util.ArrayList transactions = new java.util.ArrayList();
	
	//this account constructor has no parameters
	public Account() {
		dateCreated = new java.util.Date();
	}
	
	//this account constructor has 2 parameters
	public Account(int newID, double newBalance) {
		id = newID;
		balance = newBalance;
		dateCreated = new java.util.Date();
	}
	
	//this account constructor has 3 parameters
	public Account(int newID, double newBalance, String name) {
		id = newID;
		balance = newBalance;
		this.name = name;
		dateCreated = new java.util.Date();
	}
	
	//this account constructor has 4 parameters
	public Account(double anInRt, int newID, double newBalance, String name) {
		annualInterestRate = anInRt;
		id = newID;
		balance = newBalance;
		this.name = name;
		dateCreated = new java.util.Date();
	}
	
	
	//these are all getter and setter methods
	public int getId() {
		return this.id;
	}
	public double getBalance() {
		return balance;
	}	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setId(int newId) {
		id = newId;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public static void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	public double getMonthlyInterest() {
		return balance = (annualInterestRate/1200);
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public java.util.ArrayList getTransactions() {
		return transactions;
	}
	public void setTransactions(java.util.ArrayList transactions) {
		this.transactions = transactions;
	}
	
	
	// this method subtracts the amount entered from the balance and 
	//sets that value as the new balance
	public void withdraw(double amount) {
		balance -= amount;
		transactions.add(new Transaction('W', amount, balance, " "));
	}
	
	// this method subtracts the amount entered from the balance and 
	//sets that value as the new balance
	public void deposit(double amount) {
		balance += amount;
		transactions.add(new Transaction('D', amount, balance, " "));
	}
	
	//this was from the video, but is not necessary here
	/*public static void main(String[] args) {
		Account acc = new Account(12, 100, "Micheal");
		acc.deposit(30);
		acc.deposit(80);
		acc.deposit(100);

		acc.withdraw(10);
		acc.withdraw(30);
		acc.withdraw(20);
		

		System.out.println("Name: " + acc.getName());
		System.out.println("Annual Interest Rate: " + acc.getAnnualInterestRate());
		System.out.println("Balance: " + acc.getBalance());
		
		System.out.printf("%-35s%-15s%-15s%-15s\n", "Date", "Type", "Amount", "Balance");
		
		java.util.ArrayList list = acc.getTransactions();
		
		for (int i=0; i<list.size(); i++) {
			Transaction t = (Transaction) list.get(i);
			System.out.printf("%-35s%-15s%-15s%-15s\n", t.getDate(), t.getType(), t.getAmount(), t.getBalance());
		}
	}*/

	
}
