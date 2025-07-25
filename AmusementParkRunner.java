public class AmusementParkRunner {
    public static void main(String[] args) {
        AmusementPark park1 = new AmusementPark();
        park1.parkId = 601;
        park1.name = "Wonderla";
        park1.city = "Bangalore";
        park1.ridesCount = 30;
        park1.hasWaterPark = true;
        park1.getAmusementParkInfo();

        AmusementPark park2 = new AmusementPark();
        park2.parkId = 602;
        park2.name = "Imagicaa";
        park2.city = "Mumbai";
        park2.ridesCount = 40;
        park2.hasWaterPark = true;
        park2.getAmusementParkInfo();

        AmusementPark park3 = new AmusementPark();
        park3.parkId = 603;
        park3.name = "Essel World";
        park3.city = "Mumbai";
        park3.ridesCount = 25;
        park3.hasWaterPark = false;
        park3.getAmusementParkInfo();

        AmusementPark park4 = new AmusementPark();
        park4.parkId = 604;
        park4.name = "Kingdom of Dreams";
        park4.city = "Gurgaon";
        park4.ridesCount = 20;
        park4.hasWaterPark = false;
        park4.getAmusementParkInfo();
		
		
        AmusementPark park5 = new AmusementPark();
        park5.parkId = 605;
        park5.name = "Nicco Park";
        park5.city = "Kolkata";
        park5.ridesCount = 35;
        park5.hasWaterPark = true;
        park5.getAmusementParkInfo();
		
        AmusementPark park6 = new AmusementPark();
        park6.parkId = 606;
        park6.name = "Ramoji Film City";
        park6.city = "Hyderabad";
        park6.ridesCount = 15;
        park6.hasWaterPark = false;
        park6.getAmusementParkInfo();
		
        AmusementPark park7 = new AmusementPark();
        park7.parkId = 607;
        park7.name = "Adventure Island";
        park7.city = "Delhi";
        park7.ridesCount = 28;
        park7.getAmusementParkInfo();

        AmusementPark park8 = new AmusementPark();
        park8.parkId = 608;
        park8.name = "Snow Kingdom";
        park8.city = "Chennai";
        park8.ridesCount = 18;
        park8.hasWaterPark = false;
        park8.getAmusementParkInfo();

        AmusementPark park9 = new AmusementPark();
        park9.parkId = 609;
        park9.name = "Fun World";
        park9.city = "Bangalore";
        park9.ridesCount = 22;
        park9.hasWaterPark = true;
       park9.getAmusementParkInfo();

        AmusementPark park10 = new AmusementPark();
        park10.parkId = 610;
        park10.name = "Fun City";
        park10.city = "Ahmedabad";
        park10.ridesCount = 26;
        park10.hasWaterPark = false;
        park10.getAmusementParkInfo();
    }
}
