public class CoinsRunner {
    public static void main(String[] args) {

        Coins coin1 = new Coins();
        coin1.country = "India";
        coin1.year = 1950;
        coin1.material = "Copper";
        coin1.value = 0.5;
        coin1.isRare = true;
        coin1.shape = "Round";
        coins1.getCoinsInfo();
		
        Coins coin2 = new Coins();
        coin2.country = "USA";
        coin2.year = 1990;
        coin2.material = "Nickel";
        coin2.value = 0.25;
        coin2.isRare = false;
        coin2.shape = "Round";
		coins2.getCoinsInfo();
		

        Coins coin3 = new Coins();
        coin3.country = "UK";
        coin3.year = 2005;
        coin3.material = "Silver";
        coin3.value = 1.0;
        coin3.isRare = false;
        coin3.shape = "Octagon";

        coins3.getCoinsInfo();

        Coins coin4 = new Coins();
        coin4.country = "Australia";
        coin4.year = 1980;
        coin4.material = "Bronze";
        coin4.value = 0.2;
        coin4.isRare = true;
        coin4.shape = "Circle";
		coins4.getCoinsInfo();

        Coins coin5 = new Coins();
        coin5.country = "Japan";
        coin5.year = 2010;
        coin5.material = "Aluminum";
        coin5.value = 0.1;
        coin5.isRare = false;
        coin5.shape = "Round with hole";

        coins5.getCoinsInfo();
		
        Coins coin6 = new Coins();
        coin6.country = "Germany";
        coin6.year = 1945;
        coin6.material = "Iron";
        coin6.value = 0.05;
        coin6.isRare = true;
        coin6.shape = "Hexagon";

        coins6.getCoinsInfo();
		
        Coins coin7 = new Coins();
        coin7.country = "Canada";
        coin7.year = 2000;
        coin7.material = "Steel";
        coin7.value = 2.0;
        coin7.isRare = false;
        coin7.shape = "Round";

       coins7.getCoinsInfo();

        Coins coin8 = new Coins();
        coin8.country = "Russia";
        coin8.year = 1985;
        coin8.material = "Copper-Nickel";
        coin8.value = 0.5;
        coin8.isRare = true;
        coin8.shape = "Oval";

        coins8.getCoinsInfo();

        Coins coin9 = new Coins();
        coin9.country = "France";
        coin9.year = 1970;
        coin9.material = "Brass";
        coin9.value = 1.5;
        coin9.isRare = true;
        coin9.shape = "Square";

        coins9.getCoinsInfo();

        Coins coin10 = new Coins();
        coin10.country = "Brazil";
        coin10.year = 1995;
        coin10.material = "Nickel-Plated Steel";
        coin10.value = 0.75;
        coin10.isRare = false;
        coin10.shape = "Round";

        coins10.getCoinsInfo();
    }
}
