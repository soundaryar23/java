 class Hospital{
	
	static String name;
	static String  dob;
	static String father;
	static int age;
	static String addr;
    static long adharNO;
	
public static boolean  registerPatient(String names,String dobirth, int ageis, String fatherName,String address,long adhar){

boolean isCreated=false;
boolean isNameValid=false;
boolean isAgeValid=false;
boolean isDobValid=false;
boolean isAddressValid=false;
boolean isFatherValid=false;
boolean isAdharValid=false;

if(names !=null){
     name=names;
	 isNameValid=true;

	 }else{
		 System.out.println("Please provide valid Name");
	 }
if  (age > 0){ 
	 age=ageis;
	 isAgeValid=true;

	 }
	 else{
		 System.out.println("Please provide valid age");
	 }
if(address != null){
 addr=address;
 isAddressValid=true;
	 } else{
		 System.out.println("Please provide valid address");
	 }
	 if(fatherName != null){
 father=fatherName;
 isFatherValid=true;
	 } else{
		 System.out.println("Please provide valid father Name");
	 }
if(dobirth != null){
 dob=dobirth;
  isDobValid=true;
	 } else{
		 System.out.println("Please provide valid date of birth");
	 }
 
 if(adhar > 0){
    adharNO=adhar;
	isAdharValid=true;

	 } else{
		 System.out.println("Please provide valid ADhar Number");
	 }
	 if (isNameValid && isAddressValid && isAdharValid && isAgeValid && isDobValid && isFatherValid){
	
	 isCreated=true;
	
}
if(isAddressValid && isAdharValid && isAgeValid && isDobValid && isFatherValid && isNameValid){
	
	isCreated=true;
}
return isCreated;
}
public static void readPatient(){
	
	
	System.out.println(" Name : "+name);
	System.out.println("Date of Birth :"+dob);
	System.out.println("Age :"+age);
	System.out.println("Father Name :"+father);
	System.out.println("Address:"+addr);
	System.out.println("Adhar Number :"+adharNO);
	
}



}