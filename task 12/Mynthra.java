class Mynthra{
 static String accName;
 static int age;
 static String pwd;
 static long mblNUmber;
 static String fltr;
	
		public static boolean createMynthraAccount(String accountName, int ageOfAccountCreator, String passWord, long mobileNumber, String filters){
		boolean isMynthraAccountCreated = false;
		boolean isaccName = false;
		boolean isAccountHolderAge = false;
		boolean ispwd = false;
		boolean isMblNumber = false;
		boolean isFltr=false;
		if(accountName != null){
		accName = accountName;
		isaccName = true;
		
		}else{
		System.out.println("provide valid account name");
		return isaccName;
		}
		
		if(ageOfAccountCreator > 0){
		age = ageOfAccountCreator;
		isAccountHolderAge = true;
		
		}else{
		System.out.println("provide valid account name");
		return isAccountHolderAge;
		}
	  
	    if(passWord != null ){
		pwd = passWord;
		ispwd = true;
		
		}else{
		System.out.println("provide valid account name");
		return ispwd;
		}
		
		if( mobileNumber > 0 ){
		mblNUmber = mobileNumber;
		isMblNumber = true;
		
		}else{
		System.out.println("provide valid account name");
		return isMblNumber;
		}
		
		if( filters != null ){
		fltr = filters;
		isFltr = true;
		
		}else{
		System.out.println("provide valid account name");
		return isFltr;
		}
		
		    if(isAccountHolderAge && isFltr && isMblNumber && isaccName && ispwd){
			isMynthraAccountCreated=true;
			
		}  
			return isMynthraAccountCreated ;
	}
	  
	  
	  public static void getMynthra(){
		  System.out.println("The account name is :"+accName);
		  System.out.println("The age of account holder is :s :"+age);
		  System.out.println("The password is :"+pwd);
		  System.out.println("The mobile Number is :"+mblNUmber);
		  System.out.println("Applied filter is :"+fltr);
		  
		  return ;
	  }

}