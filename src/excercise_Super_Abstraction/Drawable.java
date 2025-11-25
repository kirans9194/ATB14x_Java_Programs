package excercise_Super_Abstraction;

public interface Drawable {

    void draw();
    static int cube(int x){
        return x*x*x;
    }
}

class Rectange implements Drawable{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}

class Main3{
    public static void main(String[] args) {
        Drawable d=new Rectange();
        d.draw();
        System.out.println(Drawable.cube(3));


    }
}
