package excercise_exception;

public class Lab115_UncheckedException {

    public static void main(String[] args) {
        int a=0;
        int b=10;
        int c=b/a;
        System.out.println(c);

        //unchecked
        String name=null;
        name.trim();

    }
}
