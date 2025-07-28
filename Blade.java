public class Blade {
    int bladeId;
    String brand;
    String type;
    String material;
    boolean isReusable;

    public Blade(int bladeId, String brand, String type, String material, boolean isReusable) {
        this.bladeId = bladeId;
        this.brand = brand;
        this.type = type;
        this.material = material;
        this.isReusable = isReusable;
    }

    public void getBladeInfo() {
        System.out.println("Blade ID: " + bladeId);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Reusable: " + isReusable);
        System.out.println("-----------------------------------");
    }
}
