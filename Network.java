public class Network {
    int networkId;
    String name;
    String type;
    double bandwidthMbps;
    boolean isSecure;

    public Network(int networkId, String name, String type, double bandwidthMbps, boolean isSecure) {
        this.networkId = networkId;
        this.name = name;
        this.type = type;
        this.bandwidthMbps = bandwidthMbps;
        this.isSecure = isSecure;
    }

    public void getNetworkInfo() {
        System.out.println("Network ID: " + networkId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Bandwidth: " + bandwidthMbps + " Mbps");
        System.out.println("Secure: " + isSecure);
        System.out.println("-----------------------------------");
    }
}
