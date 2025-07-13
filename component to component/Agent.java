public class Agent {
    public static void purchase(String veg, int quantity) {
        System.out.println("Agent is purchasing vegetables from broker...");
        Broker.brokerage(veg, quantity);
    }
}
