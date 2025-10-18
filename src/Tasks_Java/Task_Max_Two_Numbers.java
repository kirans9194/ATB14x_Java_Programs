package Tasks_Java;

import java.util.Scanner;

public class Task_Max_Two_Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=scanner.nextInt();
        System.out.println("Enter num2");
        int num2=scanner.nextInt();

        if(num1>num2){
            System.out.println(num1+"is max");
        }else if(num2>num1){
            System.out.println(num2+"is max");
        }else {
            System.out.println("Both numbers are equal");
        }

        //using math function
        int max_num=Math.max(num1,num2);
        System.out.println("the highest number:" +max_num);

    }
}
