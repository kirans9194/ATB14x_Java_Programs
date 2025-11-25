package Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab131_ArrayList_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueinput="Y";
        List<String> names = new ArrayList<String>();

        while(continueinput.equalsIgnoreCase("Y")){
            System.out.println("Enter the name");
            String name=scanner.next();
            names.add(name);
            scanner.nextLine();

            System.out.println("Do you want to enter another name Y/N");
            continueinput = scanner.nextLine();
        }

        for (String name:names){
            System.out.println(name);
        }
        scanner.close();


    }
}
