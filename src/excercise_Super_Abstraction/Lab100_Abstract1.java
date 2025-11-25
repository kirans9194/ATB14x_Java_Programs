package excercise_Super_Abstraction;

public class Lab100_Abstract1 {

    public static void main(String[] args) {
        // Car
        Car tesla = new Car(300);
        tesla.drive();

    }
}

class Vehicle{

    public int maxspeed=180;

    //non abstract method-->Concrete
    void notest(){
        System.out.println("Empty");
    }

    Vehicle (int a){
        System.out.println("Param const");
    }

    Vehicle (int a, int b){
        System.out.println("Param const");
    }

    void message(int a){
        System.out.println("PC - arguemnt");
    }

    void drive(){
        System.out.println("Vehicle Parent");
    }

}

class Car extends Vehicle{

    private int maxSpeed = 281;
    Car(){
        super(100);
    }
    Car(int a)
    {
        super(a);
        System.out.println("PC Car");
    }

    void test(){}

    void driver(){
        System.out.println("Over ridden the Vehicle");
        System.out.println(super.maxspeed);
        System.out.println(this.maxSpeed);
        super.notest();
        this.test();

    }


}
