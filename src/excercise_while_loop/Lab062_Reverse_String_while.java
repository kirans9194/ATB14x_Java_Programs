package excercise_while_loop;

import java.util.Scanner;

public class Lab062_Reverse_String_while {
    //to reverse a string using while
    //1.the condition is inside the loop
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String to check its palindrome");

        String reverse=scanner.next(); //madam
        String reverse_string="";

        int i=reverse.length()-1; //madam 5-1=>4
        while(i>=0){    //4>=0->true

            reverse_string=reverse_string+reverse.charAt(i); //concat add m,
             i--;//3
        }

        System.out.println(reverse_string);
        if(reverse.equals(reverse_string)){
            System.out.println("The given input is a palindrome");
        }else{
            System.out.println("The is not a palindrome");
        }

    }


}
