public class Bangle {
    int bangleId;
    String material;
    String color;
    String origin;
    boolean isTraditional;

    public Bangle(int bangleId, String material, String color, String origin, boolean isTraditional) {
        this.bangleId = bangleId;
        this.material = material;
        this.color = color;
        this.origin = origin;
        this.isTraditional = isTraditional;
    }

    public void getBangleInfo() {
        System.out.println("Bangle ID: " + bangleId);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Origin: " + origin);
        System.out.println("Traditional: " + isTraditional);
        System.out.println("---------------------------");
    }
}
