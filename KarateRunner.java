public class KarateRunner {
    public static void main(String[] args) {

        Karate karate1 = new Karate();
        karate1.karateId = 501;
        karate1.beltLevel = "White";
        karate1.style = "Shotokan";
        karate1.trainingHours = 10;
        karate1.isTournamentPlayer = false;

        karate1.getKarate();


        Karate karate2 = new Karate();
        karate2.karateId = 502;
        karate2.beltLevel = "Yellow";
        karate2.style = "Goju-Ryu";
        karate2.trainingHours = 20;
        karate2.isTournamentPlayer = false;

        karate2.getKarate();

        Karate karate3 = new Karate();
        karate3.karateId = 503;
        karate3.beltLevel = "Orange";
        karate3.style = "Wado-Ryu";
        karate3.trainingHours = 35;
        karate3.isTournamentPlayer = true;

        karate3.getKarate();

        Karate karate4 = new Karate();
        karate4.karateId = 504;
        karate4.beltLevel = "Green";
        karate4.style = "Kyokushin";
        karate4.trainingHours = 50;
        karate4.isTournamentPlayer = true;

       karate4.getKarate();

        Karate karate5 = new Karate();
        karate5.karateId = 505;
        karate5.beltLevel = "Blue";
        karate5.style = "Shito-Ryu";
        karate5.trainingHours = 70;
        karate5.isTournamentPlayer = false;

        karate5.getKarate();

        Karate karate6 = new Karate();
        karate6.karateId = 506;
        karate6.beltLevel = "Purple";
        karate6.style = "Shotokan";
        karate6.trainingHours = 90;
        karate6.isTournamentPlayer = true;

        karate6.getKarate();

        Karate karate7 = new Karate();
        karate7.karateId = 507;
        karate7.beltLevel = "Brown";
        karate7.style = "Goju-Ryu";
        karate7.trainingHours = 120;
        karate7.isTournamentPlayer = true;

        karate7.getKarate();
		
        Karate karate8 = new Karate();
        karate8.karateId = 508;
        karate8.beltLevel = "Red";
        karate8.style = "Wado-Ryu";
        karate8.trainingHours = 150;
        karate8.isTournamentPlayer = true;

       karate8.getKarate();
	   
        Karate karate9 = new Karate();
        karate9.karateId = 509;
        karate9.beltLevel = "Black";
        karate9.style = "Kyokushin";
        karate9.trainingHours = 200;
        karate9.isTournamentPlayer = true;

        karate9.getKarate();
	}
}