package excercise_strings;

public class Lab055_String_Functions_02 {
    public static void main(String[] args) {
        CharSequence ch="kiran".substring(2,4);
        System.out.println(ch);

        String s1="Pranav".substring(3);
        System.out.println(s1);

        String s=new String("aadvik");
        char[] ch1=s.toCharArray();
        System.out.println(ch1);
    }
}
