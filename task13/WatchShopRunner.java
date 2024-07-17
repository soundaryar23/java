class WatchShopRunner{
	
	public static void main(String args[]){
		boolean isAdded=WatchShop.addwatchBrand("noise");
		System.out.println("is the item added"+isAdded);
		isAdded=WatchShop.addwatchBrand("fire bolt");
		System.out.println("is the item added"+isAdded);
		isAdded=WatchShop.addwatchBrand("fastrack");
		System.out.println("is the item added"+isAdded);
		isAdded=WatchShop.addwatchBrand("rolex");
		System.out.println("is the item added"+isAdded);
		isAdded=WatchShop.addwatchBrand("sonata");
		System.out.println("is the item added"+isAdded);
		isAdded=WatchShop.addwatchBrand("hmt");
		System.out.println("is the item added"+isAdded);
		isAdded=WatchShop.addwatchBrand("apple");
		System.out.println("is the item added "+isAdded);
		isAdded=WatchShop.addwatchBrand("samsung ");
		System.out.println("is the item added "+isAdded);
		isAdded=WatchShop.addwatchBrand("titan");
		System.out.println("is the item added "+isAdded);
		isAdded=WatchShop.addwatchBrand("seiko ");
		System.out.println("is the item added "+isAdded);
		isAdded=WatchShop.addwatchBrand(" timex");
		System.out.println("is the item added "+isAdded);
		
		WatchShop.getAllWatchBrand();
		boolean isUpdated=WatchShop.updatedWatchBrand("hmt","casio ");
				System.out.println("is the item updated "+isUpdated);
		WatchShop.getAllWatchBrand();
		
		boolean isDelete=WatchShop.deleteWatchBrand("samsung");
		System.out.println("is watch deleted "+isDelete);
		WatchShop.getAllWatchBrand();

	}
	
	
	
}