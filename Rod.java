public class Rod {
    int rodId;
    String material;
    double length;
    double diameter;
    boolean isHollow;

    public Rod(int rodId, String material, double length, double diameter, boolean isHollow) {
        this.rodId = rodId;
        this.material = material;
        this.length = length;
        this.diameter = diameter;
        this.isHollow = isHollow;
    }

    public void getRodInfo() {
        System.out.println("Rod ID: " + rodId);
        System.out.println("Material: " + material);
        System.out.println("Length: " + length + " m");
        System.out.println("Diameter: " + diameter + " cm");
        System.out.println("Is Hollow: " + isHollow);
        System.out.println("-----------------------------------");
    }
}
