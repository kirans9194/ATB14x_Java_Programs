package excercise_enum;

public class Lab111_Enum2 {
    public static void main(String[] args) {
        System.out.println(Hex_Color.RED.gethex_code());
    }
}

enum Hex_Color{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hex_code;
    Hex_Color(String hex_code){
        this.hex_code=hex_code;
    }

    String gethex_code(){
        return hex_code;
    }

}
