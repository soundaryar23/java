class GiriasRunner{
	public static void main(String[] giriyasItems){
		boolean isAppliancesAdded = Girias.createHomeAppliance("Refrigerator");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Girias.createHomeAppliance("Air Conditioner");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Girias.createHomeAppliance("Washing Machine");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Girias.createHomeAppliance("Dryer");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Girias.createHomeAppliance("Dishwasher");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Girias.createHomeAppliance("Microwave Oven");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Girias.createHomeAppliance("Fan");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Girias.createHomeAppliance("Toaster");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Girias.createHomeAppliance("Blender");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Girias.createHomeAppliance("Vacuum Cleaner");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Girias.createHomeAppliance("Iron");
		System.out.println("the item added is:"+isAppliancesAdded);
		 isAppliancesAdded = Girias.createHomeAppliance("Coffee Maker");
		System.out.println("the item added is:"+isAppliancesAdded);
		isAppliancesAdded = Girias.createHomeAppliance("kattle");

		Girias.getHomeAppliances();
		Girias.updateAppliances("Iron","kattle");
		Girias.getHomeAppliances();
		
		boolean isDelete=Girias.deleteAppliances("Dryer");
		System.out.println("is item deleted "+isDelete);
       		Girias.getHomeAppliances();

	}
}