package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab073_ArrayList_03 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("45");
        list.add("55");
        list.add("30");
        list.add("50");
        list.add("51");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Sorted list "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("The reverse order"+list);

    }
}
