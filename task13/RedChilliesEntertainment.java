import java.util.*;
class RedChilliesEntertainment {
	static int index;
static String actors[] = {null, null, null, null, null, null, null, null, null,};
	public static boolean addMovieActors(String actor){
		boolean isMovieActors = false;
		if(index <actors.length){
	    if(actor != null){
			actors[index] = actor;
			index++;
			isMovieActors = true;
		}
		else{
			System.out.println("Actor name can't be null");
		}
		}
		else{
			System.out.println("already full ");
		}
		return isMovieActors;
	}
	
	public static void getMovieActors(){
//System.out.println("getMovieActors started");
		for(String chillActor : actors)
		System.out.println("Actors are : "+chillActor);
		//System.out.println("getMovieActors started");
	}
public static boolean updateActor(String oldActor,String newActor){
	 boolean isUpdated=false;
	for(int index=0; index<actors.length; index++){
		if(oldActor==actors[index]){
			actors[index]=newActor;
			index++;
			isUpdated=true;
			
		}
	}if(isUpdated==false){
		
		System.out.println(oldActor+" not found");
	}
	
	return isUpdated;
}

public static boolean deleteActor(String actorDelete){
	boolean isDeleteActor=false;
	int oldIndex, newSize;
	for(newSize=0,oldIndex=0; oldIndex<actors.length; oldIndex++){
		if(actorDelete != actors[oldIndex]){
			
			actors[newSize]=actors[oldIndex];
			newSize++;
			
		}
		}
		actors=Arrays.copyOf(actors,newSize);
		if(actors != null)
			isDeleteActor=true;
		if(isDeleteActor==false){
			
			System.out.println(actorDelete+"  not deleted");
		}
		return isDeleteActor;	
}

}