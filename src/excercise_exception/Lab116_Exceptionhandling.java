package excercise_exception;

public class Lab116_Exceptionhandling {
    public static void main(String[] args) {
        String s1=null;
        try {
            s1.trim();
        }catch(Exception e){
            System.out.println("Error, Trim not allowed for the null values");
        }

    }
}
