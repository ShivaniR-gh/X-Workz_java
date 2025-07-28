public class NetworkPipeRunner {
    public static void main(String[] args) {
        NetworkPipe n1 = new NetworkPipe(901, "Fiber Optic", "Glass", 1000, true); n1.getNetworkPipeInfo();
        NetworkPipe n2 = new NetworkPipe(902, "Copper", "Copper", 100, false); n2.getNetworkPipeInfo();
        NetworkPipe n3 = new NetworkPipe(903, "PVC", "Plastic", 200, true); n3.getNetworkPipeInfo();
        NetworkPipe n4 = new NetworkPipe(904, "Steel", "Steel", 500, false); n4.getNetworkPipeInfo();
        NetworkPipe n5 = new NetworkPipe(905, "Coaxial", "Copper", 300, true); n5.getNetworkPipeInfo();
        NetworkPipe n6 = new NetworkPipe(906, "Underground Fiber", "Glass", 1000, true); n6.getNetworkPipeInfo();
        NetworkPipe n7 = new NetworkPipe(907, "Aerial Cable", "Plastic", 250, false); n7.getNetworkPipeInfo();
        NetworkPipe n8 = new NetworkPipe(908, "Trunk Cable", "Aluminium", 800, true); n8.getNetworkPipeInfo();
        NetworkPipe n9 = new NetworkPipe(909, "Distribution Cable", "PVC", 600, false); n9.getNetworkPipeInfo();
        NetworkPipe n10 = new NetworkPipe(910, "Drop Cable", "Rubber", 150, true); n10.getNetworkPipeInfo();
        NetworkPipe n11 = new NetworkPipe(911, "Shielded Cable", "Aluminium", 400, false); n11.getNetworkPipeInfo();
        NetworkPipe n12 = new NetworkPipe(912, "Patch Cable", "Plastic", 100, true); n12.getNetworkPipeInfo();
        NetworkPipe n13 = new NetworkPipe(913, "Hybrid Cable", "Glass + Copper", 700, true); n13.getNetworkPipeInfo();
        NetworkPipe n14 = new NetworkPipe(914, "Ribbon Fiber", "Glass", 900, true); n14.getNetworkPipeInfo();
        NetworkPipe n15 = new NetworkPipe(915, "Armored Cable", "Steel", 500, true); n15.getNetworkPipeInfo();
        NetworkPipe n16 = new NetworkPipe(916, "Loose Tube", "Plastic", 300, false); n16.getNetworkPipeInfo();
        NetworkPipe n17 = new NetworkPipe(917, "Tight Buffer", "PVC", 200, false); n17.getNetworkPipeInfo();
        NetworkPipe n18 = new NetworkPipe(918, "Aerial Fiber", "Glass", 600, false); n18.getNetworkPipeInfo();
        NetworkPipe n19 = new NetworkPipe(919, "Direct Burial", "Rubber", 1000, true); n19.getNetworkPipeInfo();
        NetworkPipe n20 = new NetworkPipe(920, "Indoor Fiber", "Plastic", 400, false); n20.getNetworkPipeInfo();
    }
}
