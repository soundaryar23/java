import java.util.*;
class Textiles{
static String materialName[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addMaterial(String material){
	boolean isAddedMaterial=false;
	if(index < materialName.length){
		if( material != null){
			materialName[index]=material;
			index++;
			isAddedMaterial=true;
			
		}else{
			System.out.println("material name Can't be Null");
		}	
	}else{
		System.out.println("material already full");
	}
	
	
return isAddedMaterial;	
}
public static void getMaterial(){
	for(String materials : materialName){
		System.out.println("available material are : "+materials);
	}
	
}
public static boolean updatedmaterial(String oldName,String newName){
	boolean isUpdated=false;
	for(int index=0;index<materialName.length;index++){
		if(oldName==materialName[index]){
			materialName[index]=newName;
			isUpdated=true;
		}	
			
		}if(isUpdated==false){
			System.out.println(oldName+" Not found");
			
		}
		return isUpdated;
	}	/*
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
}*/
public static boolean deleteMaterialname(String deleteMaterial) {
	boolean isDeleteMaterialname=false;
	int oldIndex,newIndex;
	for(oldIndex=0,newIndex=0; oldIndex<materialName.length; oldIndex++){
		if(deleteMaterial != materialName[oldIndex]){
			materialName[newIndex] =materialName[oldIndex];
			newIndex++;
		}
	}
	materialName=Arrays.copyOf(materialName,newIndex);
	if(materialName != null){
		isDeleteMaterialname=true;
	}else if(isDeleteMaterialname==false){
		System.out.println(deleteMaterial+" not deleted");
		
	}
	return isDeleteMaterialname;
}
	
	
	
	
}
