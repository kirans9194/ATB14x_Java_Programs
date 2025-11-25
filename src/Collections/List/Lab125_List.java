package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Lab125_List {
    public static void main(String[] args) {

        //fruits.add("Pineapple"); List.of is fixed we can't add/remove
        List fruits= List.of("Orange","Apple","Grapes","Mango","Watermelon");
        System.out.println(fruits);

        List arraylist=new ArrayList();
        arraylist.add("Kiran");
        arraylist.add("Kiran");
        arraylist.add("kumar");
        arraylist.add(1.23);
        arraylist.add(123);
        arraylist.add(true);

        System.out.println(arraylist);
        System.out.println(arraylist.size());

    }
}
