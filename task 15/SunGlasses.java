class SunGlasses{
    String name;
	int id;
    String type;
    double price;
	
	
	public void createSunGlasses(String name, int id,String type,double price ){
		
		if(id>0 && name !=null &&  type !=null && price > 0)
			
		this.name=name;
		this.id=id;
		this.type=type;
		this.price= price;
		
	}
	public void displaySunGlassesInfo(){
		System.out.println("****************************");
		System.out.println("Brand Name : "+this.name);
		System.out.println("ID : "+this.id);
		System.out.println("Type : "+this.type);
		System.out.println("price : "+this.price);
		}
	
	
}