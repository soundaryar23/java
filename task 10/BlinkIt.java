class BlinkIt{
	
	public static double getOrder(String fooodName ){
	if(fooodName=="Palak Paneer"){
		return 25.44;
	}	
	if(fooodName=="Chana Masala"){
		return 305.23;	
	}
	if(fooodName=="Samosas"){
		return 456.02;
	}
	if(fooodName=="Spring Rolls"){
		return 525;
	}
	if(fooodName==" Dumpling Soup"){
		return 300;
	}
	if(fooodName=="Wonton Soup"){
		return 365;
	}
	if(fooodName=="Hot & Sour Soup"){
		return 700;
	}
	if(fooodName=="om Yum Soup"){
		return 225;
	}
	if(fooodName=="Chicken Satay"){
		return 235;
	}
	if(fooodName=="Satay"){
		return 520;
	}
	if(fooodName=="chicken Dumplings"){
		return 255;
	}
	if(fooodName=="Edamame"){
		return 375;
	}
	if(fooodName=="Miso Soup"){
		return 236;
	}
	if(fooodName=="Ramen Burger"){
		return 211;
	}
	if(fooodName=="Korea BBQ"){
		return 423;
	}
	else
	{
		System.out.println(fooodName+"no food found");
		return 0.0;

	}
}
}