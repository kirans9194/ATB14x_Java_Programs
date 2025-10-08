package excercise_strings;

public class Lab057_Strings_examples_2 {
    public static void main(String[] args) {
        String str="kiran";
        char ch=str.charAt(1);
        System.out.println(ch);

        int result="abc".compareTo("ABC");
        System.out.println(result);

        int str1="pranav".indexOf(2);
        System.out.println(str1);

        int idx = "Java".indexOf("a"); // 1
        System.out.println(idx);

        int str2="kirankumar".lastIndexOf('a');
        System.out.println(str2);

        String str3=String.join("*","python","Java");
        System.out.println(str3);

        String str4="kiran".replace('i','a');
        System.out.println(str4);

        String str5="pranav".concat("aadvik");
        System.out.println(str5);

    }
}
