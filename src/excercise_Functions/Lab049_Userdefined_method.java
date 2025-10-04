package excercise_Functions;

import java.util.Scanner;

public class Lab049_Userdefined_method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a");
        int a=scanner.nextInt();

        System.out.println("Enter number b");
        int b=scanner.nextInt();

        no_return_type_method();
        int result=sum_of_two_numbers(a,b);
        System.out.println(result);
        int result1=subtract_of_two_numbers(a,b);
        System.out.println(result1);
 }

    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }
    static int subtract_of_two_numbers(int a, int b){
        return a-b;
    }

    static void no_return_type_method(){
        System.out.println("No return type");
    }


}
