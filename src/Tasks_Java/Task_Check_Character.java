package Tasks_Java;

import java.util.Scanner;

public class Task_Check_Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");

        char ch=scanner.next().charAt(0);

        if((ch>='a' && ch<='z')||(ch >='A' && ch <='Z')){
            System.out.println(ch+ ": character is alphabet");
        }else{
            System.out.println(ch+ ": is not an alphabet");
        }

        //Check if a Character is an Alphabet

    }
}
