class Zomato{
	
	public static double getOrder(String fooodName ){
	if(fooodName=="Chicken Tenders"){
		return 175.44;
	}	
	if(fooodName=="Fish & Chips"){
		return 135.23;	
	}
	if(fooodName=="Steak"){
		return 866.02;
	}
	if(fooodName==" Ribs"){
		return 225;
	}
	if(fooodName=="Chicken Wings"){
		return 130;
	}
	if(fooodName=="Naan Pizza"){
		return 175;
	}
	if(fooodName=="Falafel"){
		return 209;
	}
	if(fooodName==" Shawarma"){
		return 325;
	}
	if(fooodName=="Ramen"){
		return 105;
	}
	if(fooodName=="Udon Noodles"){
		return 230;
	}
	if(fooodName==" Sashimi"){
		return 275;
	}
	if(fooodName=="Tiramisu"){
		return 711;
	}
	if(fooodName=="Cannoli"){
		return 336;
	}
	if(fooodName=="Gelato"){
		return 78;
	}
	if(fooodName==" Ice Cream"){
		return 200;
	}
	else
	{
		System.out.println(fooodName+"no food found");
		return 0.0;

	}
}
}