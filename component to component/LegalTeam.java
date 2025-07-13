public class LegalTeam {
    public static void reviewDocuments(String name, String propertyType) {
        System.out.println("Legal team is reviewing property documents...");
        DocumentVerifier.verify(name, propertyType);
    }
}
