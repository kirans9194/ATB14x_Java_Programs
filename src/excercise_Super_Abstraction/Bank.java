package excercise_Super_Abstraction;

abstract class Bank {
    abstract double getrateofinterest();
}

class SBI extends Bank{
    public double getrateofinterest(){
        return 8.6f;
    }
}

class PNB extends Bank{
    public double getrateofinterest(){
        return 9.6f;
    }
}

class Main1{
    public static void main(String[] args) {
        Bank b=new SBI();
        System.out.println(b.getrateofinterest());
        Bank bb=new PNB();
        System.out.println(b.getrateofinterest());
    }

}
