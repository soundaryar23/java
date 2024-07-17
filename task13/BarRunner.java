class BarRunner{
 public static void main(String args[]){
	 
	 boolean isAdded= Bar.addWineBrand("vodka");
	 System.out.println("is Brand name is added : "+isAdded);
	 isAdded=Bar.addWineBrand("Franzia");
	 System.out.println("is Brand Added "+isAdded);
	 isAdded=Bar.addWineBrand("badviser");
	 System.out.println("is Brand Added "+isAdded);
	 isAdded=Bar.addWineBrand(null);
	 System.out.println("is Brand Added "+isAdded);
	 isAdded=Bar.addWineBrand("Barefoot Cellars");
	 System.out.println("is Brand Added "+isAdded);
	 isAdded=Bar.addWineBrand("Carlo Rossi");
	 System.out.println("is Brand Added "+isAdded);
	 isAdded=Bar.addWineBrand("Sutter Home");
	 System.out.println("is Brand Added "+isAdded);
	 isAdded=Bar.addWineBrand("Woodbridge Mondavi");
	 System.out.println("is Brand Added "+isAdded);
	 isAdded=Bar.addWineBrand("Yellow Tail");
	 System.out.println("is Brand Added "+isAdded);
	 isAdded=Bar.addWineBrand("Black Box");
	 System.out.println("is Brand Added "+isAdded);
	 isAdded=Bar.addWineBrand("Bota Box");
	 System.out.println("is Brand Added "+isAdded);
	 isAdded=Bar.addWineBrand("Livingston Cellars");
	 System.out.println("is Brand Added "+isAdded);
	 isAdded=Bar.addWineBrand("Liberty Creek");
	 System.out.println("is Brand Added "+isAdded);
	 isAdded=Bar.addWineBrand("Royal challengers");
	 System.out.println("is Brand Added "+isAdded);
	 isAdded=Bar.addWineBrand("Ot");
	 System.out.println("is Brand Added "+isAdded);
	 isAdded=Bar.addWineBrand("Penfolds ");
	 System.out.println("is Brand Added "+isAdded);
	 isAdded=Bar.addWineBrand("Sutter ");

	 
	 Bar.getWineBrand();
	 boolean isUpdated=Bar.updatedWineBrand("vodka","black dog");
	 System.out.println("is brand name updated "+isUpdated);
	 Bar.getWineBrand();
	 
	 boolean isDelete= Bar.deleteWineBrand("Ot");
	 System.out.println(" is deleted brand "+isDelete);
	 Bar.getWineBrand();

 }

}