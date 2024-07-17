class InstaGram{
	
	static String name;
	static String  password;
	static String email;
	static int age;
	static String cnfrm;
    static long number;
	
public static boolean  createAccount(String names, int ageis, String emailId,long phn,String pswrd,String confirm){
boolean isCreated=true;

 name=names;
 age=ageis;
 email=emailId;
 cnfrm=confirm;
 number=phn;
 password=pswrd;


return isCreated;
}
public static void readAccount(){
	
	
	System.out.println("Name : "+name);
	System.out.println("Age :"+age);
	System.out.println("Mobile NUmber  :"+number);
	System.out.println("email Address :"+email);
	System.out.println("password :"+password);
	System.out.println("confirm password:"+cnfrm);
	
}



}