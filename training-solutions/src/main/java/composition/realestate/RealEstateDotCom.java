package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Address address = new Address("Rio","123321","Big street",34);
        Details details=new Details("Nice House",address,100,200);
        RealEstate realEstate = new RealEstate("Best house",300000,details);
        System.out.println(realEstate);
    }
}
