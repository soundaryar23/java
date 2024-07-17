class MynthraRunner{
	
	public static void main(String myMynthra[]){
	 boolean isAccountCreated = Mynthra.createMynthraAccount("sahithya", 0, "sahithya@123", 9978561230L, "make up items" );
	 if(isAccountCreated == true){
	 Mynthra.getMynthra();
	 }else{
	 System.out.println("Enter the valid details");
    }
	}
}