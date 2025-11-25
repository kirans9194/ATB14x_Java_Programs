package excercise_Constructor;

public class Lab080_Oops_Constructors {
    public static void main(String[] args) {
        Baby b1=new Baby();
        Baby b2= new Baby("Pranav");

        System.out.println(b2.name);
    }
}

 class Baby{
    String name;

    Baby(){
        System.out.println("I am called, Object is created!");
    }
    Baby(String name){
      this.name=name;

    }

}
