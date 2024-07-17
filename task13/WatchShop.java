import java.util.*;
class WatchShop{
 static String watchBrand[]={null,null,null,null,null,null,null,null,null,null};
 static int index;
 
 public static boolean addwatchBrand(String item){
	 boolean isWatchAddded=false;
	 
	 if(index <watchBrand.length){
		 if(item !=null){
			watchBrand[index]=item;
            index++;
            isWatchAddded=true;			
			 
		 }else{
			 System.out.println("watch Brand con't be null");
		 }
	 }else{
		 
		 System.out.println("Watch brand already full");
		 
	 }
return isWatchAddded;	 
 }
 public static void getAllWatchBrand(){
	 for(String items:watchBrand)
	 System.out.println("available  watch Brand : "+items);
 }
 public static boolean updatedWatchBrand(String oldItem,String newItem){
	 boolean isWatchUpdated=false;
	 for(int index=0;index<watchBrand.length;index++){
		 if(oldItem==watchBrand[index]){
			 watchBrand[index]=newItem;
			isWatchUpdated=true;
		 }
		  
	 }if(isWatchUpdated==false){
		 
		 System.out.println(oldItem+" Not found");
	 }
	 
	 
return isWatchUpdated;	 
 }
 public static boolean deleteWatchBrand(String deleteBrand){
 boolean isDeletedWatchBrand=false;
 int oldIndex,newIndex;
 for(oldIndex=0,newIndex=0; oldIndex < watchBrand.length; oldIndex++){
	 if( watchBrand[oldIndex] != deleteBrand){
		 watchBrand[newIndex]=watchBrand[oldIndex];
		 newIndex++;
		 
	 } else{
		 	 isDeletedWatchBrand=true;

	 }
 }
 watchBrand=Arrays.copyOf(watchBrand,newIndex);
 
 
 else if(isDeletedWatchBrand==false){
	 System.out.println(deleteBrand+" not deleted");
 }
 
 
 return isDeletedWatchBrand;
}



}