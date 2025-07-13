class MakeUpKit {
    static String brand;
    static int numberOfItems;
    static boolean isWaterproof;
    static String kitType;
    static double price;
    static boolean includesMirror;

    public static String getBrand() {
        brand = "Lakme";
        return brand;
    }

    public static int getNumberOfItems() {
        numberOfItems = 10;
        return numberOfItems;
    }

    public static boolean isWaterproof() {
        isWaterproof = true;
        return isWaterproof;
    }

    public static String getKitType() {
        kitType = "Full Kit";
        return kitType;
    }

    public static double getPrice() {
        price = 2499.99;
        return price;
    }

    public static boolean includesMirror() {
        includesMirror = true;
        return includesMirror;
    }

    public static void getInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Items: " + numberOfItems);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("Kit Type: " + kitType);
        System.out.println("Price: ₹" + price);
        System.out.println("Includes Mirror: " + includesMirror);
    }
}

