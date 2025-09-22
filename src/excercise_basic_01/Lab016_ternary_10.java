package excercise_basic_01;

public class Lab016_ternary_10 {

    public static void main(String[] args) {
        //Real_Age_Classification ( age → 59 ) →  Minor, Adult (Adult , Sr Senior)
        int age=60;
        String real_age=((age < 18) ? "Minor":(age <= 59) ? "Adult": "Senior citizen");
        System.out.println(real_age);

    }
}
