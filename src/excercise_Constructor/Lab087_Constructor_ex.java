package excercise_Constructor;

public class Lab087_Constructor_ex {

    String model;
    int year;

    Lab087_Constructor_ex(String model, int year){
        this.model=model;
        this.year=year;
    }

    void display(){
        System.out.println(this.model);
        System.out.println(this.year);
    }

}

class Main{
    public static void main(String[] args) {
        Lab087_Constructor_ex ex=new Lab087_Constructor_ex("i10",2023);
        ex.display();
    }
}
