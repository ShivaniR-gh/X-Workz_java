public class StockManager {
    public static void verify(String product, int quantity) {
        System.out.println("Stock manager is verifying the inventory...");
        ProductUnit.release(product, quantity);
    }
}
