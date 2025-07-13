class Tailor {
    static String name;
    static String shopName;
    static int experienceYears;
    static boolean doesHomeService;
    static double stitchingCharge;
    static String specialization;

    public static String getName() {
        name = "Ramesh";
        return name;
    }

    public static String getShopName() {
        shopName = "Ramesh Tailors";
        return shopName;
    }

    public static int getExperienceYears() {
        experienceYears = 15;
        return experienceYears;
    }

    public static boolean doesHomeService() {
        doesHomeService = false;
        return doesHomeService;
    }

    public static double getStitchingCharge() {
        stitchingCharge = 350.0;
        return stitchingCharge;
    }

    public static String getSpecialization() {
        specialization = "Men's Suits";
        return specialization;
    }

    public static void getInfo() {
        System.out.println("Tailor Name: " + name);
        System.out.println("Shop Name: " + shopName);
        System.out.println("Experience: " + experienceYears + " years");
        System.out.println("Home Service: " + doesHomeService);
        System.out.println("Stitching Charge: ₹" + stitchingCharge);
        System.out.println("Specialization: " + specialization);
    }
}

