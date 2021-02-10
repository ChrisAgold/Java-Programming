package methods;

public class Main {
    public static void main(String[] args) {

        // Calling Method
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        // Alternative way to call method with variables already defined
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        calculateScore(gameOver, score, levelCompleted, bonus);

    }

    // Method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1; // -1 usually means there is an error
    }
}

