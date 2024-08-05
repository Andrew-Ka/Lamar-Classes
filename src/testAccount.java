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

public class testAccount {

	public static void main(String[] args) {
		//from the assignment
		Account acc = new Account(1.5, 1122, 1000, "George");
		acc.deposit(30);
		acc.deposit(40);
		acc.deposit(50);

		acc.withdraw(5);
		acc.withdraw(4);
		acc.withdraw(2);

		
		
		System.out.println("Name: " + acc.getName());
		System.out.println("Annual Interest Rate: " + acc.getAnnualInterestRate());
		System.out.println("Balance: " + acc.getBalance());
		//I wanted a space between the transactions and the account details
		System.out.println();
		System.out.printf("%-35s%-15s%-15s%-15s\n", "Date", "Type", "Amount", "Balance");
		
		java.util.ArrayList list = acc.getTransactions();
		
		//for loop to see all transactions 
		for (int i=0; i<list.size(); i++) {
			Transaction t = (Transaction) list.get(i);
			System.out.printf("%-35s%-15s%-15s%-15s\n", t.getDate(), t.getType(), t.getAmount(), t.getBalance());
		}
	}
}
