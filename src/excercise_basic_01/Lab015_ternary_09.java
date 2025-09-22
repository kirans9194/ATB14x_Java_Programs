package excercise_basic_01;

public class Lab015_ternary_09 {
    public static void main(String[] args) {
        int n1=2,n2=9,n3=-11,max;

            //condition ? expression1 expression2
        max=(n1 > n2) ? (n1 > n3 ? n1: n3) : (n2 > n3) ? n2 : n3;
        System.out.println("The largest number is :" +max);

    }
}
