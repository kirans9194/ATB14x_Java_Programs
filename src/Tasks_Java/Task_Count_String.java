package Tasks_Java;

import java.util.Scanner;

public class Task_Count_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");

        String value=scanner.nextLine();//read full line with spaces
        String[] words=value.trim().split("\s+");
        int count=0;


       for (int i=0;i<value.length();i++){
           if (!words[i].isEmpty()){
               count ++;
           }

       }
        System.out.println(count);

    }
}
