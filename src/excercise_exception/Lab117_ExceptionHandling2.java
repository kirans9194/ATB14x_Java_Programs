package excercise_exception;

public class Lab117_ExceptionHandling2 {
    public static void main(String[] args) {
        int a=0;
        int b=10;
        try {
            int c = b / a;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Not allowed");
        }catch(Exception e){
            System.out.println("Hello");
        }catch(Throwable e){
            System.out.println("Not allowed");
        }
    }
}
