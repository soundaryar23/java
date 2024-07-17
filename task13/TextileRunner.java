class TextileRunner{
     public static void main(String materials[]){
		 
		 boolean isAdded=Textiles.addMaterial(null);
		 System.out.println("Is material added "+isAdded);
		 isAdded=Textiles.addMaterial("cotton");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Textiles.addMaterial("polyester");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Textiles.addMaterial("chiffon");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Textiles.addMaterial("velvet");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Textiles.addMaterial("lace");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Textiles.addMaterial("bro code");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Textiles.addMaterial("silk");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Textiles.addMaterial("hemp");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Textiles.addMaterial("wool");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Textiles.addMaterial("lennin");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Textiles.addMaterial("organza");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Textiles.addMaterial("popline");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Textiles.addMaterial("Rayon");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Textiles.addMaterial("Acetate");
		 System.out.println("Is material added "+isAdded);
		 isAdded=Textiles.addMaterial("Fleece");
		 System.out.println("Is material added "+isAdded);
		 Textiles.getMaterial();
		 boolean isUpdated=Textiles.updatedmaterial("hemp","Fleece");
		 System.out.println("is material updated "+isUpdated);
		 Textiles.getMaterial();
		  boolean isDelete= Textiles.deleteMaterialname("Rayon");
		System.out.println(" is deleted material "+isDelete);
		 Textiles.getMaterial();

		 
		 
	 }


}