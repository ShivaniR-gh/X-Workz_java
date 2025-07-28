public class GymEquipment {
    int equipmentId;
    String name;
    String type;
    double weight;
    boolean isAvailable;

    public GymEquipment(int equipmentId, String name, String type, double weight, boolean isAvailable) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.isAvailable = isAvailable;
    }

    public void getEquipmentInfo() {
        System.out.println("Equipment ID: " + equipmentId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Available: " + isAvailable);
        System.out.println("-----------------------------------");
    }
}
