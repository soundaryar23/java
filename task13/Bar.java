import java.util.*;
class Bar{
static String wineBrand[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean addWineBrand(String wine){
	boolean isWineAdded=false;
	if(index < wineBrand.length){
		if(wine != null){
			wineBrand[index]=wine;
			index++;
			isWineAdded=true;
		}else{
			System.out.println("Brand Name Can't be null");
		}
	}
		else{
		
		System.out.println("Brand name already full");
		
	}	
return isWineAdded;	
}
public static void getWineBrand(){
	for(String wine : wineBrand){
		System.out.println("Available wine brands are : "+wine);
	}
}
public static boolean updatedWineBrand(String oldBrand,String newBrand){
	boolean isUpdated=false;
	for(int index=0; index < wineBrand.length; index++){
		if(oldBrand==wineBrand[index]){
			wineBrand[index]=newBrand;
		    isUpdated=true;
		}
	}
	if(isUpdated==false){
		System.out.println(oldBrand+" Can't found");
	}
return isUpdated;	
}	
public static boolean deleteWineBrand(String deleteWine){
	boolean isDeletewineBrand=false;
	int oldIndex,newIndex;
	for(oldIndex=0,newIndex=0; oldIndex <wineBrand.length; oldIndex++ ){
		if(deleteWine != wineBrand[oldIndex]){
			wineBrand[newIndex] =wineBrand[oldIndex];
			newIndex++;
		}
		}
		wineBrand=Arrays.copyOf(wineBrand,newIndex);
		if(wineBrand != null){
			isDeletewineBrand=true;	
		}else if(isDeletewineBrand==false){
			System.out.println(deleteWine+" not deleted");
			
		}	
	
	
	return isDeletewineBrand;
}
	
} 

