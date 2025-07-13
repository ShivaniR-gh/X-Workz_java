public class ScriptWriter {
    public static void writeScript(String title, String genre) {
        System.out.println("ScriptWriter is writing the storyline...");
        CastingTeam.selectCast(title, genre);
    }
}
