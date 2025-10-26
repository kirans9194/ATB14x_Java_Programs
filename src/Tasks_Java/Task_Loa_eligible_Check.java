package Tasks_Java;

import java.util.Scanner;

public class Task_Loa_eligible_Check {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();

        if(age<=0){
            System.out.println("Age must be a positive integer.");
            return;
        }if(age<18){
            System.out.println("Age must be 18 years");
            return;
        }if(age>80){
            System.out.println("Age is greater than 80 ");
            return;
        }
        System.out.print("Enter your monthly salary: ");
        double salary=scanner.nextDouble();

        if(salary<=0){
            System.out.println("Salary must be a positive.");
            return;
        }if(salary<30000.00){
            System.out.println("Minimum Salary must be 30000.00");
            return;
        }

        System.out.println("Enter your credit score");
        int score=scanner.nextInt();

        if(score<=0){
            System.out.println("Score should be positive number");
            return;
        }if(score<650){
            System.out.println("Credit Score shouldn't be less than 650");
            return;
        }if(score>850){
            System.out.println("Credit Score shouldn't exceed 850");
            return;
        }

        if(age>=18 && age<=80 && salary>=30000.00 && score>=650 && score<=850){
            System.out.println("You are eligible for the loan!");
        } else {
            System.out.println("You are NOT eligible for the loan.");
        }

    }
}
