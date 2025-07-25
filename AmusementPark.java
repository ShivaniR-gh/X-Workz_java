public class AmusementPark {
    int parkId;
    String name;
    String city;
    int ridesCount;
    boolean hasWaterPark;
	
	public void getAmusementParkInfo(){
		System.out.println("Park ID: " +parkId);
        System.out.println("Name: " +  name);
        System.out.println("City: " +  city);
        System.out.println("Rides: " +  ridesCount);
        System.out.println("Has Water Park: " +  hasWaterPark);
	}
}
