public class Buyer {
    public static void purchase(String item, int quantity) {
        System.out.println("Buyer initiated the product purchase...");
        Platform.processOrder(item, quantity);

        System.out.println("--------Order Summary--------");
        System.out.println("Item     : " + item);
        System.out.println("Quantity : " + quantity);
    }
}
