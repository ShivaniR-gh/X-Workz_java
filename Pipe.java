public class Pipe {
    int pipeId;
    String material;
    double diameterInInches;
    double lengthInFeet;
    boolean isFlexible;

    public Pipe(int pipeId, String material, double diameterInInches, double lengthInFeet, boolean isFlexible) {
        this.pipeId = pipeId;
        this.material = material;
        this.diameterInInches = diameterInInches;
        this.lengthInFeet = lengthInFeet;
        this.isFlexible = isFlexible;
    }

    public void getPipeInfo() {
        System.out.println("Pipe ID: " + pipeId);
        System.out.println("Material: " + material);
        System.out.println("Diameter: " + diameterInInches + " inches");
        System.out.println("Length: " + lengthInFeet + " feet");
        System.out.println("Flexible: " + isFlexible);
        System.out.println("----------------------------------");
    }
}
