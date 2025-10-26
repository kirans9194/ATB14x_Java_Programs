package Tasks_Java;

import java.util.Scanner;

public class Task_ATM_Withdrawl {
    /*Initialize the account balance with a fixed amount (e.g., ₹10,000).
        Take user input for the amount they want to withdraw.
    Check withdrawal conditions:
    The amount should be greater than zero.
    The amount should be a multiple of 100 (common ATM rule).
    The amount should not exceed the account balance.
    Deduct the amount from the balance if conditions are met.
    Display the updated balance or an error message if the withdrawal fails.*/
    public static void main(String[] args) {
        long account_balance=10000;
        long remaining_balance;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to withdrawl");
        long input=scanner.nextLong();

        if(input<=0){
            System.out.println("The amount should be greater than 0");

        }else if(input>account_balance){
            System.out.println("Insufficient Balance");
        }else if(input % 100!=0){
            System.out.println("The amount should be a multiples of 100");
        }
        remaining_balance=account_balance-input;
        System.out.println("The remaining balance :"+remaining_balance);


    }





}
