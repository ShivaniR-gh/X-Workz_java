public class Customer {
    public static void buy(String veg, int quantity) {
        System.out.println("Customer is buying vegetables...");
        Shop.sell(veg, quantity);
        System.out.println("----------Customer Details----------");
        System.out.println("Vegetable       : " + veg);
        System.out.println("Quantity in kg  : " + quantity);
    }
}
