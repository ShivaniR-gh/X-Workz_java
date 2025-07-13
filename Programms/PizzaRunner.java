class PizzaRunner {

    public static void main(String pizza[]) {

        boolean PizzaShop = Pizza.getPizzaInfo("yes", "yes", "yes", "no", 1, 245);
        System.out.println("Is Cheese Pizza Prepared? " + PizzaShop);

        Pizza.getPizzaInfo();
    }
}
