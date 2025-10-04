package excercise_switch;

import java.util.Scanner;

public class Lab041_switch_ex01 {
    public static void main(String[] args) {
        // Logic Building Formula
        // Step 1 - Number one is using the Scanner class.
        // Step 2 number two will be basically figuring out the expression and the day.
        // Step 3- We will basically add step 3 as a rough logic.
        // Step 4 - 4 is you will write the fix the logic and optimize.
        // Step 5 - figure out the edge cases.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        if(scanner.hasNextInt()){
            int day= scanner.nextInt();

            switch(day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid number");

            }

        }

    }
}
