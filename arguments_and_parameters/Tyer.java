class Tyer {
    static String brand;
    static int sizeInInches;
    static boolean isTubeless;
    static String type;
    static int price;
    static String suitableFor;

    public static String getBrand() {
        brand = "MRF";
        return brand;
    }

    public static int getSize() {
        sizeInInches = 17;
        return sizeInInches;
    }

    public static boolean isTubeless() {
        isTubeless = true;
        return isTubeless;
    }

    public static String getType() {
        type = "Radial";
        return type;
    }

    public static int getPrice() {
        price = 3500;
        return price;
    }

    public static String getSuitableFor() {
        suitableFor = "Car";
        return suitableFor;
    }

    public static void getInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + sizeInInches + " inches");
        System.out.println("Tubeless: " + isTubeless);
        System.out.println("Type: " + type);
        System.out.println("Price: ₹" + price);
        System.out.println("Suitable For: " + suitableFor);
    }
}


