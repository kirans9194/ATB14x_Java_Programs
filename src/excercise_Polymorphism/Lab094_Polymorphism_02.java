package excercise_Polymorphism;

public class Lab094_Polymorphism_02 {
    Math_Operations mop=new Math_Operations();
    int r1=mop.add(3,4);
    int r2=mop.add(4,5,6);
    double r3=mop.add(3.14,4.50);
    String str=mop.add("Kiran","Kumar");

}

class Math_Operations{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
    String add(String a, String b){
        return a+b;
    }

}
