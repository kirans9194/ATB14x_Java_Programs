package Tasks_Java;

import java.util.Scanner;

public class Task_Number_Divisible_5_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();

        if(number%5==0 && number%11==0){
            System.out.println("The number is divisble by 5 and 11");
        }else{
            System.out.println("The number is not divisible");
        }

    }
}
