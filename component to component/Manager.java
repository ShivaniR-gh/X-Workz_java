public class Manager {
    public static void manageBooking(String movie, int numberOfTickets, String date, String time) {
        System.out.println("Manager is approving ticket booking...");
        TicketCounter.issueTickets(movie, numberOfTickets, date, time);
    }
}
