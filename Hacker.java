class Hacker {
    static String alias;
    static String specialty;
    static boolean isEthical;
    static int experienceYears;
    static String country;
    static double successRate;

    public static String getAlias() {
        alias = "ShadowWolf";
        return alias;
    }

    public static String getSpecialty() {
        specialty = "Penetration Testing";
        return specialty;
    }

    public static boolean isEthical() {
        isEthical = true;
        return isEthical;
    }

    public static int getExperienceYears() {
        experienceYears = 6;
        return experienceYears;
    }

    public static String getCountry() {
        country = "Germany";
        return country;
    }

    public static double getSuccessRate() {
        successRate = 98.5;
        return successRate;
    }

    public static void getInfo() {
        System.out.println("Alias: " + alias);
        System.out.println("Specialty: " + specialty);
        System.out.println("Ethical: " + isEthical);
        System.out.println("Experience (Years): " + experienceYears);
        System.out.println("Country: " + country);
        System.out.println("Success Rate: " + successRate + "%");
    }
}


