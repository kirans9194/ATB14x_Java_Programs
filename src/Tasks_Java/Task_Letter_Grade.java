package Tasks_Java;

import java.util.Scanner;

public class Task_Letter_Grade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 0 to 100");
        int score=scanner.nextInt();
        char grade;

        if (score >= 90 && score <= 100) {
            grade='A';

        }else if(score >=80){
            grade='B';
        }else if(score>=70){
            grade='C';
        }else if(score >=60){
            grade='D';
        }else if(score <=59 && score>=0){
            grade='F';
        }else{
            grade='e';
            System.out.println("Invalid score");
        }
        System.out.println("The grade " + grade);
        
    }
}
