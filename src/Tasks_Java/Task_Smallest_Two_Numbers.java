package Tasks_Java;

import java.util.Scanner;

public class Task_Smallest_Two_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number");
        int a =scanner.nextInt();
        System.out.println("Enter second number");
        int b=scanner.nextInt();

        if(a<=b){
            System.out.println("A is smallest number" +a);
        }else{
            System.out.println("B is the smallest number"+b);
        }

    }
}
