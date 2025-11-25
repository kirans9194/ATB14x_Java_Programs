package excercise_Super_Abstraction;

public class Lab104_Interface_p1 {
    public static void main(String[] args) {
        Car2 car2=new Car2();
        car2.driver();
    }
}

class Car2 implements Brakes, Engine1{
    void driver(){
        applyBrakes();
        startEngine();
        stopEngine();
    }

    public void testEngine(){
        System.out.println("Override by the Car 1");
    }

    public void applyBrakes(){
        System.out.println("Apply Break");
    }

    public void startEngine(){
        System.out.println("Start Engine");
    }

    public void stopEngine(){
        System.out.println("Stop Engine");
    }

    @Override
    public void applyBrake() {

    }
}

interface Brakes{
    void applyBrake();
}

interface Engine1{
    void startEngine();
    void stopEngine();

    default void testEngine() {
        System.out.println("concrete complete");
    }

    default void testEngine1() {
        System.out.println("concrete complete");
    }

}

