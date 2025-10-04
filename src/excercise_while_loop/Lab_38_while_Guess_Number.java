package excercise_while_loop;

import java.util.Random;
import java.util.Scanner;

public class Lab_38_while_Guess_Number {
    public static void main(String[] args) {

        Random random =new Random();
        int numberToGuess=random.nextInt(101);
        System.out.println(numberToGuess);

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        int guess = 0;
        int attempts=0;

       while(true){
           if (!scanner.hasNextInt()){
               System.out.println("Enter a valid int number");
               scanner.next();
               continue;
           }

           guess= scanner.nextInt();
           attempts++;

           if(guess < 1 ||guess >100){
               System.out.println("Enter a number 1 and 100");
               continue;
           }

           if(guess < numberToGuess){
               System.out.println("The given input is too low");
           } else if (guess > numberToGuess) {
               System.out.println("The given input is too High");

           }else{
               System.out.println("Yes, you the guess the"+attempts+ " attempts");
               break;
           }
       }


    }
}
