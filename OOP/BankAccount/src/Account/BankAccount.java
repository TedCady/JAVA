package Account;

import java.util.Random;

public class BankAccount {
	String accountNumber;
	double checkingBalance;
	double savingsBalance;
	static int accountsCreated = 0;
	static double totalBalance;
	private String accountGenerator() {
		String acctNum = "";
		for(int i = 0; i < 10; i++) {
			int random = new Random().nextInt(9);
			acctNum += random;
		}
		
		accountsCreated ++;
		return acctNum;
	}
	
	public BankAccount() {
		accountNumber = accountGenerator();
		checkingBalance = 0;
		savingsBalance = 0;
	}
	
	public void checkChecking() {
		System.out.println("Checking balance " + this.checkingBalance);
	}
	 public void checkSavings() {
		 System.out.println("Savings balance " + this.savingsBalance);
	 }
	 
	 public void deposit(double amount, String account) {
		 if(account == "checking") {
			 this.checkingBalance += amount;
		 }else {
			 this.savingsBalance += amount;
		 }
		 totalBalance += amount;
		 System.out.println(amount + " deposited to account # " + this.accountNumber);
	 }
	 
	 public void withdrawl(double amount, String account) {
		 if(account == "checking") {
			 if(this.checkingBalance < amount) {
				 System.out.println("Not enought here to take out.");
			 }else {
				 this.checkingBalance -= amount;
			 }
		 }else {
			 if(this.savingsBalance < amount) {
				 System.out.println("No funds here either.");
			 }else {
				 this.savingsBalance -= amount;
			 }
		 }
		 totalBalance -= amount;
	 }
	 
	 public void userTotal() {
		 double total = this.checkingBalance + this.savingsBalance;
		 System.out.println("This is waht you have now: " + total);
	 }
	 
	 public void allTotal() {
		 System.out.println("Available in both accounts " + totalBalance);
	 }
}
