package Tasks_Java;

import java.util.Scanner;

public class Task_Find_Senior_Citizen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        int age=scanner.nextInt();

        if(age >=0 && age<=12){
            System.out.println("Child");
        }else if(age >=13 && age<=19){
            System.out.println("Teenager");
        }else if(age>=20 && age<=64){
            System.out.println("Adult");
        }else if(age>=65){
            System.out.println("senior citizen");
        }


    }
}
