package Tasks_Java;

public class Task_Palindrome_1 {
    public static void main(String[] args) {
        String name="level";
        String reverse="";

        for (int i = 0; i < name.length(); i++) {
            reverse=reverse+name.charAt(i);
        }
        System.out.println("The Palindrome :"+ reverse);
    }

}
