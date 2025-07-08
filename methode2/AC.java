class AC {
    static boolean startOrEnd = false;
    static int currentTemperature = 24;
    static int maxTemperature = 30;
    static int minTemperature = 16;

    public static void turnOnOrTurnOff() {
        if (startOrEnd == false) {
            startOrEnd = true;
            System.out.println("AC is ON now");
        } else {
            startOrEnd = false;
            System.out.println("AC is OFF");
        }
    }

    public static void increaseTemperature() {
        if (startOrEnd == true) {
            if (currentTemperature < maxTemperature) {
                currentTemperature++;
                System.out.println("Temperature increased to " + currentTemperature);
            } else {
                System.out.println("Maximum temperature reached");
            }
        } else {
            System.out.println("Turn on the AC");
        }
    }

    public static void decreaseTemperature() {
        if (startOrEnd == true) {
            if (currentTemperature > minTemperature) {
                currentTemperature--;
                System.out.println("Temperature decreased to " + currentTemperature);
            } else {
                System.out.println("Minimum temperature reached");
            }
        } else {
            System.out.println("Turn on the AC");
        }
    }
}
