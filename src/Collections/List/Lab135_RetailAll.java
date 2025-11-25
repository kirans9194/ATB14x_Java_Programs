package Collections.List;

import java.util.ArrayList;

public class Lab135_RetailAll {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Kiran");
        al.add("Sudha");
        al.add("Pranav");
        ArrayList<String> al2 = new ArrayList<String>();
        al.add("Aadvik");
        al.add("Kiran");
        al.retainAll(al2);

        System.out.println(al);

    }
}
