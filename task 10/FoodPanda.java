class FoodPanda{
	
	public static double getOrder(String fooodName ){
	if(fooodName=="Chicken Tenders"){
		return 202.44;
	}	
	if(fooodName=="FoodPanda"){
		return 145.23;	
	}
	if(fooodName==" Cookies"){
		return 420.02;
	}
	if(fooodName=="Cakes"){
		return 225;
	}
	if(fooodName=="Muffins"){
		return 250;
	}
	if(fooodName=="Bagels"){
		return 151;
	}
	if(fooodName=="Croissants"){
		return 789;
	}
	if(fooodName=="Donuts"){
		return 315;
	}
	if(fooodName=="Onion Rings"){
		return 115;
	}
	if(fooodName=="Chicken Nuggets"){
		return 230;
	}
	if(fooodName=="Mac & Cheese"){
		return 305;
	}
	if(fooodName=="Meatball Subs"){
		return 201;
	}
	if(fooodName=="Chicken Quesadillas"){
		return 726;
	}
	if(fooodName=="Veggie Wraps"){
		return 780;
	}
	if(fooodName=="Fruit Salad"){
		return 270;
	}
	else
	{
		System.out.println(fooodName+"no food found");
		return 0.0;

	}
}
}