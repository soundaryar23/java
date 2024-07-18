class Garden{
    String name;
	int id;
    String place;
   
	public void createGarden(String name, int id,String place ){
		
		if(id>0 && name !=null &&  place !=null )
			
		this.name=name;
		this.id=id;
		this.place=place;
			
	}
	public void displayGardenInfo(){
		System.out.println("****************************");
		System.out.println("garden  Name : "+this.name);
		System.out.println("ID : "+this.id);
		System.out.println("location : "+this.place);
		
		}
	
	
}