public class Platform {
    public static void processOrder(String item, int quantity) {
        System.out.println("Website is processing the order...");
        Vendor.confirmOrder(item, quantity);
    }
}
