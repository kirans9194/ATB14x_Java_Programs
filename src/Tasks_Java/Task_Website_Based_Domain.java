package Tasks_Java;

import java.util.Scanner;

public class Task_Website_Based_Domain {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Site URL");
        String url=scanner.next();

        switch(url){
            case ".com":
                System.out.println("The website type is: Commercial website");
                break;
            case ".org":
                System.out.println("The website type is: Non-profit organization");
                break;
            case ".edu":
                System.out.println("The website type is: Educational institution");
                break;
            case ".gov":
                System.out.println("The website type is: Government website");
                break;
            case ".net":
                System.out.println("The website type is: Network-related website");
                break;
            case ".info":
                System.out.println("The website type is: Informational website");
                break;

            default:
                System.out.println("The website type is: Unknown or other types of websites");


        }

    }
}
