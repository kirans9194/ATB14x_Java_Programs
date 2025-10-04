package excercise_Functions;

public class Lab048_Simple_Functions {
    public static void main(String[] args) {
        name_of_the_function();
        String name=return_string_type_function();
        System.out.println(name);
    }

    static void name_of_the_function(){
        System.out.println("Non return type and no arguments");
    }

    static String return_string_type_function(){
        System.out.println("Returning String with no arguments");
        return "Kiran";
    }

    static boolean return_boolean(){
        return true;
    }

    static float return_float_function(){
        return 3.5f;
    }

}
