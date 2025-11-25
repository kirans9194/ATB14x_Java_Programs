package excercise_enum;

public class Lab109_Enum {

    enum Env{
        DEV("https://dev.myapp.com"),
        STAGING("https://staging.myapp.com"),
        PROD("https://myapp.com");

        private final String baseurl;

        Env(String baseurl){
            this.baseurl=baseurl;
        }

        public String getbaseurl(){
            return baseurl;
        }

    }


}
