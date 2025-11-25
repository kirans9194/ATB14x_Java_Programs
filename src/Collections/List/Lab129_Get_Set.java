package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Lab129_Get_Set {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");

        al.set(1,"PineApple");
        System.out.println(al);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
