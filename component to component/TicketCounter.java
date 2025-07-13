public class TicketCounter {
    public static void issueTickets(String movie, int numberOfTickets, String date, String time) {
        System.out.println("Ticket Counter is generating tickets...");
        Seat.reserve(movie, numberOfTickets, date, time);
    }
}
