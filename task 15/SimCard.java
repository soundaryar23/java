class SimCard{
    String name;
	int id;
    String plan;
   
	public void createSimCard(String name, int id,String plan ){
		
		if(id>0 && name !=null &&  plan !=null )
			
		this.name=name;
		this.id=id;
		this.plan=plan;
			
	}
	public void displaySimInfo(){
		System.out.println("****************************");
		System.out.println("garden  Name : "+this.name);
		System.out.println("ID : "+this.id);
		System.out.println("plan : "+this.plan);
		
		}
	
	
}