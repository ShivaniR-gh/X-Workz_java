public class Warehouse {
    public static void packProduct(String item, int quantity) {
        System.out.println("Warehouse is packing the product...");
        QualityCheck.inspect(item, quantity);
    }
}
