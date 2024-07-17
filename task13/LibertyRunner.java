class LibertyRunner{
     public static void main(String materials[]){
		 
		 boolean isAdded=Liberty.addShoeBrand(null);
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("nike");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("puma");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("addidas");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Converse");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("jorden");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Vans");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("reebok");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Gucci");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Prada");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Louis Vuitton");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand(" New Balance");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Skechers");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Dr. Martens");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Steve Madden	");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Timberland");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Liberty.addShoeBrand("Clarks");
		 System.out.println("Is material added "+isAdded);
		 Liberty.getAllShoeBrand();
		 boolean isUpdated=Liberty.updateShoeBrand("jorden","Saucony");
		 System.out.println("is material updated "+isUpdated);
		 Liberty.getAllShoeBrand();
		 
		  boolean isDeleted=Liberty.deleteShoeBrand("abibas");
		  System.out.println("Is shoe  deleted "+isDeleted);
		 Liberty.getAllShoeBrand();

		 
		 
	 }


}