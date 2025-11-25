package Collections.List;

import java.util.ArrayList;

public class Lab134_ArrayList3 {
    public static void main(String[] args) {

        ArrayList<String> al=new ArrayList<String>();
        System.out.println("Initial list of elements: "+al);
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        System.out.println("After invoking add(E e) method: "+al);
        al.add(1, "Kiran");
        System.out.println("After invoking add(int index, E element) method: "+al);

        ArrayList<String> al2=new ArrayList<String>();
        al.add("Pranav");
        al.add("Sudha");

        al2.addAll(al);
        System.out.println(al2);

    }
}
