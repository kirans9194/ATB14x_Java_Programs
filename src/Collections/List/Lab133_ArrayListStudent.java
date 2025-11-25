package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Lab133_ArrayListStudent {

        int rollno;
        String name;
        int age;

        Lab133_ArrayListStudent(int rollno,String name, int age){
            this.rollno=rollno;
            this.name=name;
            this.age=age;
        }
}

class ArrayList1{
    public static void main(String[] args) {
        Lab133_ArrayListStudent list= new Lab133_ArrayListStudent(777,"kiran",34);
        Lab133_ArrayListStudent list1= new Lab133_ArrayListStudent(778,"Sudha",30);
        Lab133_ArrayListStudent list2= new Lab133_ArrayListStudent(779,"Pranav",2);

        ArrayList<Lab133_ArrayListStudent> il=new ArrayList<Lab133_ArrayListStudent>();
        il.add(list);
        il.add(list1);
        il.add(list2);

        Iterator itr=il.iterator();

        while(itr.hasNext()){
            Lab133_ArrayListStudent ar=(Lab133_ArrayListStudent)itr.next();
            System.out.println(ar.rollno+" "+ar.name+" "+ar.age);
        }
    }
}
