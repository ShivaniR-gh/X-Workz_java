class Market {
    static String name;
    static String location;
    static int shops;
    static boolean isOpenOnSunday;
    static String type;
    static double area;

    public static String getName() {
        name = "Central Market";
        return name;
    }

    public static String getLocation() {
        location = "MG Road";
        return location;
    }

    public static int getShops() {
        shops = 150;
        return shops;
    }

    public static boolean isOpenOnSunday() {
        isOpenOnSunday = false;
        return isOpenOnSunday;
    }

    public static String getType() {
        type = "Wholesale";
        return type;
    }

    public static double getArea() {
        area = 2500.50;
        return area;
    }

    public static void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Shops: " + shops);
        System.out.println("Open on Sunday: " + isOpenOnSunday);
        System.out.println("Type: " + type);
        System.out.println("Area: " + area + " sq ft");
    }
}
