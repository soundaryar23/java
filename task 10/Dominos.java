class Dominos{
	
	public static double getOrder(String fooodName ){
	if(fooodName=="Japchae"){
		return 25.44;
	}	
	if(fooodName=="Bibimbap"){
		return 305.23;	
	}
	if(fooodName=="Chicken Korma"){
		return 456.02;
	}
	if(fooodName=="Palak Korma"){
		return 525;
	}
	if(fooodName=="Tandoori Chicken"){
		return 300;
	}
	if(fooodName=="Garlic Naan"){
		return 365;
	}
	if(fooodName=="Chicken Shawarma"){
		return 350;
	}
	if(fooodName=="Falafel Wrap"){
		return 225;
	}
	if(fooodName=="Shish Taouk"){
		return 235;
	}
	if(fooodName=="Chicken Souvlaki"){
		return 520;
	}
	if(fooodName=="Gyro Wrap"){
		return 255;
	}
	if(fooodName=="Chicken Fattoush"){
		return 375;
	}
	if(fooodName=="Chicken Quesadilla Wrap"){
		return 236;
	}
	if(fooodName==" Veggie Spring Rolls"){
		return 211;
	}
	if(fooodName=="Chicken Bao"){
		return 423;
	}
	else
	{
		System.out.println(fooodName+"no food found");
		return 0.0;

	}
}
}