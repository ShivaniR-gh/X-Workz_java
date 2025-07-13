public class Broker {
    public static void brokerage(String veg, int quantity) {
        System.out.println("Broker is charging commission and contacting the farmer...");
        Farmer.farm(veg, quantity);
    }
}
