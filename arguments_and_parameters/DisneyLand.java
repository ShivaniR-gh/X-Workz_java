class DisneyLand {
    static String location;
    static int totalRides;
    static boolean hasWaterPark;
    static int entryFee;
    static String owner;
    static boolean isOpenToday;

    public static String getLocation() {
        location = "California";
        return location;
    }

    public static int getTotalRides() {
        totalRides = 75;
        return totalRides;
    }

    public static boolean hasWaterPark() {
        hasWaterPark = true;
        return hasWaterPark;
    }

    public static int getEntryFee() {
        entryFee = 6500;
        return entryFee;
    }

    public static String getOwner() {
        owner = "The Walt Disney Company";
        return owner;
    }

    public static boolean isOpenToday() {
        isOpenToday = true;
        return isOpenToday;
    }

    public static void getInfo() {
        System.out.println("Location: " + location);
        System.out.println("Total Rides: " + totalRides);
        System.out.println("Has Water Park: " + hasWaterPark);
        System.out.println("Entry Fee: ₹" + entryFee);
        System.out.println("Owner: " + owner);
        System.out.println("Open Today: " + isOpenToday);
    }
}


