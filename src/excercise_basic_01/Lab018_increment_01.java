package excercise_basic_01;

public class Lab018_increment_01 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++); //10 after increment to + 1
        System.out.println(++a); //12, + 1 and now 12
        System.out.println(a++ + ++a); //12 & becom +1=> 14, final=26
    }
}
