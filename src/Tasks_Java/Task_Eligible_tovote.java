package Tasks_Java;

import java.util.Scanner;

public class Task_Eligible_tovote {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age");

        int number=scanner.nextInt();

        if(number>=18){
            System.out.println("The person eligible to vote");
        }else{
            System.out.println("The person is not eligible to vote");
        }

    }
}
