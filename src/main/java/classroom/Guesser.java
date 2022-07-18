package classroom;

import java.util.Random;
import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {
        int guess;
        do {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Input number 1 - 10");
            guess = userInput.nextInt();
            if ((guess <= 0 || guess > 10)) {
                System.out.println("Bad input");
            }
        } while (guess <= 0 || guess > 10);
        Random randomValue = new Random();
        int randomNumber = randomValue.nextInt(1, 10);
        if (guess == randomNumber) {
            System.out.println("You guessed right");
        } else {
            System.out.println("Better luck next time");
            System.out.println("Random was " + randomNumber);
        }
    }
}
