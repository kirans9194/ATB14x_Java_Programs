package excercise_strings;

public class Lab054_String_interview {
    public static void main(String[] args) {
        String s1="kiran";
        String s2="kiran";
        String s3=new String("kiran");
        String s4=new String("kiran");

        //check the Location of the string
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s3==s4);//false

        //check the contents equals
        System.out.println(s1.equals(s3));



    }
}
