package excercise_basic_01;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Lab014_ternary_01 {

    public static void main(String[] args) {

        int num=20;
        String result= (num%2==0)?"Even number":"Odd Number";
        System.out.println(result);
    }

}
