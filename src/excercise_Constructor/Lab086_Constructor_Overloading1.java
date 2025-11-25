package excercise_Constructor;

public class Lab086_Constructor_Overloading1 {

    String language;

    Lab086_Constructor_Overloading1(){
        this.language="Java";
    }
    Lab086_Constructor_Overloading1(String language){
        this.language="language";
    }

    public void getName(){
        System.out.println("Programming language: " + this.language);

    }

    public static void main(String[] args) {
        Lab086_Constructor_Overloading1 obj1=new Lab086_Constructor_Overloading1();
        Lab086_Constructor_Overloading1 obj2=new Lab086_Constructor_Overloading1("python");

        obj1.getName();
        obj2.getName();

    }



}
