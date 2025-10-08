package excercise_StringBuffer_Builder;

import java.util.Scanner;

public class Lab061_String_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to check the its palindrome");

        String reverse=scanner.next();

        String reverse_string="";
        for (int i=reverse.length()-1;i>=0;i--){
            reverse_string=reverse_string+reverse.charAt(i);
        }
        System.out.println(reverse_string);

        if(reverse_string.equalsIgnoreCase(reverse)){
            System.out.println("The given string is Palindrome");
        }else{
            System.out.println("The string is not palindrome");
        }
    }
}
