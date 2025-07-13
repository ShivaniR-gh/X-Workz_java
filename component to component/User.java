public class User {
    public static void buyTicket(String movie, int numberOfTickets, String date, String time) {
        System.out.println("User is trying to buy movie tickets...");
        Website.book(movie, numberOfTickets, date, time);

        System.out.println("---------Ticket Booking Details----------");
        System.out.println("Movie Name           : " + movie);
        System.out.println("Number of Tickets    : " + numberOfTickets);
        System.out.println("Date of Show         : " + date);
        System.out.println("Show Time            : " + time);
    }
}
