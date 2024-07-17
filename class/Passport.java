class Passport{
	
	static String cprLoc;
	static int dcdloc;
	static String lastName;
	static String name;
	static String dateOfBirth;
	static String emailid;
	static boolean isLoginsame;
	static String  idLogin;
	static String pswrd;
	static String cnfrmPswrd;
	static String ques;
	static String ans;
	static String captchaa;
	
	
 public static boolean createPassport(String cprLocation, int dcdLocation,String sirName,String givenName,
	String dob,String email,boolean isEmailLoginSame,String loginid,String pwd, 
	String confirmPwd,String hintQues,String hintAns,String captcha)
	
	{
		boolean isAccountCreated=false;
		
		cprLoc=cprLocation;
		dcdloc=dcdLocation;
		lastName=sirName;
		name=givenName;
		dateOfBirth=dob;
		emailid=email;
		isLoginsame=isEmailLoginSame;
		idLogin=loginid;
		pswrd=pwd;
		cnfrmPswrd=confirmPwd;
		ques=hintQues;
		ans=hintAns;
		captchaa=captcha;
		
		return isAccountCreated;
		
	}
	
	public static void readPassport(){
		
		System.out.println("cpr Location is :"+cprLoc);
		System.out.println("dcd Location is :"+dcdloc);
		System.out.println("sirname is :"+lastName);
		System.out.println("Name :"+name);
		System.out.println("date of birth :"+dateOfBirth);
		System.out.println("emai :"+emailid);
		System.out.println("is email and login id are same "+isLoginsame);
		System.out.println("loginid is :"+idLogin);
		System.out.println("password :"+pswrd);
		System.out.println("confrim Password:"+cnfrmPswrd);
		System.out.println("hint Question :"+ques);
		System.out.println("hint answer is :"+ans);
		System.out.println("captcha is :"+captchaa);
		
		
	}
}
	
	
