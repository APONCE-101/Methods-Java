public class MethodsPracticeEC {

    public static void main(String[] args) {
        openCharacterHistory();

    }

    public static String displayCharacter(String username) {
        return username + " is being displayed.";
    }

    public static String getCharacterHighScores(int charactersKilled) {
        return "Highest kills: " + charactersKilled;
    }

    public static void openCharacterHistory() {
        System.out.println(displayCharacter("Username"));
        System.out.println(getCharacterHighScores(10000));
    }

}
