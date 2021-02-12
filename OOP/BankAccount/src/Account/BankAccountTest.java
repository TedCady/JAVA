package Account;

public class BankAccountTest extends BankAccount {
	
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		System.out.println(account1.accountNumber);
		BankAccount account2 = new BankAccount();
		System.out.println(account2.accountNumber);
		account1.deposit(2000, "checking");
		account2.deposit(5500.02, "savings");
		account1.withdrawl(275, "checking");
		account2.withdrawl(2700, "savings");
		account1.checkChecking();
		account2.checkSavings();
		
				
	}
}
