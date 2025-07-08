class TV {
    static boolean startOrEnd = false;
    static int currentVolume;
    static int maxVolume = 15;
    static int minVolume;

    public static void turnOnOrTurnOff() {
        if (startOrEnd == false) {
            startOrEnd = true;
            System.out.println("TV is ON now");
        } else {
            startOrEnd = false;
            System.out.println("TV is OFF");
        }
    }

    public static void increaseVolume() {
        if (startOrEnd == true) {
            if (currentVolume < maxVolume) {
                currentVolume++;
                System.out.println("TV volume increased");
            } else {
                System.out.println("Maximum volume reached");
            }
        } else {
            System.out.println("Turn on the TV");
        }
    }

    public static void decreaseVolume() {
        if (startOrEnd == true) {
            if (currentVolume > minVolume) {
                currentVolume--;
                System.out.println("TV volume decreased");
            } else {
                System.out.println("Minimum volume reached");
            }
        } else {
            System.out.println("Turn on the TV");
        }
    }
}
