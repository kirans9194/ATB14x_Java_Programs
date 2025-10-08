package excercise_StringBuffer_Builder;

public class Lab058_String_Functions {

    public static void main(String[] args) {

        String name="pranav";

        //length
        System.out.println(name.length());
        //charAt
        System.out.println(name.charAt(2));
        //concat()
        System.out.println(name.concat("aadvik"));

        //contains()
        System.out.println(name.contains("nav"));
        //equals()
        System.out.println(name.equals("pranav"));
        //equalsIgnorCase()
        System.out.println(name.equalsIgnoreCase("PRANAV"));
        //indexOf()
        System.out.println(name.indexOf('a'));

        //replace(,)
        System.out.println(name.replace('r','a'));
        //substring()
        System.out.println(name.substring(1,4));
        //tolowercase()
        System.out.println(name.toLowerCase());
        //toUpperCase()
        System.out.println(name.toUpperCase());
        //startsWith()
        System.out.println(name.startsWith("a"));//false
        //endsWith()
        System.out.println(name.endsWith("v"));
        //compareTo()
        System.out.println(name.compareTo("pranav"));


        StringBuilder builder = new StringBuilder("Pranav");
        StringBuilder reverse=builder.reverse();
        System.out.println(reverse);


        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());

    }
}
