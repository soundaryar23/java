class HospitalRunner{
     public static void main(String args[])
     {
	 boolean isCreated=Hospital.registerPatient("abd","02/01/2000",0,"shri Ram","Shimoga",7892365789l);
	 if(isCreated==true){
	 Hospital.readPatient(); 
	 }else{
	 System.out.println("Enter the valid details");
	 }
	 }

}

 
