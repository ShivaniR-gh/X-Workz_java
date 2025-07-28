public class Blazer {
    int blazerId;
    String brand;
    String color;
    String fabric;
    boolean isFormal;

    public Blazer(int blazerId, String brand, String color, String fabric, boolean isFormal) {
        this.blazerId = blazerId;
        this.brand = brand;
        this.color = color;
        this.fabric = fabric;
        this.isFormal = isFormal;
    }

    public void getBlazerInfo() {
        System.out.println("Blazer ID: " + blazerId);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Fabric: " + fabric);
        System.out.println("Is Formal: " + isFormal);
        System.out.println("-----------------------------------");
    }
}
