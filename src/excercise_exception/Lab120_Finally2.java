package excercise_exception;

import java.util.Scanner;

public class Lab120_Finally2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            int v=scanner.nextInt();
            int a=10/v;
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
