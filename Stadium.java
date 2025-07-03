public class Stadium {
    static String name = "National Arena";
    static String location = "Mumbai";
    static int capacity = 60000;
    static String sportType = "Cricket";
    static String homeTeam = "Mumbai Indians";
    static boolean hasRoof = true;
    static String surfaceType = "Grass";
    static int parkingSpots = 5000;
    static boolean hasLEDScoreboard = true;
    static String builtYear = "2010";
    static double areaInAcres = 75.5;
    static boolean vipBoxesAvailable = true;
    static int numberOfEntrances = 12;
    static int foodStalls = 25;
    static boolean hasSecuritySystem = true;

    public static void main(String[] args) {
        System.out.println("Stadium Details:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity);
        System.out.println("Sport Type: " + sportType);
        System.out.println("Home Team: " + homeTeam);
        System.out.println("Has Roof: " + hasRoof);
        System.out.println("Surface Type: " + surfaceType);
        System.out.println("Parking Spots: " + parkingSpots);
        System.out.println("Has LED Scoreboard: " + hasLEDScoreboard);
        System.out.println("Built Year: " + builtYear);
        System.out.println("Area (Acres): " + areaInAcres);
        System.out.println("VIP Boxes Available: " + vipBoxesAvailable);
        System.out.println("Number of Entrances: " + numberOfEntrances);
        System.out.println("Food Stalls: " + foodStalls);
        System.out.println("Has Security System: " + hasSecuritySystem);
    }
}
