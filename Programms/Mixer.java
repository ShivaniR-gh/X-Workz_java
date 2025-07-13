class Mixer {
    static boolean startOrEnd = false;
    static int currentSpeed;
    static int maxSpeed = 5;
    static int minSpeed;

    public static void turnOnOrTurnOff() {
        if (startOrEnd == false) {
            startOrEnd = true;
            System.out.println("Mixer is ON now");
        } else {
            startOrEnd = false;
            System.out.println("Mixer is OFF");
        }
    }

    public static void increaseSpeed() {
        if (startOrEnd == true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed++;
                System.out.println("Mixer speed increased");
            } else {
                System.out.println("Max speed reached");
            }
        } else {
            System.out.println("Turn on the mixer");
        }
    }

    public static void decreaseSpeed() {
        if (startOrEnd == true) {
            if (currentSpeed > minSpeed) {
                currentSpeed--;
                System.out.println("Mixer speed decreased");
            } else {
                System.out.println("Min speed reached");
            }
        } else {
            System.out.println("Turn on the mixer");
        }
    }
}
