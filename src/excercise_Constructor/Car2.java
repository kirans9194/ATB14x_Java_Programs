package excercise_Constructor;

public class Car2 {

    String model;
    int year;

    Car2(){
        model="xxxx";
        year=1900;

    }

    Car2(String model_name){
        this();
        this.model=model_name;
    }

    Car2(String model_name, int year_created){
        this("i10");
        this.year=year_created;

    }

}
