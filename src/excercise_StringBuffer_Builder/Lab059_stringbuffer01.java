package excercise_StringBuffer_Builder;

public class Lab059_stringbuffer01 {
    public static void main(String[] args) {

        String s1="kiran";
        s1=s1.concat("kumar");
        System.out.println(s1);

        StringBuffer buffer =new StringBuffer("kiran");
        buffer.append(" J");
        StringBuilder builder=new StringBuilder("kiran");

        System.out.println(buffer);
        System.out.println(builder);





    }
}
