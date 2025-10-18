package Tasks_Java;

import java.util.Scanner;

public class Task_Check_Vowels {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");

        char ch=scanner.next().charAt(0);
        if(ch>='a'&&ch<='z'){

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("The given character is vowel:" +ch );
            }else{
                System.out.println("The given character is Constant:"+ch);
            }
        }
        else{
            System.out.println("please enter the valid character");

        }

        }
    }

