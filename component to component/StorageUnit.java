public class StorageUnit {
    public static void prepare(String product, int quantity) {
        System.out.println("Storage unit is preparing the package...");
        StockManager.verify(product, quantity);
    }
}
