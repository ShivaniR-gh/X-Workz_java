class Pizza {

    static String shopOpen;
    static String cheeze;
    static String lSize;
    static String sSize;
    static int qt;
    static double cost;

    public static boolean getPizzaInfo(String isShopOpen, String isCheezeAdded, 
	String isLargeSize, String isSmallsized, int quantity, double price) {
        boolean cheezePizza = false;
        boolean shopOpened = false;
        boolean cheezeAddeded = false;
        boolean smallSize = false;
        boolean numberOfPizza = false;
        boolean largeSize = false;

        
        if (isShopOpen != null) {
            shopOpen = isShopOpen;
            shopOpened = true;
        }
        if (isCheezeAdded != null) {
            cheeze = isCheezeAdded;
            cheezeAddeded = true;
        }
        if (isLargeSize != null) {
            lSize = isLargeSize;
            largeSize = true;
        }
        if (isSmallsized != null) {
            sSize = isSmallsized;
            smallSize = true;
        }
        if (quantity != 0) {
            qt = quantity;
            numberOfPizza = true;
        }
        if (price != 0) {
            cost = price;
        }

        if (shopOpened == true 
    && cheezeAddeded == true 
    && cost <= 250 
    && smallSize == true 
    && qt == 1 
    && largeSize == false) {
    cheezePizza = true;
}


        return cheezePizza;
    }

    public static void getPizzaInfo() {
        System.out.println("The pizza shop is " + shopOpen);
        System.out.println("Cheese added? " + cheeze);
        System.out.println("Large size? " + lSize);
        System.out.println("Small size? " + sSize);
        System.out.println("The quantity is " + qt);
        System.out.println("The pizza price is ₹" + cost);
    }
}
