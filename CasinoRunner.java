public class CasinoRunner {
    public static void main(String[] args) {

        Casino casino1 = new Casino();
        casino1.casinoId = 1001;
        casino1.name = "Golden Fortune";
        casino1.location = "Goa";
        casino1.isOpen24Hours = true;
        casino1.numberOfGames = 25;
        casino1.getCasinoInfo();
        
        Casino casino2 = new Casino();
        casino2.casinoId = 1002;
        casino2.name = "Silver Palace";
        casino2.location = "Las Vegas";
        casino2.isOpen24Hours = true;
        casino2.numberOfGames = 120;
          
         casino2.getCasinoInfo();

        Casino casino3 = new Casino();
        casino3.casinoId = 1003;
        casino3.name = "Royal Spin";
        casino3.location = "Macau";
        casino3.isOpen24Hours = false;
        casino3.numberOfGames = 90;

         casino1.getCasinoInfo();

        Casino casino4 = new Casino();
        casino4.casinoId = 1004;
        casino4.name = "Ocean Luck";
        casino4.location = "Singapore";
        casino4.isOpen24Hours = true;
        casino4.numberOfGames = 60;

         casino4.getCasinoInfo();
		 
        Casino casino5 = new Casino();
        casino5.casinoId = 1005;
        casino5.name = "Treasure Hunt";
        casino5.location = "Mumbai";
        casino5.isOpen24Hours = false;
        casino5.numberOfGames = 30;

         casino5.getCasinoInfo();

        Casino casino6 = new Casino();
        casino6.casinoId = 1006;
        casino6.name = "Jackpot Junction";
        casino6.location = "Panaji";
        casino6.isOpen24Hours = true;
        casino6.numberOfGames = 40;

         casino6.getCasinoInfo();

        Casino casino7 = new Casino();
        casino7.casinoId = 1007;
        casino7.name = "Spin & Win";
        casino7.location = "Dubai";
        casino7.isOpen24Hours = false;
        casino7.numberOfGames = 55;

         casino7.getCasinoInfo();
		 
        Casino casino8 = new Casino();
        casino8.casinoId = 1008;
        casino8.name = "Vegas Express";
        casino8.location = "California";
        casino8.isOpen24Hours = true;
        casino8.numberOfGames = 75;

         casino8.getCasinoInfo();
		 
        Casino casino9 = new Casino();
        casino9.casinoId = 1009;
        casino9.name = "Maharaja Casino";
        casino9.location = "Daman";
        casino9.isOpen24Hours = false;
        casino9.numberOfGames = 35;

         casino9.getCasinoInfo();

        Casino casino10 = new Casino();
        casino10.casinoId = 1010;
        casino10.name = "Black Diamond";
        casino10.location = "Manila";
        casino10.isOpen24Hours = true;
        casino10.numberOfGames = 100;

         casino10.getCasinoInfo();
    }
}
