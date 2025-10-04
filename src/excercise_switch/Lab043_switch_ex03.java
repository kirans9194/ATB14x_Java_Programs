package excercise_switch;

import java.util.Scanner;

public class Lab043_switch_ex03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a");
        int a=scanner.nextInt();

        System.out.println("Enter number b");
        int b=scanner.nextInt();

        int sum=a+b;

        switch(sum){
            case 20: System.out.println("The addition of two numbers" +sum);break;
            case 30: System.out.println("The addition of two numbers" +sum);break;
            case 50: System.out.println("The addition of two numbers" +sum);break;
            default:
                System.out.println("The addition of 2 number is not matching");
            }
}
}

