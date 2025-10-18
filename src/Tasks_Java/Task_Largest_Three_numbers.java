package Tasks_Java;

import java.util.Scanner;

public class Task_Largest_Three_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a");

        int a=scanner.nextInt();
        System.out.println("Enter number b");
        int b=scanner.nextInt();
        System.out.println("Enter number c");
        int c=scanner.nextInt();

        if(a>=b && a>=c){
            System.out.println("A is greater" +a);
        }else if(b>=a && b>=c){
            System.out.println("B is greater" +b);
        }else{
            System.out.println("C is greater" +c);
        }

    }
}
