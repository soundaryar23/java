class Bill{
	
	
	 int billId;
	String billIssuedDate;
	String billDueDate;
	boolean isBillPaid=false;
	
	public void billDetails(){
		System.out.println("Bill Id is "+billId);
		System.out.println("bill Issued date is "+billIssuedDate);
		System.out.println("Bill Due date is "+billDueDate);
		
	}
	
}