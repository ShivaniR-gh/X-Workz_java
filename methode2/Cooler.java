class Cooler {
    static boolean startOrEnd = false;
    static int currentSpeed;
    static int maxSpeed = 4;
    static int minSpeed;

    public static void turnOnOrTurnOff() {
        if (startOrEnd == false) {
            startOrEnd = true;
            System.out.println("Cooler is ON now");
        } else {
            startOrEnd = false;
            System.out.println("Cooler is OFF");
        }
    }

    public static void increaseSpeed() {
        if (startOrEnd == true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed++;
                System.out.println("Cooler speed increased");
            } else {
                System.out.println("Maximum speed reached");
            }
        } else {
            System.out.println("Turn on the Cooler");
        }
    }

    public static void decreaseSpeed() {
        if (startOrEnd == true) {
            if (currentSpeed > minSpeed) {
                currentSpeed--;
                System.out.println("Cooler speed decreased");
            } else {
                System.out.println("Minimum speed reached");
            }
        } else {
            System.out.println("Turn on the Cooler");
        }
    }
}
