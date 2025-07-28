public class InvitationCard {
    int cardId;
    String eventName;
    String hostName;
    String venue;
    boolean isPrinted;

    public InvitationCard(int cardId, String eventName, String hostName, String venue, boolean isPrinted) {
        this.cardId = cardId;
        this.eventName = eventName;
        this.hostName = hostName;
        this.venue = venue;
        this.isPrinted = isPrinted;
    }

    public void getInvitationCardInfo() {
        System.out.println("Card ID: " + cardId);
        System.out.println("Event Name: " + eventName);
        System.out.println("Host Name: " + hostName);
        System.out.println("Venue: " + venue);
        System.out.println("Is Printed: " + isPrinted);
        System.out.println("-----------------------------------");
    }
}
`
