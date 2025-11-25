package excercise_Encapsulation;

public class Lab099_Encaps_03 {
    public static void main(String[] args) {
        ICICIBank kiran=new ICICIBank("kiran",5000);
        long bal=kiran.getBal();
        System.out.println(bal);

        ICICIBank cashier=new ICICIBank("kiran",5000);
        cashier.setBal(5500,true);
        System.out.println(cashier.getBal());
    }
}

class ICICIBank{
    private String name;
    private long bal;

    public ICICIBank(String name, long bal ){
        this.name=name;
        this.bal=bal;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public long getBal(){
        return bal;
    }
    public void setBal(long bal, boolean isCashier){
        if(isCashier){
            this.bal=bal;
        }else{
            System.out.println("Not allowed");
        }

    }


}
