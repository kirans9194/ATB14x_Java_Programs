package Tasks_Java;

import java.util.Scanner;

public class Task_Reverse_String {
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
