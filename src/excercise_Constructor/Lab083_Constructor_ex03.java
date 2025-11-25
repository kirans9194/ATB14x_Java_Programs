package excercise_Constructor;

public class Lab083_Constructor_ex03 {

    private String name;

    Lab083_Constructor_ex03(){
        System.out.println("Constructor Called");
        name="Constructor Program";
    }

    public static void main(String[] args) {
        Lab083_Constructor_ex03 obj = new Lab083_Constructor_ex03();
        System.out.println(obj.name);

    }
}
