public class GiTag {
    int id;
    String productName;
    String state;
    String category;
    boolean isHandmade;

    public GiTag(int id, String productName, String state, String category, boolean isHandmade) {
        this.id = id;
        this.productName = productName;
        this.state = state;
        this.category = category;
        this.isHandmade = isHandmade;
    }

    public void getGiTagInfo() {
        System.out.println("ID: " + id);
        System.out.println("Product Name: " + productName);
        System.out.println("State: " + state);
        System.out.println("Category: " + category);
        System.out.println("Handmade: " + isHandmade);
        System.out.println("---------------------------");
    }
}
