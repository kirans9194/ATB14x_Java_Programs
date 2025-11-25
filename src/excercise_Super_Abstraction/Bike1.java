package excercise_Super_Abstraction;

abstract class Bike1 {
    Bike1(){
        System.out.println("Bike is created");
    }
    abstract void run();

    void changeGear(){
        System.out.println("Gear is changed");
    }
}

class Bajaj extends Bike1{
    Bajaj(){
        super();
    }

    void run(){
        System.out.println("Running smoothly");
    }
}

class Main2{
    public static void main(String[] args) {
        Bike1 b1=new Bajaj();

        b1.run();
        b1.changeGear();
    }
}
