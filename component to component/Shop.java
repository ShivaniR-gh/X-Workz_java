public class Shop {
    public static void sell(String veg, int quantity) {
        System.out.println("Shopkeeper is selling vegetables...");
        Agent.purchase(veg, quantity);
    }
}
