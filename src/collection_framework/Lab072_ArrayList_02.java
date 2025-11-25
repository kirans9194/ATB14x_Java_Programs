package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab072_ArrayList_02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add(4);
        list.add(true);

        System.out.println(list.size());//6
        System.out.println(list.isEmpty());//false
        System.out.println(list.contains("1"));//true
        System.out.println(list.contains(1));//false
        System.out.println(list.contains("3"));//true

        System.out.println("----------------------");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-----------------------");
        for(Object o: list){
            System.out.println(o);
        }



    }
}
