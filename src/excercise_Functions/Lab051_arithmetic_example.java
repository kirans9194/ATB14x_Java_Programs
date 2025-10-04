package excercise_Functions;

import java.util.Scanner;

public class Lab051_arithmetic_example {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)
        Scanner scanner = new Scanner(System.in);
        int a=readint(scanner,"Enter number1");
        int b=readint(scanner,"Enter number2");

        int result_sum=sum(a,b);
        int result_sub=sub(a,b);
        int result_mul=mul(a,b);
        int result_div=div(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);

    }
        //Edge case
        static int readint(Scanner scanner,String prompt){
            System.out.println(prompt);
            if(scanner.hasNextInt()){
                return scanner.nextInt();

            }else{
                System.out.println("Enter the int only");
                System.exit(0);
                return 0;
            }
        }

        static int sum(int a, int b){
            return a+b;
        }
        static int sub(int a, int b){
            return a-b;
        }
        static int mul(int a, int b){
            return a*b;
        }
        static int div(int a, int b) throws ArithmeticException {
            if(b==0){
                throw new ArithmeticException("Division by 0 not possible");
            }
            return a/b;
        }
}
