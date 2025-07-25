public class Casino {
    int casinoId;
    String name;
    String location;
    boolean isOpen24Hours;
    int numberOfGames;
	
	public void getCasinoInfo(){
	    System.out.println("Casino ID: " + casinoId);
        System.out.println("Name: " + name);
        System.out.println("Location: " +  location);
        System.out.println("Open 24 Hours: " + isOpen24Hours);
        System.out.println("Number of Games: " +  numberOfGames);
        System.out.println("------------------------------------------");
	}
}
