package excercise_static;

public class Lab108_Realex {
    public static void main(String[] args) {
        Automation auto=new Automation();
        System.out.println(auto.driver);
        System.out.println(Automation.driver);
        Automation.driver="Firefox";
        System.out.println(Automation.driver);

        System.out.println(Automation.driver2);

    }

}

class Automation{

    static String driver="chrome";
    static String driver2;
}
