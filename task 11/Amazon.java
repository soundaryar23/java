class Amazon{
	
	static String name;
	static String  password;
	static String email;
	static int age;
	static String addr;
    static long number;
	
public static boolean  createAccount(String names, int ageis, String emailId,String address,long phn,String pswrd){
boolean isCreated=true;
boolean isNameValid=false;
boolean isAgeValid=false;
boolean isEmailValid=false;
boolean isAddressValid=false;
boolean isPasswordValid=false;
boolean isPhoneValid=false;

if(names !=null){
     name=names;
	 isNameValid=true;
	 }else{
		 System.out.println("Please provide valid Name");
	 }
	 if  (age <= 0){ 
	 age=ageis;
	 isAgeValid=true;
	 }
	 else{
		 System.out.println("Please provide valid age");
	 }
	 if(email != null){
 email=emailId;
	 isEmailValid=true;
	 } else{
		 System.out.println("Please provide valid email Id");
	 }
	 if(confirm !=null){
     addr=address;
	 isAddressValid=true;
	 } else{
		 System.out.println("Please provide valid confirm password");
	 }
	 if(phn <=0){
    number=phn;
	isPhoneValid=true;
	 } else{
		 System.out.println("Please provide valid phone Number");
	 }
  if(pswrd !=null){
  password=pswrd;
	 isPasswordValid=true;
	 } else{
		 System.out.println("Please provide valid  password");
	 }
	 if(isEmailValid && isNameValid && isAgeValid && isconfirmValid && isPasswordValid && isPhoneValid){
		 isCreated=true;
	 }
 

return isCreated;
}
public static void readAccount(){
	System.out.println("Name : "+name);
	System.out.println("Age :"+age);
	System.out.println("Mobile NUmber  :"+number);
	System.out.println("email Address :"+email);
	System.out.println("Address:"+addr);
	System.out.println("password :"+password);
	
}

}