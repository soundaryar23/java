class LoanApplicationRunner{
	public static void main(String application[]){
		boolean isLoanApllicationValid = LoanApplication.createLoanApplication(907894589744L, "canara", 0, 10.0, "personal loan" );
		if(isLoanApllicationValid == true){
				LoanApplication.getLoanApplicationDetails();
		}else{
		System.out.println("Enter valid Information");
		}
		
	}

}