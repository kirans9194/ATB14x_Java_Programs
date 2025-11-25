package excercise_Polymorphism;

public class Lab095_MethodOverloading_Automation {
    public static void main(String[] args) {
        commonToAll com=new commonToAll();
        com.openbrowser();

        ChromeTC ch=new ChromeTC();
        ch.openbrowser();

        FireFoxTC fox=new FireFoxTC();
        fox.openBrowser();

        //dynamic dispatch
        commonToAll com1=new ChromeTC();
        com1.openbrowser();

    }
}


class commonToAll{

    void openbrowser(){
        System.out.println("Starting the IE browser.");
    }

}

class ChromeTC extends commonToAll{

    void openbrowser(){
        System.out.println("Starrting Chrome, Better Browser!!");
    }
}

class FireFoxTC extends commonToAll{
    void openBrowser() {
        System.out.println("Starrting FirefoxTc, Better Browser!!");
    }

}
