class XworkZRunner{
     public static void main(String args[])
     {
	 
	 boolean isCreated=Xworkz.createAccount("pinkiii","N",20,"pinki@gmail.com ",null);
	
	 if(isCreated==true){
     Xworkz.readAccount(); 	 
	 }else{
	 System.out.println("Enter the valid details");
	 }
	 }
}