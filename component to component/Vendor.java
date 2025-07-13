public class Vendor {
    public static void confirmOrder(String item, int quantity) {
        System.out.println("Vendor confirmed the order...");
        Warehouse.packProduct(item, quantity);
    }
}
