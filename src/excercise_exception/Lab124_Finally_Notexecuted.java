package excercise_exception;

public class Lab124_Finally_Notexecuted {
    public static void main(String[] args) {

        try {
            int a = 10 / 10;
            System.out.println("Try Executed");
            System.exit(0);
        }catch (Exception e){
            System.out.println("Catching the exception");
        }finally {
            System.out.println("I will be always executed!");
        }
    }
}
