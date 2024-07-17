class Speaker{
static boolean isConnected=true;
 static int     currentVolume  ; 
      static int maxVolume  = 5; 
	
	public static void onOrOff(){
		
		System.out.println("OnOrOff method started");
		if(isConnected==false){
			
		isConnected=true;
		  System.out.println("Speaker turn on");	  

		}
		else if(isConnected==true){
		isConnected=false;
		System.out.println("Speaker turn off");	  

			
		}
			System.out.println("OnOrOff method started");

	
}
public static void increaseVolume(){
				 System.out.println("increaseVolume() started");
			if(isConnected == true){	       
				 if(currentVolume < maxVolume){
					    currentVolume= currentVolume+1 ;
				System.out.println("The current volume is "+ currentVolume);		
				}else{
						System.out.println("Max volume Reached");
					 } 
			}else{
				System.out.println("on the Speaker");
			}
				 	 System.out.println("increaseVolume() ended");
				 return ;
				 }
	   
	
}