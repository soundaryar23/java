class FiveStarChicken{
	
	public static double getOrder(String fooodName ){
	if(fooodName=="dosa"){
		return 40.44;
	}	
	if(fooodName=="idli"){
		return 85.23;	
	}
	if(fooodName=="palav"){
		return 52.02;
	}
	if(fooodName=="Tamato bath"){
		return 60;
	}
	if(fooodName=="Veg Freid rice"){
		return 120;
	}
	if(fooodName=="piliyogare"){
		return 50;
	}
	if(fooodName=="avalakki"){
		return 30;
	}
	if(fooodName=="chithranna"){
		return 35;
	}
	if(fooodName=="Uppittu"){
		return 35;
	}
	if(fooodName=="savige bath"){
		return 28.4;
	}
	if(fooodName=="kesari bath"){
		return 55;
	}
	if(fooodName=="poori-sagu"){
		return 50;
	}
	if(fooodName=="rotti"){
		return 20;
	}
	if(fooodName=="kadubu"){
		return 25;
	}
	if(fooodName=="curd Rice"){
		return 30.36;
	}
	else
	{
		System.out.println(fooodName+"   food not found");
		return 0.0;

	}
}
}