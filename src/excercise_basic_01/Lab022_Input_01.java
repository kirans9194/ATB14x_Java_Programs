package excercise_basic_01;

import java.util.Scanner;

public class Lab022_Input_01 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter the Input Integer number :");
        Scanner sc = new Scanner(System.in);
        age= sc.nextInt();
        System.out.println("Check the integer number :" +age);

        if(age < 18){
            System.out.println("You are minor");
        }else{
            System.out.println("you are applicable to vote");
        }
    }
}
