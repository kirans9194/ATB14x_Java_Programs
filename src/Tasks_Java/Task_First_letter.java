package Tasks_Java;

import java.util.Scanner;

public class Task_First_letter {

    public static void main(String[] args) {

        String[] name={"kiran","pranav","sudha","mohitha","suchith"};

        for(String firstletter:name){
             System.out.println(firstletter.charAt(0));
        }

    }
}
