public class RealEstateAgent {
    public static void assign(String name, String propertyType) {
        System.out.println("Agent is handling client assignment...");
        LegalTeam.reviewDocuments(name, propertyType);
    }
}
