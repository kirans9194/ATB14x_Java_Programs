package excercise_Constructor;

public class Lab081_Constructor {

    String name;
    int id;

    Lab081_Constructor(String name, int id){
        this.name=name;
        this.id=id;
    }
}

class CFG{
    public static void main(String[] args) {
        Lab081_Constructor lb= new Lab081_Constructor("kiran",712462);
        System.out.println(lb.name+ +lb.id);


    }

}
