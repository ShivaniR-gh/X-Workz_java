public class Producer {
    public static void makeMovie(String title, String genre) {
        System.out.println("Producer is initiating the movie project...");
        Director.startDirection(title, genre);

        System.out.println("-------- Movie Details --------");
        System.out.println("Title : " + title);
        System.out.println("Genre : " + genre);
    }
}
