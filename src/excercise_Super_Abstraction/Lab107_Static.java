package excercise_Super_Abstraction;

public class Lab107_Static {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}

class A{

    static{
        System.out.println("Called only Once when Class is loaded");
        System.out.println("You can write a code reading a excel, file, , database file");
    }

    static int a=10;
    static void m1(){
        System.out.println("Static Function");
    }
}
