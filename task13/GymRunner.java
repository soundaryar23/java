class GymRunner{
	
	public static void main(String args[])
	{
		boolean isCreated=Gym.createEquiment("dumbells");
		System.out.println("is equipment addes"+isCreated);
		Gym.createEquiment("leg curl machine");
		Gym.createEquiment("diping bars");
		Gym.createEquiment("barbell");
		Gym.createEquiment("rovers");
		Gym.createEquiment("spin bike");
		Gym.createEquiment("lat machine");
		Gym.createEquiment("bench");
		Gym.createEquiment("Ab roller");
		Gym.getEquipment();
		boolean isUpdated=Gym.updateEquiments("rovers","rope");
		System.out.println("is updated "+isUpdated);
		Gym.getEquipment();
		boolean isDeleted=Gym.deleteEquipment("bench");
		System.out.println("is equipment deleted : "+isDeleted);
		Gym.getEquipment();


	}	
	
}