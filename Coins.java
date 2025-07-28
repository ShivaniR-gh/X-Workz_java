public class Coins {
    int coinId;
    String country;
    int year;
    String metal;
    double diameter;

    public Coins(int coinId, String country, int year, String metal, double diameter) {
        this.coinId = coinId;
        this.country = country;
        this.year = year;
        this.metal = metal;
        this.diameter = diameter;
    }

    public void getCoinInfo() {
        System.out.println("Coin ID: " + coinId);
        System.out.println("Country: " + country);
        System.out.println("Year: " + year);
        System.out.println("Metal: " + metal);
        System.out.println("Diameter: " + diameter + " mm");
        System.out.println("-----------------------------------");
    }
}
