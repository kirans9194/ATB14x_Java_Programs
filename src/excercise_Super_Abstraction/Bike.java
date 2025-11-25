package excercise_Super_Abstraction;

abstract class Bike {
    abstract void run();

}

class Honda extends Bike{
    public void run(){
        System.out.println("Running safely");
    }

}

class Main{
    public static void main(String[] args) {
        Bike b=new Honda();
        b.run();
    }
}
