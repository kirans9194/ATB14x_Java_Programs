package Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab132_ArrayLIst_Input2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_names="Y";
        List<String> names=new ArrayList<String>();
        while(input_names.equalsIgnoreCase("Y")){
            System.out.println("Enter name");
            String name=scanner.next();
            names.add(name);
            scanner.nextLine();

            System.out.println("Do you want to enter another name Y/N");
            input_names=scanner.nextLine();
        }

        for(String name:names){
            System.out.println(name);
        }
scanner.close();
    }
}
