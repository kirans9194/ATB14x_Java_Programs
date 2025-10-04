package excercise_do_while;

import java.nio.channels.ScatteringByteChannel;
import java.util.Random;
import java.util.Scanner;

public class Lab040_NumberGuess_do_while {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess=random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);


        int guess;
        int attempts=0;

        do {
            System.out.println("Enter a number");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid int number");
                scanner.nextInt();

            }
            guess = scanner.nextInt();
            attempts++;
            if (guess < numberToGuess) {
                System.out.println("Too low, try again!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }


        }while(guess != numberToGuess);

    }
}
