package excercise_while_loop;

import java.util.Scanner;

public class Lab034_while_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Factorial number");

       int number=scanner.nextInt();
       int fact=1;
//        for (int i = 1; i<=number ; i++) { //5
//            fact=fact*i;
//        }

        //Using while
        int i=1;
        while(i<=number){
            fact=fact*i;
            i++;
        }
        System.out.println(fact);//1*2*3*4
    }
}
