public class RealEstatePortal {
    public static void processRequest(String name, String propertyType) {
        System.out.println("Portal is processing the booking...");
        RealEstateAgent.assign(name, propertyType);
    }
}
