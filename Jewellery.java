public class Jewellery {
    int jewelleryId;
    String type;
    String material;
    double weight;
    boolean isHallmarked;

    public Jewellery(int jewelleryId, String type, String material, double weight, boolean isHallmarked) {
        this.jewelleryId = jewelleryId;
        this.type = type;
        this.material = material;
        this.weight = weight;
        this.isHallmarked = isHallmarked;
    }

    public void getJewelleryInfo() {
        System.out.println("Jewellery ID: " + jewelleryId);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Hallmarked: " + isHallmarked);
        System.out.println("-----------------------------------");
    }
}
