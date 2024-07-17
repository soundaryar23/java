class Zepto{
	
	public static double getOrder(String fooodName ){
	if(fooodName=="Greek Salad"){
		return 292.44;
	}	
	if(fooodName=="Caesar Salad"){
		return 845.23;	
	}
	if(fooodName=="Chicken Caesar Salad"){
		return 472.02;
	}
	if(fooodName=="Turkey Sandwiches"){
		return 235;
	}
	if(fooodName=="Turkey Sandwiche"){
		return 60;
	}
	if(fooodName=="Chicken Fajitas"){
		return 501;
	}
	if(fooodName=="leaf Tacos"){
		return 489;
	}
	if(fooodName=="Veggie Tacos"){
		return 356;
	}
	if(fooodName=="Fish Tacos"){
		return 115;
	}
	if(fooodName=="Shrimp Scampi"){
		return 232;
	}
	if(fooodName==" Chicken Parmesan"){
		return 375;
	}
	if(fooodName=="Eggplant Parmesan"){
		return 31;
	}
	if(fooodName=="Meatball Pasta"){
		return 426;
	}
	if(fooodName=="Spaghetti Bolognese"){
		return 280;
	}
	if(fooodName==" Chicken Tikka"){
		return 240;
	}
	else
	{
		System.out.println(fooodName+"no food found");
		return 0.0;

	}
}
}