public class QualityCheck {
    public static void inspect(String item, int quantity) {
        System.out.println("Quality check completed...");
        Delivery.ship(item, quantity);
    }
}
