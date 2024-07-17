class BankAccount{
	static double balance;
	
	public static  double debit(double amount){
		if(amount <= balance) {
		balance=balance - amount;
		System.out.println("Amount debited successfully");
		System.out.println("balance is : "+balance);
		}
		else
		{
			System.out.println("insufficient amount");
			
		}
		
	return balance;	
	}
	
	public static double credit(double amount){
		
		if(amount > 0){
		
		balance=balance+amount;
		System.out.println("Amount credited successfully");

				System.out.println("balance is : "+balance);
		}
		else{
		 System.out.println("amount con't be zero");
		}
				
	return balance;	

	}
	
	public static void checkBalance(){
		
		
		System.out.println("Total amount available : "+balance);
	}
	
	
}