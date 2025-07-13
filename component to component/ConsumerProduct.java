public class ConsumerProduct {
    public static void purchase(String product, int quantity) {
        System.out.println("Consumer is purchasing essential products...");
        ShopPortal.order(product, quantity);

        System.out.println("-------- Purchase Receipt --------");
        System.out.println("Product   : " + product);
        System.out.println("Quantity  : " + quantity);
    }
}
