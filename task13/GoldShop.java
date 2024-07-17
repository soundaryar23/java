import java.util.*;
class GoldShop{
 static String goldItem[]={null,null,null,null,null,null,null};
 static int index;
 
 public static boolean addGoldItem(String item){
	 boolean isGoldAddded=false;
	 
	 if(index < goldItem.length){
		 if(item !=null){
			goldItem[index]=item;
            index++;
            isGoldAddded=true;			
			 
		 }else{
			 System.out.println("gold item con't be null");
		 }
	 }else{
		 
		 System.out.println("gold items already full");
		 
	 }
return isGoldAddded;	 
 }
 public static void getAllGoldItem(){
	 for(String items:goldItem)
	 System.out.println("available gold items : "+items);
 }
 public static boolean updateGoldItems(String oldItem,String newItem){
	 boolean isGoldUpdated=false;
	 for(int index=0;index<goldItem.length;index++){
		 if(oldItem==goldItem[index]){
			 goldItem[index]=newItem;
			isGoldUpdated=true;
		 }
		  
	 }if(isGoldUpdated==false){
		 
		 System.out.println(oldItem+" Not found");
	 }
	 
	 
return isGoldUpdated;	 
 }
 public static boolean deleteGoldItem(String deleteGold){
	 boolean isDeleteGold=false;
	 int oldIndex,newIndex;
	 for(newIndex=0, oldIndex=0; oldIndex<goldItem.length;oldIndex++ ){
		 if(goldItem[oldIndex] != deleteGold){
			 goldItem[newIndex]=goldItem[oldIndex];
			 newIndex++;
			 
		 }else{
			 isDeleteGold=true;
		 }
	 }
	 goldItem=Arrays.copyOf(goldItem,newIndex);
	 
	
	 
	 else if(isDeleteGold==false){
		 
		 System.out.println(deleteGold+" Not deleted ");
	 }
	 
	 
	 
	 return isDeleteGold;
	 
 }



}