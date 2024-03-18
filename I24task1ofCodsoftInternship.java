import java.util.Random;
import java.util.Scanner;

public class I24task1ofCodsoftInternship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ". Guess what it is!");
            int attempts = 0;

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score++;
                    break;
                }

                attempts++;
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.nextLine();
            playAgain = playChoice.equalsIgnoreCase("yes");
        }

        System.out.println("Game over. Your final score is: " + score);

        scanner.close();
    }
}
