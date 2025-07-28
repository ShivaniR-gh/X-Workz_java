public class AmusementPark {
    int parkId;
    String name;
    String location;
    int numberOfRides;
    boolean hasWaterPark;

    public AmusementPark(int parkId, String name, String location, int numberOfRides, boolean hasWaterPark) {
        this.parkId = parkId;
        this.name = name;
        this.location = location;
        this.numberOfRides = numberOfRides;
        this.hasWaterPark = hasWaterPark;
    }

    public void getAmusementParkInfo() {
        System.out.println("Park ID: " + parkId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Rides: " + numberOfRides);
        System.out.println("Water Park: " + hasWaterPark);
        System.out.println("----------------------------------");
    }
}
