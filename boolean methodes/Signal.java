public class Signal {
    static String signalType;
    static String signalColor;
    static int durationInSeconds;
    static String location;
    static boolean isAutomatic;
    static String signalCompany;

    public static String getSignalType() {
        signalType = "Traffic Signal";
        return signalType;
    }

    public static String getSignalColor() {
        signalColor = "Red";
        return signalColor;
    }

    public static int getDurationInSeconds() {
        durationInSeconds = 60;
        return durationInSeconds;
    }

    public static String getLocation() {
        location = "MG Road";
        return location;
    }

    public static boolean isAutomatic() {
        isAutomatic = true;
        return isAutomatic;
    }

    public static String getSignalCompany() {
        signalCompany = "SmartSignals Ltd.";
        return signalCompany;
    }

    public static void getInfo() {
        System.out.println("The type of signal is " + signalType);
        System.out.println("The color of the signal is " + signalColor);
        System.out.println("The signal duration is " + durationInSeconds + " seconds");
        System.out.println("The location of the signal is " + location);
        System.out.println("Is the signal automatic? " + isAutomatic);
        System.out.println("The signal is manufactured by " + signalCompany);
    }
}
