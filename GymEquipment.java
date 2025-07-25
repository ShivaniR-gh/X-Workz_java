class GymEquipment {
    int equipmentId;
    String name;
    String category;
    double weight;
    double price;
    boolean isElectronic;
    String brand;
	public void getGymEquipment(){
		System.out.println("The Equipment ID is " +  equipmentId);
        System.out.println("The name is " + name);
        System.out.println("The category is " +  category);
        System.out.println("The weight is " + weight);
        System.out.println("The price is " +  price);
        System.out.println("Is Electronic: " +  isElectronic);
        System.out.println("The brand is " +  brand);
        System.out.println("------------------------------------------");
	}
}
