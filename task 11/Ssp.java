class Ssp{
	
	static String name;
	static String  qualification;
	static String email;
	static int age;
	static String perc;
	static String fatherName;
	static boolean isEligibility;

public static boolean  createSsp(String sName,String studies, int ageis, String emailId,String father,String per,
   boolean isElegible ){
boolean isCreated=false;
if(sName != null && studies !=null && ageis >= 0 && emailId != null & father != null && per !=null && isElegible != false)
{
	name=sName;
 qualification=studies;
 age=ageis;
 email=emailId;
 perc=per;
 isEligibility=isElegible;
 fatherName=father;
}
else{
	
	System.out.println("give proper information");
}
	
return isCreated;
}
public static void readSsp(){
	
	System.out.println("Name : "+name);
	System.out.println("qualification :"+qualification);
	System.out.println("Age :"+age);
	System.out.println("eamil Address :"+email);
	System.out.println("Father Name :"+fatherName);
	System.out.println("TOtal Percentage"+perc);
	System.out.println("elegibility :"+isEligibility);
	
}



}