package excercise_Polymorphism;

public class Lab070_example_1 {

    public static void main(String[] args) {

        Math_operation mop= new Math_operation();
        System.out.println(mop.add(12,10));
        System.out.println(mop.add(11.12,10.20));
    }

}

class Math_operation{
    int add(int a,int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }

}
