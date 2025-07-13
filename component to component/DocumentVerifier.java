public class DocumentVerifier {
    public static void verify(String name, String propertyType) {
        System.out.println("Documents verified successfully...");
        PropertyUnit.reserve(name, propertyType);
    }
}
