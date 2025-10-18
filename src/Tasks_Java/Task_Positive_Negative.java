package Tasks_Java;

import java.util.Scanner;

public class Task_Positive_Negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();

        if(number>0){
            System.out.println("The number is positive");
        }else if(number<0){
            System.out.println("The number is negative");
        }else{
            System.out.println("The number is zero");
        }


//        int num1=10, num2=-5;
//
//        if(num1 >=0 && num2<0){
//            System.out.println("the number is positive");
//        }else{
//            System.out.println("Negative number");
//
//            }
        }
    }

