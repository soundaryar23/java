class AdharCard{
	
	static String lName;
	static String  fName;
	static String addr;
	static int age;
	static long number;
	static boolean isCreatedAC;

public static boolean  createAdhar(String firstName,String lastName, int ageis, String address,long phoneNumber,
   boolean notARobot){
boolean isCreated=false;

  if(firstName !=null && phoneNumber >=0 && address !=null && lastName != null &&  ageis >=0){

 lName=lastName;
 fName=firstName;
 age=ageis;	
 number=phoneNumber;
 isCreatedAC=isCreated;
 addr=address;
 isCreated=true;
  }
  else{
	  
	  System.out.println("give proper deatils");
	  
  }
return isCreated;
}
public static void readAdhar(){
	
	System.out.println("First Name : "+fName);
	System.out.println("Last Name :"+lName);
	System.out.println("AGe :"+age);
	System.out.println("Address :"+addr);
	System.out.println("Phone Number :"+number);
	System.out.println("Account created :"+isCreatedAC);
	
}



}