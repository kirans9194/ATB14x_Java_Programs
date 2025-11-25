package excercise_Polymorphism;

public class Lab096_MethodOverloading_Real {
    public static void main(String[] args) {
        Browser bro= new Browser();
        bro.startbrowser();
        bro.startbrowser("Chrome");
        bro.startbrowser("FireFox");
    }
}

class Browser{

    void startbrowser(){
        System.out.println("Default browser");
    }

    void startbrowser(String browser){
        System.out.println("The starting browser"+browser);

    }
}
