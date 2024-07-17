class Factorial{
	
	public static int getFact(int factnum)
	{
	int fact =1;  //dummy value and it will updated 
	for(int num=1; num<=factnum; num++)
	{
	    fact= num* fact;

	}
		System.out.println("factorial is num " +fact);

	return fact ;

	}

}