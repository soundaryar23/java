class Shampoo{
	
	String brandName ;
	int id;
	int qty ;
    String 	type ;
	double price ;
	String mfgDate;
	String  expDate;
	
	public void createShampoo(String brandName, int id,int qty,String type,double price,String mfgDate,String expDate ){
		
		if(id>0 && brandName !=null && qty > 0 && type !=null && price > 0 && mfgDate != null && expDate !=null)
			
		this.brandName=brandName;
		this.qty=qty;
		this.id=id;
		this.type=type;
		this.price= price;
		this.mfgDate=mfgDate;
		this.expDate=expDate;	
	}
	public void displayShampooInfo(){
		System.out.println("****************************");
		System.out.println("Brand Name : "+this.brandName);
		System.out.println("ID : "+this.id);
		System.out.println("Quantity : "+this.qty);
		System.out.println("Type : "+this.type);
		System.out.println("price : "+this.price);
		System.out.println("mmanufacture Date : "+this.mfgDate);
		System.out.println("Expire Date : "+this.expDate);
	}
	
	
}