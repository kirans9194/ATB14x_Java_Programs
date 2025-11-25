package excercise_Oops;

public class Lab075_Oops_ex03 {

    public static void main(String[] args) {
        //Cat c1;
        //Cat c2;
        Cat c23=new Cat();
        Cat c24=new Cat("Lucy");
        Cat c25 = new Cat("Spicy");
        Cat c26 = new Cat("Mirchi");

        //System.out.println(c23.name);
        System.out.println(c24.name);
        System.out.println(c25.name);

        c24.running();
        c25.running();
        c26.running();

    }
}

class Cat{

    String name;

    Cat(){
        name="Kitty";
    }
    Cat(String nameparam){
        this.name=nameparam;
    }
    void running(){
        int local_var=10;
        System.out.println("who is running"+this.name);
    }
}
