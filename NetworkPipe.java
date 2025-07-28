public class NetworkPipe {
    int pipeId;
    String pipeType;
    String material;
    int bandwidthMbps;
    boolean isUnderground;

    public NetworkPipe(int pipeId, String pipeType, String material, int bandwidthMbps, boolean isUnderground) {
        this.pipeId = pipeId;
        this.pipeType = pipeType;
        this.material = material;
        this.bandwidthMbps = bandwidthMbps;
        this.isUnderground = isUnderground;
    }

    public void getNetworkPipeInfo() {
        System.out.println("Pipe ID: " + pipeId);
        System.out.println("Type: " + pipeType);
        System.out.println("Material: " + material);
        System.out.println("Bandwidth: " + bandwidthMbps + " Mbps");
        System.out.println("Underground: " + isUnderground);
        System.out.println("-----------------------------------");
    }
}
