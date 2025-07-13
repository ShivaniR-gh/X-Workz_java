public class MovieTicketRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        User.buyTicket("Avengers: Endgame", 3, "10-07-2025", "6:30 PM");
        System.out.println("Main ended");
    }
}
