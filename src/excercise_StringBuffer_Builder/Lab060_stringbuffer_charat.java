package excercise_StringBuffer_Builder;

import java.util.Scanner;

public class Lab060_stringbuffer_charat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string to reverse");

        String reverse=scanner.next();
        String reverse_input="";

        for (int i=reverse.length()-1;i>=0;i--){
            reverse_input=reverse_input+reverse.charAt(i);
        }
        System.out.println(reverse_input);

    }
}
