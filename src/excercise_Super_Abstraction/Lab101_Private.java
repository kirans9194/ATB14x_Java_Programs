package excercise_Super_Abstraction;

public class Lab101_Private {
}

class xyz{
    xyz(){ }
    protected int my_gold=10;
}

class CAB extends xyz{
    void display(){
    System.out.println(super.my_gold);
}
}
