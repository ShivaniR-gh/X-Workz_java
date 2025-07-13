public class Director {
    public static void startDirection(String title, String genre) {
        System.out.println("Director is planning the vision for the film...");
        ScriptWriter.writeScript(title, genre);
    }
}
