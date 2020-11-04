package com.SebastiaanLammertink;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was: " + highScore );
        System.out.println("Your final score was: " + calculateScore(true, 800, 5, 100));
        System.out.println("Your final score was: " + calculateScore(true, 10000, 8, 200));

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);
        highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Maria", highScorePosition);
        highScorePosition = calculateHighScorePosition(250);
        displayHighScorePosition("Jorien", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Jan", highScorePosition);
    }

    public static void displayHighScorePosition( String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
        + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        }else if (playerScore >= 500 ) {
            return 2;
        }else if (playerScore >= 100 ){
            return 3;
        }else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }

    }
}
