package Tasks_Java;

import java.util.Scanner;

public class Task_Grade_Based_MArks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Range");
        int marks=scanner.nextInt();

        if(marks>=90 && marks<=100){
            System.out.println(marks+ " Grade is A+");
        }else if(marks>=80 && marks<=89){
            System.out.println(marks+ " Grade is A");
        }else if(marks>=70 && marks<=79) {
            System.out.println(marks + " Grade is B");
        }else if(marks>=60 && marks<=69) {
            System.out.println(marks + " Grade is C");
        }else if(marks>=50 && marks<=59) {
            System.out.println(marks + " Grade is D");
        }else if(marks>=40 && marks<=49) {
            System.out.println(marks + " Grade is D");
        }else if (marks < 40){
            System.out.println(marks + "Fail");
        }else{
            System.out.println("Invalid marks! Please enter marks between 0 and 100");
        }

    }
}
