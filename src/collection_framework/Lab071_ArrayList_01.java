package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Lab071_ArrayList_01 {
    public static void main(String[] args) {
        List arraylist=new ArrayList();
        arraylist.add("Pranav");
        arraylist.add(117);
        arraylist.add(true);
        arraylist.add(3.45);
        arraylist.add("Pranav");//it can add duplicate

        System.out.println(arraylist);
        System.out.println(arraylist.size());

    }



}
