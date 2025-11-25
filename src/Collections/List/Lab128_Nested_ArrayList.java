package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Lab128_Nested_ArrayList {
    public static void main(String[] args) {
        List<String> fruits1= new ArrayList<String>();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        System.out.println(fruits1);

        List fruits2=new ArrayList();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");

        System.out.println(fruits2);

        List vegatables = new ArrayList();
        vegatables.add("tamato");
        vegatables.add("patato");
        vegatables.add("onion");
        System.out.println(vegatables);

        List allfruit_veggies=new ArrayList();
        allfruit_veggies.add(fruits1);
        allfruit_veggies.add(fruits2);
        allfruit_veggies.add(vegatables);

        System.out.println(allfruit_veggies);
        System.out.println(allfruit_veggies.size());
        System.out.println(allfruit_veggies.get(1));




    }
}
