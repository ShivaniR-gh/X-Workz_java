class WalkiTalki {
    static String brand;
    static int rangeMeters;
    static double frequency;
    static String color;
    static boolean isRechargeable;
    static int price;

    public static String getBrand() {
        brand = "Motorola";
        return brand;
    }

    public static int getRange() {
        rangeMeters = 5000;
        return rangeMeters;
    }

    public static double getFrequency() {
        frequency = 462.5625;
        return frequency;
    }

    public static String getColor() {
        color = "Black";
        return color;
    }

    public static boolean isRechargeable() {
        isRechargeable = true;
        return isRechargeable;
    }

    public static int getPrice() {
        price = 6500;
        return price;
    }

    public static void getInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Range: " + rangeMeters + " meters");
        System.out.println("Frequency: " + frequency + " MHz");
        System.out.println("Color: " + color);
        System.out.println("Rechargeable: " + isRechargeable);
        System.out.println("Price: ₹" + price);
    }
}

