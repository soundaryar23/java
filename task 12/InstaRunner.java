class InstaRunner{
     public static void main(String args[])
     {
	 boolean isCreated=Instagram.createAccount(null,20,"shriyan@gmail.com",7892365789l,"SHriya@0q","SHriya@0q");
	 if(isCreated==true){
	 Instagram.readAccount(); 
	 }else{
	 System.out.println("Enter the valid details");
	 }
	 }

}

 
