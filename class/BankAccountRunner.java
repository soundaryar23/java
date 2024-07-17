class BankAccountRunner{
	public static void main(String []args){
		BankAccount.credit(10000);
		BankAccount.checkBalance();
		BankAccount.debit(5000000);
		BankAccount.checkBalance();
		BankAccount.credit(5000);
		BankAccount.checkBalance();
		BankAccount.credit(6300);
		BankAccount.checkBalance();
		BankAccount.credit(80);
		BankAccount.checkBalance();
		BankAccount.credit(0);
		BankAccount.checkBalance();
		BankAccount.debit(2000);
		BankAccount.checkBalance();
		
	}
	
	
	
	
}