package excercise_strings;

public class Lab056_Strnig_examples {
    public static void main(String[] args) {
        String str="Pranav".toUpperCase();
        System.out.println(str);

        String s1="KiranKumar".substring(1,3);
        System.out.println(s1);

        char[] ch="kiran".toCharArray();
        System.out.println(ch);

        String str1="kumar ".trim();
        System.out.println(str1);

        boolean str2=" ".isBlank();
        System.out.println(str2);

        boolean str3="".isEmpty();
        System.out.println(str3);

        //repeat the string 3 times
        String str4="pranav".repeat(3);
        System.out.println(str4);

        long count="a\nb\nc".lines().count();
        System.out.println(count);



    }
}
