class PanCard{
	
	static String lName;
	static String  fName;
	static String email;
	static int age;
	static String fatherName;
	static boolean alreadyExist;

public static boolean  createPan(String firstName,String lastName, int ageis, String emailId,String father,
   boolean isExisted){
	   System.out.println("stated");

boolean isCreated=false;
if(firstName!=null && lastName!=null && ageis >=0 && eamilId !=null && father !=null )


 lName=lastName;
 fName=firstName;
 age=ageis;
 email=emailId;
 alreadyExist=isExisted;
 fatherName=father;
isCreated=true;
}
else{
System.out.println("invalid deatils");
}
	   System.out.println("ended");

return isCreated;
}
public static void readPan(){
	

	System.out.println("First Name : "+fName);
	System.out.println("Last Name :"+lName);
	System.out.println("Age :"+age);
	System.out.println("eamil Address :"+email);
	System.out.println("Father Name :"+fatherName);
	System.out.println("Account already existed :"+alreadyExist);
	
}



}