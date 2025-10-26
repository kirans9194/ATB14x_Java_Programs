package Tasks_Java;

import java.util.Scanner;

public class Task_Trangle_is_Valid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First side");
        int a=scanner.nextInt();
        System.out.println("Enter Second side");
        int b=scanner.nextInt();
        System.out.println("Enter Third side");
        int c=scanner.nextInt();

        //condition to check the valid triangle, if sum of 1st & 2nd is greater than 3rd then its a valid, else invalid

        if((a+b > c) && (a+c >b) && (b+c > a)){
            System.out.println("Its a valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }

    }
}
