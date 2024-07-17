class AmazonRunner{
	
	public static void main(String myAmazon[]){
	 boolean isValidAccountCreated = Amazon.createAmazonAccount(null, 16, "sanAth@123", 9978561230L, "Spots items" );
	 if(isValidAccountCreated == true){
	 Amazon.getAmazon();
	 }else{
	 System.out.println("Enter the valid details");
    }
	}
}