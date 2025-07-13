public class AdminDesk {
    public static void forwardRequest(String name, String designation) {
        System.out.println("AdminDesk is forwarding the laptop request to IT support...");
        ITSupport.approveRequest(name, designation);
    }
}
