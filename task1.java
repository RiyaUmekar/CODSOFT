import java.util.Random;      
import java.util.Scanner;
import javax.swing.*;

class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
          int minlimit = 1;
        int maxlimit = 100;
        int maxAttempts = 10;
    

        System.out.println("welcome to number game!!");

        do {
            int targetedNumber = random.nextInt(maxlimit - minlimit + 1) + minlimit;
            int attempts = 0;
          
            System.out.println("Guess the number between 1-100" + ".");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetedNumber)
                 {
                 
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    break;
                } else if (userGuess < targetedNumber) {
                    System.out.println("your guess is too lower than generated number!");
                } else {
                    System.out.println("your guess is too higher than generated number!");
                }
            }

         System.out.print("you have reached maximum attempts");

            System.out.print("Will you wish to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));

        scanner.close();
    }
}
