public class InventoryControl {
    public static void validate(String name, String designation) {
        System.out.println("Inventory control has validated the asset...");
        LaptopUnit.issue(name, designation);
    }
}
