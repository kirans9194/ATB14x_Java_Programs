package excercise_Super_Abstraction;

abstract class Animal{

    abstract void sound(); //abstract method

    void sleep(){
        System.out.println("sleeping");
    }
}

class Dog extends Animal{
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class Lab102_Abstract_2 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sleep();
        a.sound();
    }
}

