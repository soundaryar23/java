class Mixer
{
static boolean isConnected=true;
	static int     currentSpeed  ; 
      static int maxSpeed  = 3; 
	public static void onOrOff(){
		
		System.out.println("OnOrOff method started");
		if(isConnected==false){
			
		isConnected=true;
		  System.out.println("Mixer turn on");	  

		}
		else if(isConnected==true){
		isConnected=false;
		System.out.println("Mixer turn off");	  

			
		}
			System.out.println("OnOrOff method started");

	
}

public static void increaseSpeed(){
				 System.out.println("increaseSpeed() started");
			if(isConnected == true){	       
				 if(currentSpeed < maxSpeed){
					    currentSpeed= currentSpeed+1 ;
				System.out.println("The current volume is "+ currentSpeed);		
				}else{
						System.out.println("Max Speed Reached");
					 } 
			}else{
				System.out.println("on the mixer");
			}
				 	 System.out.println("increaseSpeed() ended");
				 return ;
				 }
	   
	
}
