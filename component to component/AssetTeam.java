public class AssetTeam {
    public static void checkAssets(String name, String designation) {
        System.out.println("Asset team is checking laptop availability...");
        InventoryControl.validate(name, designation);
    }
}
