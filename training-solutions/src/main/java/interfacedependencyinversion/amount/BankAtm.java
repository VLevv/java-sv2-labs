package interfacedependencyinversion.amount;

public class BankAtm implements Payable{
    @Override
    public int getPayableAmount(int amount) {
        if(amount-amount/1000*1000<500){
            return amount/1000*1000;
        }else {
            return amount/1000*1000+1000;
        }
    }
}
