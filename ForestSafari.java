public class ForestSafari {
    int safariId;
    String forestName;
    String state;
    int durationInHours;
    boolean hasGuide;

    public ForestSafari(int safariId, String forestName, String state, int durationInHours, boolean hasGuide) {
        this.safariId = safariId;
        this.forestName = forestName;
        this.state = state;
        this.durationInHours = durationInHours;
        this.hasGuide = hasGuide;
    }

    public void getSafariInfo() {
        System.out.println("Safari ID: " + safariId);
        System.out.println("Forest: " + forestName);
        System.out.println("State: " + state);
        System.out.println("Duration (hrs): " + durationInHours);
        System.out.println("Guide Provided: " + hasGuide);
        System.out.println("-----------------------------------");
    }
}
