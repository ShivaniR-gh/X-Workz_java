public class Festival {
    String name;
    String season;
    String originCountry;
    boolean isReligious;
    int durationInDays;
    double budget;
	public void getFestivalInfo(){
		System.out.println("Name: " +  name);
        System.out.println("Season: " +  season);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Religious: " +  isReligious);
        System.out.println("Duration (days): " +  durationInDays);
        System.out.println("Budget: " +  budget);
        System.out.println("------------------------------------------");
	}
}
