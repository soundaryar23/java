class VoterId{
	
	static String name;
	static String  dob;
	static String father;
	static int age;
	static String addr;
    static long adharNO;
	
public static boolean  createVoter(String names,String dobirth, int ageis, String fatherName,String address,long adhar){
boolean isCreated=true;

 name=names;
 dob=dobirth;
 age=ageis;
 father=fatherName;
 addr=address;
 adharNO=adhar;


return isCreated;
}
public static void readVoter(){
	
	
	System.out.println(" Name : "+name);
	System.out.println("Date of Birth :"+dob);
	System.out.println("Age :"+age);
	System.out.println(" Father Name :"+father);
	System.out.println("Address:"+addr);
	System.out.println("Adhar Number :"+adharNO);
	
}



}