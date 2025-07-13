public class ShopPortal {
    public static void order(String product, int quantity) {
        System.out.println("ShopPortal is processing the consumer's order...");
        Distributor.dispatch(product, quantity);
    }
}
