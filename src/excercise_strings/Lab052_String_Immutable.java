package excercise_strings;

public class Lab052_String_Immutable {
    public static void main(String[] args) {
        String name="kiran";
        //string are immutable in nature, so it can't be changed
        name.toUpperCase();
        //assigning this to the name
        name=name.toUpperCase();
        System.out.println(name);

        //to create string object
        String s1=new String("KIRAN");

        s1.toUpperCase();
        System.out.println(s1);
    }
}
