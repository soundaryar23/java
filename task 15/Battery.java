class Battery{
    String name;
	int id;
    double weight;
   
	public void createBattery(String name, int id, double weight){
		
		if(id>0 && name !=null &&  weight >0 )
			
		this.name=name;
		this.id=id;
		this.weight=weight;
			
	}
	public void displayBatteryInfo(){
		System.out.println("****************************");
		System.out.println("batter  Name : "+this.name);
		System.out.println("ID : "+this.id);
		System.out.println("weight : "+this.weight);
		
		}
	
	
}