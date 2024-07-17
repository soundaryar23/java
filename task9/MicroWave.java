class MicroWave{

    static boolean isConnected;
	static int     currentTemperature  ; 
      static int maxTemperature  = 6 ; 
		
	
	public static void onOrOff(){
		
		System.out.println("OnOrOff method started");
		if(isConnected==false){
			
		isConnected=true;
		  System.out.println("MicroWave turn on");	  

		}
		else if(isConnected==true){
		isConnected=false;
		System.out.println("MicroWave turn off");	  

			
		}
			System.out.println("OnOrOff method started");

	}
	public static void increaseTemperature(){
					 System.out.println("increaseTemperature() started");
				if(isConnected == true){	       
					 if(currentTemperature < maxTemperature){
							currentTemperature= currentTemperature+1 ;
					System.out.println("The current temperature is "+ currentTemperature);		
					}else{
							System.out.println("Max Temperature Reached");
						 } 
				}else{
					System.out.println("On the Micro Wave");
				}
						 System.out.println("increaseTemperature() ended");
					 return ;
					 }
	   

}