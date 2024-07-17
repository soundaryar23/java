class GoldShopRunner{
	
	public static void main(String args[]){
		boolean isAdded=GoldShop.addGoldItem("Ring");
		System.out.println("is the item added"+isAdded);
		isAdded=GoldShop.addGoldItem("bangle");
		System.out.println("is the item added"+isAdded);
		isAdded=GoldShop.addGoldItem("necklace");
		System.out.println("is the item added"+isAdded);
		isAdded=GoldShop.addGoldItem("earring");
		System.out.println("is the item added"+isAdded);
		isAdded=GoldShop.addGoldItem("chain");
		System.out.println("is the item added"+isAdded);
		isAdded=GoldShop.addGoldItem("bracelite");
		System.out.println("is the item added"+isAdded);
		isAdded=GoldShop.addGoldItem("nose pin");
		System.out.println("is the item added "+isAdded);
		isAdded=GoldShop.addGoldItem("mangtikka");
		System.out.println("is the item added "+isAdded);
		
		GoldShop.getAllGoldItem();
		boolean isUpdated=GoldShop.updateGoldItems("chain","mangala suthra");
		System.out.println("is the item updated "+isUpdated);
		GoldShop.getAllGoldItem();
		
		boolean isDeleted=GoldShop.deleteGoldItem("earring");
		isDeleted=GoldShop.deleteGoldItem("watch");
		System.out.println("is Item deleted "+isDeleted);
		GoldShop.getAllGoldItem();


	}
	
	
	
}