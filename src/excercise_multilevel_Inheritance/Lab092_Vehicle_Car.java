package excercise_multilevel_Inheritance;

public class Lab092_Vehicle_Car {

    void car(){
        System.out.println("Drive the car");
    }
}

class volkwagen extends Lab092_Vehicle_Car{

    void brand(){
        System.out.println("Drive the Ameo");
    }
}
class bmw extends volkwagen{
    void car(){
        System.out.println("Volkswagen car");
    }
    void series(){
        System.out.println("Drive the bmw 20");
    }
}

class Main1{
    public static void main(String[] args) {

        Lab092_Vehicle_Car cd=new bmw();
        cd.car();
    }


}