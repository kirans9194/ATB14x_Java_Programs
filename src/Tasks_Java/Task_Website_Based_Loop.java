package Tasks_Java;

import java.util.Scanner;

public class Task_Website_Based_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the url");
        String url=scanner.next();
        String type="";

        if (url.endsWith(".com")) {
            type = "Commercial website";
        } else if (url.endsWith(".org")) {
            type = "Organization website";
        } else if (url.endsWith(".edu")) {
            type = "Educational website";
        } else if (url.endsWith(".gov")) {
            type = "Government website";
        } else if (url.endsWith(".net")) {
            type = "Network-related website";
        } else {
            type = "Unknown website type";
        }
        System.out.println("The website type is: " + type);
    }
}
