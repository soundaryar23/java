class CanaraBank{
	
	static String hName;
	static String  acType;
	static String email;
	static int age;
	static String addr;
    static long adharNO;
	
public static boolean  createAccount(String holderName,String acnt, int ageis, String emailId,String address,long adhar){
boolean isCreated=false;
 if( holderName != null && acnt != null && ageis >=0 && emailId != null && address != null & adhar >= 0){
 hName=holderName;
 acType=acnt;
 age=ageis;
 email=emailId;
 addr=address;
 adharNO=adhar;
 isCreated=true;
 }
 else{
	 
	 System.out.println("Define proper information");
 }

return isCreated;
}
public static void readAccount(){
	
	
	System.out.println("Holder Name : "+hName);
	System.out.println("account Type :"+acType);
	System.out.println("Age :"+age);
	System.out.println("eamil Address :"+email);
	System.out.println("Address:"+addr);
	System.out.println("Adhar Number :"+adharNO);
	
}



}