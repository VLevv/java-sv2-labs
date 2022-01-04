package interfacedependencyinversion.amount;

public class Cash implements Payable{
    @Override
    public int getPayableAmount(int amount) {
        if(amount-amount/10*10<3){
            return amount/10*10;
        }else if (amount-amount/10*10>7){
            return amount/10*10+10;
        }else{
            return amount/10*10+5;
        }
    }
}
