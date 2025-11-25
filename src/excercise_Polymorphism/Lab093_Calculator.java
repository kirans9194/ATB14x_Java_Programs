package excercise_Polymorphism;

public class Lab093_Calculator {
    public static void main(String[] args) {
        Calc ca=new Calc();
        System.out.println(ca.add(10,20));
        System.out.println(ca.add(3.14,3.14));
    }

}


class Calc{
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    long add(long a, long b){
        return a+b;
    }
}
