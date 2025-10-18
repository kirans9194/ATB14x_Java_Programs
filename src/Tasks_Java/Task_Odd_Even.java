package Tasks_Java;

import java.util.Scanner;

public class Task_Odd_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int num=scanner.nextInt();

        if(num%2==0){
            System.out.println("The entered number is even:" +num);
        }else if(num%2!=0){
            System.out.println("The entered number is odd:" +num);
        }
    }
}
