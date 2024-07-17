import java.util.*;
class Gym{
	
	static String equimentName[]={null,null,null,null,null,null,null,null};
	static int index;

	public static boolean createEquiment(String equipment){
		boolean isCreated=false;
		
		if(index < equimentName.length){
			if(equipment != null){
				
				equimentName[index] = equipment;
				index++;
				isCreated= true;	
			}else{
				System.out.println("equiment Name can't be null");
			}	
			
		}
		else{
			System.out.println("already full");
		}
return isCreated;		
	}
	public static void getEquipment(){
		for(String equipments : equimentName)
		System.out.println("avialable equipments are "+equipments);
		
	}	
	
public static boolean updateEquiments(String oldName,String newName){
		boolean isUpdated=false;
		for(int index=0; index<equimentName.length; index++){
		if(oldName==equimentName[index]){
			equimentName[index]=newName;
			isUpdated=true;
		}
		}
		if(isUpdated==false){
			
			System.out.println(oldName+" Euipments not available ");
		}
		
		return isUpdated;
	}
	public static boolean deleteEquipment(String deleteEquip){
		boolean isDeleteGymEquipment=false;
		int oldIndex,newIndex;
		for(oldIndex=0,newIndex=0; oldIndex<equimentName.length; oldIndex++)
		{
			if(deleteEquip != equimentName[oldIndex] ){
			equimentName[newIndex]=equimentName[oldIndex];
            newIndex++;		
			}
		}
		equimentName=Arrays.copyOf(equimentName,newIndex);
		if(equimentName != null)
			isDeleteGymEquipment=true;
		if(isDeleteGymEquipment==false){
			System.out.println(deleteEquip+ "not delete");
		}
		return isDeleteGymEquipment;
	}
}