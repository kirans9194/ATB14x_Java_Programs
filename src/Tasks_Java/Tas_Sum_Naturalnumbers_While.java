package Tasks_Java;

public class Tas_Sum_Naturalnumbers_While {
    public static void main(String[] args) {

        int i=1;
        int sum=0;
        while (i <= 10) {
            sum=sum+i;
            //System.out.println(sum);
            i++;
        }
        System.out.println("Total sum value of fist 10 natural numbers"+ sum);
    }
}
