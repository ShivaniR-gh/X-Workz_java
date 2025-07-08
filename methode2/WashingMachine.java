class WashingMachine {
    static boolean startOrEnd = false;
    static int currentSpeed;
    static int maxSpeed = 3;
    static int minSpeed;

    public static void turnOnOrTurnOff() {
        if (startOrEnd == false) {
            startOrEnd = true;
            System.out.println("Washing Machine is ON now");
        } else {
            startOrEnd = false;
            System.out.println("Washing Machine is OFF");
        }
    }

    public static void increaseSpeed() {
        if (startOrEnd == true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed++;
                System.out.println("Washing speed increased");
            } else {
                System.out.println("Maximum speed reached");
            }
        } else {
            System.out.println("Turn on the Washing Machine");
        }
    }

    public static void decreaseSpeed() {
        if (startOrEnd == true) {
            if (currentSpeed > minSpeed) {
                currentSpeed--;
                System.out.println("Washing speed decreased");
            } else {
                System.out.println("Minimum speed reached");
            }
        } else {
            System.out.println("Turn on the Washing Machine");
        }
    }
}
