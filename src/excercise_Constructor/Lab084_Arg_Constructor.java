package excercise_Constructor;

public class Lab084_Arg_Constructor {
    String languages;

    Lab084_Arg_Constructor(String lang){
        languages=lang;
        System.out.println("My Programming language" +languages);
    }

    public static void main(String[] args) {
        Lab084_Arg_Constructor obj1=new Lab084_Arg_Constructor("Java");
        Lab084_Arg_Constructor obj2=new Lab084_Arg_Constructor("Python");
        Lab084_Arg_Constructor obj3=new Lab084_Arg_Constructor("C");
    }


}
