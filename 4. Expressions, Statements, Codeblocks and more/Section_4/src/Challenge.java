public class Challenge {
    public static void main(String[] args) {
        int position = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Jane", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Seb", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Patrick", position);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table ");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }
}

