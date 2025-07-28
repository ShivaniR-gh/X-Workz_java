public class HairClip {
    int clipId;
    String brand;
    String color;
    String material;
    boolean isDecorated;

    public HairClip(int clipId, String brand, String color, String material, boolean isDecorated) {
        this.clipId = clipId;
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.isDecorated = isDecorated;
    }

    public void getHairClipInfo() {
        System.out.println("Clip ID: " + clipId);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Decorated: " + isDecorated);
        System.out.println("-----------------------------------");
    }
}
