public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("Statements, whitespace and indentation");
        System.out.println("------------------------------------------------------------");

        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("This is " +
                "another " +
                "still more");

        System.out.println("------------------------------------------------------------");
        System.out.println("Code blocks");
        System.out.println("------------------------------------------------------------");

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, 8, 200);

        boolean secondGameOver = true;
        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less then 5000 and greater then 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score is less then 1000");
//        } else {
//            System.out.println("You got there!");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore);
        }
        if (secondGameOver) {
            int secondFinalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("Your second final score = " + secondFinalScore);

        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Methods");
        System.out.println("------------------------------------------------------------");
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("------------Methods------------");
            System.out.println("Your final score is: " + finalScore);
        }


    }

}

