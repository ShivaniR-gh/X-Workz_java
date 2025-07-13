public class Website {
    public static void book(String movie, int numberOfTickets, String date, String time) {
        System.out.println("Website is processing the booking...");
        Theater.allocate(movie, numberOfTickets, date, time);
    }
}
