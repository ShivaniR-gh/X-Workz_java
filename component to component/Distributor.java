public class Distributor {
    public static void dispatch(String product, int quantity) {
        System.out.println("Distributor is handling the product dispatch...");
        StorageUnit.prepare(product, quantity);
    }
}
