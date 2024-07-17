class LoanApplication

{
	static long bankAccountNum;
	static String bName;
	static  int   cScore;
	static double rOfInterest;
	static String lType;
	public static boolean createLoanApplication(long bankAccountNumber, String bankName, int creditScore, double rateOfInterest, String loanType)
	{
		boolean isLoanApplicationCreated = false;
		boolean isbankAccountNum=false;
		boolean isBName=false;
		boolean isCScore=false;
		boolean isROfInterset=false;
		boolean isLType=false;
		if(bankAccountNumber > 0 ){
			bankAccountNum = bankAccountNumber;
			isbankAccountNum = true;
	
		}else{
			System.out.println("Provide valid bank account number");
			
		}
		
		if(bankName !=  null){
			bName = bankName;
			isBName = true;
			
		}else{
			System.out.println("Provide valid bank name");
			
			
		}
		if(creditScore > 0){
			cScore = creditScore;
			isCScore = true;
			
		}
		else{
			System.out.println("Provide valid credit score");
			
		}
		if(rateOfInterest > 0.0){
			rOfInterest = rateOfInterest;
			isROfInterset = true;
		}
		else{
			System.out.println("Provide valid credit score");
			return isCScore;
		}
		if(loanType != null){
			lType  = loanType;
			isLType = true;
			
		}else{
			System.out.println("Provide valid Loan Type");
			return isLType;
		}
		if(isBName && isCScore && isLType && isROfInterset && isbankAccountNum){
			isLoanApplicationCreated=true;
		}
		    
			return isLoanApplicationCreated;
	}
	
	public static void getLoanApplicationDetails(){
		System.out.println("Bank Account Number : "+bankAccountNum);
		System.out.println("Bank Name : "+bName);
		System.out.println("Bank Creditt Score: "+cScore);
		System.out.println("Loan rate of Interest : "+rOfInterest);
		System.out.println("Loan type : "+lType);
		
		
	}
	
		

}