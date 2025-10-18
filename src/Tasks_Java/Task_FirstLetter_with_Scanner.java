package Tasks_Java;

import java.util.Scanner;

public class Task_FirstLetter_with_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String names=scanner.nextLine();

        String[] namearray=names.split(" ");

        for (String name:namearray){
            System.out.println(name.charAt(0));
        }

    }
}
