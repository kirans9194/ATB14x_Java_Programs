package Tasks_Java;

import java.util.Scanner;

public class Task_Amstrong_Number {
    public static void main(String[] args) {

     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter Number");
     int number=scanner.nextInt();

     int original=number;
     int result=0;

     int n=String.valueOf(number).length();//convert int to string and get the length

     while(number >0){
         int digit=number%10; //take the last digit
         result+=Math.pow(digit,n);//
         number=number/10;//remove last digit

     }

     if(original==result){
         System.out.println("The entered number is Amstrong");
     }else{
         System.out.println("The number is not Amstrong");
     }

    }
}
