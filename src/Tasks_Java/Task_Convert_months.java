package Tasks_Java;

import java.util.Scanner;

public class Task_Convert_months {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the days");
        int totaldays=scanner.nextInt();

        int years=totaldays/365;
        int remainingDays=totaldays%365;

        int months=remainingDays/30;
        int days=remainingDays%30;

        System.out.println(totaldays + "is equal to " +years+" years and "+months+ "months and "+days+"days");








    }

}
