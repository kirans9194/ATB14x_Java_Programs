package excercise_for_loop;

public class Lab025_ForLoop_Continue_Evennum {

    public static void main(String[] args) {
        for(int i=1;i<=50;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);

        }
    }
}
