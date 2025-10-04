package excercise_while_loop;

import java.util.Scanner;

public class Lab036_whileloop_factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Factorial number");
        if(!scanner.hasNext()){
            System.out.println("Please enter a valid int number");
        }else{
            int number=scanner.nextInt();
            int fact=1;

            if(number==0){
                fact=1;
                System.out.println("Factorial is 1");
            }if(number<0 || number>Integer.MAX_VALUE){
                System.out.println("The Entered factorial is out of bound");
            }

            int i=1;
            while(i<=number){
                fact=fact*i;
                i++;
            }
            System.out.println(fact);
        }

    }
}
