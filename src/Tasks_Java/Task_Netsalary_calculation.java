package Tasks_Java;

import java.util.Scanner;

public class Task_Netsalary_calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter basic pay Rs.");
        double basic=scanner.nextDouble();
        System.out.println("Enter Dearness Allowance (DA) Rs.");
        double dc=scanner.nextDouble();
        System.out.println("Enter HRA allowance Rs.");
        double hra=scanner.nextDouble();

        if(basic < 0 && dc< 0 && hra <0){
            System.out.println("Invalid Input");
        }

        double gross_salary=basic+dc+hra;
        double taxrate=0.0;
        double taxdeduction=gross_salary*taxrate;

        double net_salary=gross_salary-taxdeduction;

        System.out.println("\n--- Salary Breakdown ---");
        System.out.printf("Basic Pay        : Rs %.2f%n", basic);
        System.out.printf("Dearness Allowance: Rs %.2f%n", dc);
        System.out.printf("House Rent Allowance: Rs %.2f%n", hra);
        System.out.printf("Net Salary       : Rs %.2f%n", net_salary);
    }
}
