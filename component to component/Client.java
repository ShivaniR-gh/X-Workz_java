public class Client {
    public static void bookProperty(String name, String propertyType) {
        System.out.println("Client is booking a property...");
        RealEstatePortal.processRequest(name, propertyType);

        System.out.println("-------- Property Booking Summary --------");
        System.out.println("Client Name    : " + name);
        System.out.println("Property Type  : " + propertyType);
    }
}
