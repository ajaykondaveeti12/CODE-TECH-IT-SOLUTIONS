import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 5;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("\nI've selected a number between " + minRange + " and " + maxRange + ". Try to guess it!");

            int attempts = 0;
            boolean guessed = false;
            while (!guessed && attempts < attemptsLimit) {
                System.out.print("Enter your guess (attempt " + (attempts + 1) + "/" + attemptsLimit + "): ");
                int userGuess = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                    guessed = true;
                    score += 1;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }
                attempts++;
            }

            if (!guessed) {
                System.out.println("\nSorry, you've reached the maximum number of attempts. The correct number was: " + randomNumber);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String playChoice = scanner.nextLine().toLowerCase();
            if (!playChoice.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nGame over! Your total score is: " + score);
        scanner.close();
    }
}
