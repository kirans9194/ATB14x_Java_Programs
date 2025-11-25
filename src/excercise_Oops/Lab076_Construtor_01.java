package excercise_Oops;

public class Lab076_Construtor_01 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("kiran");
        s2.sleep();

    }
}

class Student{

    String name;
    //DC
    Student(){
        System.out.println("DC -> Hi, i am called.");
    }
    //PC
    Student(String name){
        System.out.println("PC -> Hi," + this.name);
    }
    void sleep(){
        System.out.println("sleep always");
    }
    void study(){

    }
    void eat(){

    }
}
