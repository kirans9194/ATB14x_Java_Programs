package excercise_multilevel_Inheritance;

public class Lab091_Animal {

    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Lab091_Animal {
    void bark(){
        System.out.println("Barking.....");
    }
}

class Baby_Dog extends Dog{
    void weep(){
        System.out.println("weeping.....");
}
}

class Main{
    public static void main(String[] args) {
        Baby_Dog d= new Baby_Dog();
        d.weep();
        d.bark();
        d.eat();

    }

}
