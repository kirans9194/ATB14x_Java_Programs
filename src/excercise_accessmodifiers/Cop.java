package excercise_accessmodifiers;

public class Cop {

    public int gun;
    private String icard;

    public Cop(int bullet){
        this.gun=bullet;
    }

    protected void canishoot() {
        System.out.println("Yes you can");
    }

    void thisDefaultF1() {

        System.out.println("Hi, Cop!");
    }

}
