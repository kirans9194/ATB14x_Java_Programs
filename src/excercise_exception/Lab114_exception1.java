package excercise_exception;

public class Lab114_exception1 {
    public static void main(String[] args) {
        System.out.println("Start the program");

        String ip=args[0];  // java.lang.ArrayIndexOutOfBoundsException
        int a= Integer.parseInt(ip);    // java.lang.NumberFormatException
        int b=100/a;    // java.lang.ArithmeticException
        System.out.println(b);

        System.out.println("End of Program");


    }
}
