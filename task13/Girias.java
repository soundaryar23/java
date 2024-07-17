import java.util.*;
class Girias{
static String appliances[] = {null, null, null, null, null, null, null, null, null, null, null, null};
static int index;
	public static boolean createHomeAppliance(String appliance){
		boolean isCreateHomeAppliance=false;
		if(index < appliances.length){
			if(appliance != null){
				appliances[index] = appliance;
				index++;
				isCreateHomeAppliance = true;
			}
			else {
				System.out.println("Null value can't consider as a appliance name");
		}
		}
		else{
			System.out.println("home appliances are already full ");
		}
		
	return isCreateHomeAppliance;
	}

	public static void getHomeAppliances(){
		for(String item : appliances)
			System.out.println("Appliances available here are:"+item);

	}
  public static boolean updateAppliances(String oldName,String newName){
	  
	  boolean isUpdated=false;
	  
	  for(int index=0; index < appliances.length;index++){
		  
		  if(oldName==appliances[index]){
			  appliances[index]=newName;
			  index++;
			  isUpdated=true;
		  }
  }if(isUpdated==false){
	  System.out.println(oldName+" not found ");
  }
	  
	  return isUpdated;
	  
  }
  public static boolean deleteAppliances(String appliancesName){
	  boolean isdeleteAppliances=false;
	  
	  int oldIndex,newIndex;
	  for(oldIndex=0,newIndex=0; oldIndex < appliances.length; oldIndex++){
		  if(appliancesName != appliances[oldIndex]){
			  appliances[newIndex] =	appliances[oldIndex] ;
			  newIndex++;
		  }
	  }
	  appliances=Arrays.copyOf(appliances,newIndex);
	  if(appliances != null)
		  isdeleteAppliances=true;
	  else if(isdeleteAppliances==false){
		  System.out.println(appliancesName+" Not deleted");
		  
	  }
	  
	return isdeleteAppliances;  
  }
  

}