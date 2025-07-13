class Gold {
    static String purity;
    static double weight;
    static int pricePerGram;
    static String form;
    static String origin;
    static boolean isHallmarked;

    public static String getPurity() {
        purity = "22K";
        return purity;
    }

    public static double getWeight() {
        weight = 15.5;
        return weight;
    }

    public static int getPricePerGram() {
        pricePerGram = 5800;
        return pricePerGram;
    }

    public static String getForm() {
        form = "Necklace";
        return form;
    }

    public static String getOrigin() {
        origin = "India";
        return origin;
    }

    public static boolean isHallmarked() {
        isHallmarked = true;
        return isHallmarked;
    }

    public static void getInfo() {
        System.out.println("Purity: " + purity);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Price per gram: ₹" + pricePerGram);
        System.out.println("Form: " + form);
        System.out.println("Origin: " + origin);
        System.out.println("Hallmarked: " + isHallmarked);
    }
}


