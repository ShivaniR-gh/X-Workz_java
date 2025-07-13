public class Theater {
    public static void allocate(String movie, int numberOfTickets, String date, String time) {
        System.out.println("Theater received booking info...");
        Manager.manageBooking(movie, numberOfTickets, date, time);
    }
}
