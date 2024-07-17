class Dmart2
{
    static String[] chocolates = {"KitKat", "Dairy Milk", "Snikers", "Silk", "munch", "oreo"};
    static String[] beverages = {"Coke", "Pepsi", "Sprite", "Fanta", "7Up"};
    static String[] snacks = {"Chips", "Nachos", "Pretzels", "Popcorn", "Crackers"};
    static String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Pineapple"};
    static String[] vegetables = {"Carrot", "Broccoli", "Spinach", "Tomato", "Cucumber"};
    static String[] dairy = {"Milk", "Cheese", "Yogurt", "Butter", "Cream"};
    static String[] seafood = {"Fish", "Shrimp", "Crab", "Lobster", "Salmon"};
    static String[] bakery = {"Bread", "Bagel", "Croissant", "Muffin", "Donut"};
    static String[] frozen = {"Ice Cream", "Frozen Pizza", "Frozen Vegetables", "Frozen Dinners", "Frozen Fruits"};
    static String[] canned = {"Canned Beans", "Canned Soup", "Canned Fish", "Canned Vegetables", "Canned Fruit"};
    static String[] spices = {"Salt", "Pepper", "Paprika", "Cumin", "Turmeric"};
    static String[] household = {"Detergent", "Dish Soap", "Toilet Paper", "Paper Towels", "Garbage Bags"};
    static String[] personalCare = {"Shampoo", "Soap", "Toothpaste", "Deodorant", "Lotion"};
    static String[] babyProducts = {"Diapers", "Baby Wipes", "Baby Food", "Baby Lotion", "Baby Shampoo"};
    static String[] petSupplies = {"Dog Food", "Cat Food", "Bird Seed", "Pet Shampoo", "Pet Toys"};

    public static void main(String[] args)
	{
        System.out.println("The Available Chocolates: " );
		 for (int index = 0 ;   index <= chocolates.length -1 ;   index++  ){
		 System.out.println(chocolates[index]);
		 }

      System.out.println("The Available Beverages: " );
	   for (int bev = 0 ;   bev <= beverages.length -1 ;   bev++  ){
		 System.out.println(beverages[bev]);
		 }
	  

        System.out.println("The Available Snacks: " );
		for (int snac = 0 ;   snac < snacks.length ;   snac++  ){
		 System.out.println(snacks[snac]);
		 }
		
        System.out.println("The Available Fruits: " );
		 for( String fruit:fruits)
			{
				System.out.println(fruit);
			}	

          System.out.println("The Available Vegetables: "); 
		  for( String veg:vegetables)
			{
				System.out.println(veg);
			}	

        System.out.println("The Available Dairy: " + dairy[0] + ", " + dairy[1] + ", " +dairy[2] + ", " + dairy[3] + ", " + dairy[4]);
		for( String dairies:dairy)
			{
				System.out.println(dairies);
			}	

        System.out.println("The Available Seafood: ");
		for( String sea:seafood)
			{
				System.out.println(sea);
			}			
			System.out.println("The Available Bakery: " );
			for( String bakeries:bakery)
			{
				System.out.println(bakeries);
			}	
        System.out.println("The Available Frozen: ");
		for( String froze:frozen)
			{
				System.out.println(froze);
			}	

        System.out.println("The Available Canned: ");
		for( String canneds:canned)
			{
				System.out.println(canneds);
			}	
        System.out.println("The Available Spices: " );
		for( String spice:spices)
			{
				System.out.println(spice);
			}	
        System.out.println("The Available Household Items: " );
		for( String items:household)
			{
				System.out.println(items);
			}	
        System.out.println("The Available Personal Care: "); 
		for( String care:personalCare)
			{
				System.out.println(care);
			}	
        System.out.println("The Available Baby Products: " );
		for( String baby:babyProducts)
			{
				System.out.println(baby);
			}	
        System.out.println("The Available Pet Supplies: ");

			for( String pet:petSupplies)
			{
				System.out.println(pet);
			}			}
}