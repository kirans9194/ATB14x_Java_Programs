package Tasks_Java;

import java.util.Scanner;

public class Task_smallest_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=scanner.nextInt();
        System.out.println("Enter second number");
        int b=scanner.nextInt();
        System.out.println("Enter third number");
        int c=scanner.nextInt();

        if(a<=b && a<=c){
            System.out.println("First number is smallest" +a);
        }else if(b<=a && b<=c){
            System.out.println("Second number is smallest"+b);
        }else{
            System.out.println("Third number is smallest" +c);
        }

    }
}
