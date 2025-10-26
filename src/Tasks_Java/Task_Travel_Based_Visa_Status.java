package Tasks_Java;

import java.util.Scanner;

public class Task_Travel_Based_Visa_Status {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age=scanner.nextInt();

        System.out.println("Enter the Visa Status");
        String visa_status=scanner.next();

        if(age<0){  //must be valid age
            System.out.println("Invalid age, please enter a valid age");
            return;
        }

//        if(!visa_status.equals("valid") && !visa_status.equals("invalid")){
//            System.out.println("Invalid visa status! enter 'valid' or 'invalid'.");
//            return;
//        }

        if(age >=18 && visa_status.equals("valid")){
            System.out.println("eligible to travel.");
        }else{
            System.out.println("Not eligible to travel.");
        }
    }
}
