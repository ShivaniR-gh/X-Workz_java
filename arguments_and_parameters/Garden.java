class Garden {
    static String name;
    static String location;
    static int numberOfTrees;
    static double area;
    static boolean hasPlayground;
    static boolean isOpenToday;

    public static String getName() {
        name = "Rose Garden";
        return name;
    }

    public static String getLocation() {
        location = "Bangalore";
        return location;
    }

    public static int getNumberOfTrees() {
        numberOfTrees = 120;
        return numberOfTrees;
    }

    public static double getArea() {
        area = 1800.75;
        return area;
    }

    public static boolean hasPlayground() {
        hasPlayground = true;
        return hasPlayground;
    }

    public static boolean isOpenToday() {
        isOpenToday = true;
        return isOpenToday;
    }

    public static void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Trees: " + numberOfTrees);
        System.out.println("Area: " + area + " sq.m");
        System.out.println("Has Playground: " + hasPlayground);
        System.out.println("Open Today: " + isOpenToday);
    }
}

