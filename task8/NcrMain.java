class NcrMain{
	
	public static void main(String args[]){
		
        int denominator = Ncr.getNcr(8)/(Ncr.getNcr(3) * Ncr.getNcr(8 - 3));
	System.out.println("NCR is "+denominator);
	
	/*
		
		int numerator = Ncr.getNcr(8);
        int denominator = Ncr.getNcr(3) * Ncr.getNcr(8 - 3); //n=8 r=3

        int result= numerator / denominator;
	System.out.println("NCR is "+result); */
	}
	
}
