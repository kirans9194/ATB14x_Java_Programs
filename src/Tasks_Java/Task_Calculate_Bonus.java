package Tasks_Java;

import java.util.Scanner;

public class Task_Calculate_Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary=scanner.nextDouble();
        System.out.println("Enter no. of year experience");
        int year=scanner.nextInt();

        double bonus=0.0;

        if(year <1){
            System.out.println("No Bonus");
        }else if(year <=3){
            bonus=salary* 0.05;
        }else if(year<=6){
            bonus=salary* 0.10;
        }else{
            bonus=salary* 0.15;
        }
        System.out.println("The bonus is "+bonus);
    }
}
