class Xworkz{
	
	static String lName;
	static String  fName;
	static String email;
	static int age;
	static String fatherName;
	

public static boolean  createAccount(String firstName,String lastName, int ageis, String emailId,String father){

boolean isCreated=false;
boolean isfNameValid=false;
boolean isLNameValid=false;
boolean isAgeValid=false;
boolean isEmailValid=false;
boolean isFatherValid=false;

if(firstName !=null){
     fName=firstName;
	 isfNameValid=true;

	 }else{
		 System.out.println("Please provide valid first  Name");
	 }
if(lastName !=null){
     lName=lastName;
	 isLNameValid=true;

	 }else{
		 System.out.println("Please provide valid last Name");
	 }
if  (age <= 0){ 
	 age=ageis;
	 isAgeValid=true;

	 }
	 else{
		 System.out.println("Please provide valid age");
	 }
if(father != null){
 fatherName=father;
 isFatherValid=true;
	 } else{
		 System.out.println("Please provide valid father Name");
	 }
if(emailId != null){
	email=emailId;

	 isEmailValid=true;
	 } else{
		 System.out.println("Please provide valid email Id");
	 }
	 
	 if(isAgeValid &&isEmailValid && isFatherValid && isLNameValid && isfNameValid){
		 
		 isCreated=true;
	 }
return isCreated;
}
public static void readAccount(){
	

	System.out.println("First Name : "+fName);
	System.out.println("Last Name :"+lName);
	System.out.println("Age :"+age);
	System.out.println("eamil Address :"+email);
	System.out.println("Father Name :"+fatherName);
	
}



}