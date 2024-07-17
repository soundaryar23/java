class Swiggy{
	
	public static double getOrder(String fooodName ){
	if(fooodName=="pizza"){
		return 125.44;
	}	
	if(fooodName=="freid rice"){
		return 105.23;	
	}
	if(fooodName=="noodles"){
		return 156.02;
	}
	if(fooodName=="biriyani"){
		return 125;
	}
	if(fooodName=="Chicken Wings"){
		return 100;
	}
	if(fooodName=="Tacos"){
		return 105;
	}
	if(fooodName=="Sandwiches"){
		return 200;
	}
	if(fooodName=="Salads"){
		return 525;
	}
	if(fooodName=="Sushi"){
		return 25;
	}
	if(fooodName=="Momos"){
		return 250;
	}
	if(fooodName=="Dumplings"){
		return 255;
	}
	if(fooodName=="Fried Chicken"){
		return 75;
	}
	if(fooodName=="Grilled Cheese"){
		return 236;
	}
	if(fooodName=="Veggie Burgers"){
		return 11;
	}
	if(fooodName=="Quesadillas"){
		return 263;
	}
	else
	{
		System.out.println(fooodName+"no food found");
		return 0.0;

	}
}
}