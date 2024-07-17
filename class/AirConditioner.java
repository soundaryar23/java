class AirConditioner{
  static boolean isConnected;
  static int currentTemperature  ; 
  static  int  minTemperature  ; 
  static int maxTemperature = 6; 
		
  
  public static void getConnected(){
	  System.out.println("getConnected is started");
	  
	  if(isConnected==false)
	  {
			 isConnected=true;
  	  System.out.println("AC turn on");	  
	  }
	  else if(isConnected=true){
		  
	  isConnected=false;
  	  System.out.println("AC turn off");

	  }
   return; 
  }
		public stat+ic void increaseTemperature(){
					 System.out.println("increaseTemperature() started");
				if(isConnected == true){	       
					 if(currentTemperature < maxTemperature){
							currentTemperature= currentTemperature+1 ;
					System.out.println("The current temperature is "+ currentTemperature);		
					}else{
							System.out.println("Max Temperature Reached");
						 } 
				}else{
					System.out.println("on the AC....... =");
				}
						 System.out.println("increaseTemperature() ended");
					 return ;
					 }
	   
	    public static void decreaseTemperature(){
		System.out.println("decreaseTemperature() started");
					if(isConnected == true){	 
					
					if(currentTemperature > minTemperature){
					    currentTemperature= currentTemperature-1 ;
				System.out.println("The current temperature is "+ currentTemperature);	
					}else{
						System.out.println("Min Temperature Reached");
					 } 
					}     else{
				System.out.println("on the AC....");
			} 
0
		 System.out.println("decreaseTemperature() ended");


	   }
  public static void features(){
		System.out.println("features started");
	  String brand="Samsung";
	  String color="white";
	  System.out.println(" brand of AC"+brand);
	  System.out.println("color of Ac"+color);
	  System.out.println("features started");
	}
}