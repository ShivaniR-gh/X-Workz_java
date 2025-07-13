class River {
    static String name;
    static String origin;
    static double length;
    static boolean isPolluted;
    static String flowsThrough;
    static boolean hasDam;

    public static String getName() {
        name = "Ganga";
        return name;
    }

    public static String getOrigin() {
        origin = "Gangotri";
        return origin;
    }

    public static double getLength() {
        length = 2525.0;
        return length;
    }

    public static boolean isPolluted() {
        isPolluted = true;
        return isPolluted;
    }

    public static String getFlowsThrough() {
        flowsThrough = "India and Bangladesh";
        return flowsThrough;
    }

    public static boolean hasDam() {
        hasDam = true;
        return hasDam;
    }

    public static void getInfo() {
        System.out.println("River Name: " + name);
        System.out.println("Origin: " + origin);
        System.out.println("Length: " + length + " km");
        System.out.println("Polluted: " + isPolluted);
        System.out.println("Flows Through: " + flowsThrough);
        System.out.println("Has Dam: " + hasDam);
    }
}


