package excercise_Encapsulation;

public class Lab098_Encap_02 {
    public static void main(String[] args) {
        VWOLogin vwo = new VWOLogin("admin","pwd123");
        System.out.println(vwo.username);
        vwo.password="34555";
        System.out.println("New password" +vwo.password);

        GoodVWOLogin gvwo=new GoodVWOLogin("admin","pwd123");
        String user=gvwo.getUsername();
        System.out.println(user);
        String pass=gvwo.getPassword();
        System.out.println(pass);

        gvwo.setPassword("child1111",true);

    }

}

class VWOLogin{

    public String username;
    public String password;

    public VWOLogin(String username,String password){
        this.username=username;
        this.password=password;
    }
}

class GoodVWOLogin{
    private String username;
    private String password;

    public GoodVWOLogin(String username,String password){
        this.username=username;
        this.password=password;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(){
        this.username=username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password,boolean isGoodAdmin){
            if(isGoodAdmin){
                this.password=password;
            }else{
                System.out.println("Not allowed");
            }
    }

}
