public class ITSupport {
    public static void approveRequest(String name, String designation) {
        System.out.println("IT Support is approving and logging the request...");
        AssetTeam.checkAssets(name, designation);
    }
}
