package excercise_StringBuffer_Builder;

import java.util.Scanner;

public class Lab060_reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string, will reverse it");
        String reverse=scanner.next();

        String reverse_input="";
        char[] ch = reverse.toCharArray();

        for (int i=ch.length-1;i>=0;i--){
            reverse_input=reverse_input+ch[i];
        }
        System.out.println(reverse_input);

    }
}
