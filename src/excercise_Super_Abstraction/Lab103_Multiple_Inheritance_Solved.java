package excercise_Super_Abstraction;

public class Lab103_Multiple_Inheritance_Solved {
    public static void main(String[] args) {

    }
}

class child1 implements Father1,Father2{


    @Override
    public void money() {
        System.out.println("Child ");
    }
}

interface Father1{
    final int a=10;
    void money();
}

interface Father2{
    void money();
}
