public class NetworkRunner {
    public static void main(String[] args) {
        Network net1 = new Network(301, "Airtel Fiber", "Broadband", 100.0, true);
        net1.getNetworkInfo();

        Network net2 = new Network(302, "Jio 5G", "Mobile", 250.0, true);
        net2.getNetworkInfo();

        Network net3 = new Network(303, "ACT", "Broadband", 150.0, true);
        net3.getNetworkInfo();

        Network net4 = new Network(304, "BSNL", "DSL", 40.0, false);
        net4.getNetworkInfo();

        Network net5 = new Network(305, "Vodafone", "Mobile", 70.0, true);
        net5.getNetworkInfo();

        Network net6 = new Network(306, "MTNL", "DSL", 20.0, false);
        net6.getNetworkInfo();

        Network net7 = new Network(307, "Hathway", "Broadband", 120.0, true);
        net7.getNetworkInfo();

        Network net8 = new Network(308, "Excitel", "Broadband", 200.0, true);
        net8.getNetworkInfo();

        Network net9 = new Network(309, "You Broadband", "Broadband", 110.0, true);
        net9.getNetworkInfo();

        Network net10 = new Network(310, "Spectra", "Broadband", 150.0, true);
        net10.getNetworkInfo();

        Network net11 = new Network(311, "RailWire", "Fiber", 90.0, true);
        net11.getNetworkInfo();

        Network net12 = new Network(312, "Tata Play Fiber", "Fiber", 300.0, true);
        net12.getNetworkInfo();

        Network net13 = new Network(313, "Google Fi", "Mobile", 200.0, true);
        net13.getNetworkInfo();

        Network net14 = new Network(314, "Reliance Jio", "Mobile", 180.0, true);
        net14.getNetworkInfo();

        Network net15 = new Network(315, "Idea Cellular", "Mobile", 60.0, false);
        net15.getNetworkInfo();

        Network net16 = new Network(316, "AOL Broadband", "Cable", 50.0, false);
        net16.getNetworkInfo();

        Network net17 = new Network(317, "Netgear", "Private", 500.0, true);
        net17.getNetworkInfo();

        Network net18 = new Network(318, "TP-Link Mesh", "Private", 350.0, true);
        net18.getNetworkInfo();

        Network net19 = new Network(319, "Cisco Enterprise", "Corporate", 1000.0, true);
        net19.getNetworkInfo();

        Network net20 = new Network(320, "Juniper Secure", "Corporate", 800.0, true);
        net20.getNetworkInfo();
    }
}
