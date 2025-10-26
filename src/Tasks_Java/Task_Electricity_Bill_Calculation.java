package Tasks_Java;

import java.util.Scanner;

public class Task_Electricity_Bill_Calculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Consumed Units");
        int units=scanner.nextInt();
        double bill=0.0;

        if(units <=0){
            System.out.println("Invalid input! Units should be greater than 0");
        }else{
            if(units <=100){
                bill=units * 0.50;
            }else if(units <=200){
                bill=(100*0.50)+((units -100)*0.75);
            }else if(units <=300){
                bill=(100*0.50)+(100*0.75) +((units -200)*1.20);
            }else {
                bill=(100*0.50)+(100*0.75) +(100*1.20)+((units -300)*1.50);

            }
            System.out.println("Total Electricity Bill: Rs. " + bill);

        }
    }
}
