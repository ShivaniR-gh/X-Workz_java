public class Fish {
    int fishId;
    String species;
    String color;
    String habitat;
    boolean isEdible;

    public Fish(int fishId, String species, String color, String habitat, boolean isEdible) {
        this.fishId = fishId;
        this.species = species;
        this.color = color;
        this.habitat = habitat;
        this.isEdible = isEdible;
    }

    public void getFishInfo() {
        System.out.println("Fish ID: " + fishId);
        System.out.println("Species: " + species);
        System.out.println("Color: " + color);
        System.out.println("Habitat: " + habitat);
        System.out.println("Edible: " + isEdible);
        System.out.println("-----------------------------------");
    }
}
