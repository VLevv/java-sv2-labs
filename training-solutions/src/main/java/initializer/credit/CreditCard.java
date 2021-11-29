package initializer.credit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreditCard {
    private long balance;
    private static final List<Rate> rates;

    static{
        rates=new ArrayList<>();
        rates.add(new Rate(Currency.EUR,320));
        rates.add(new Rate(Currency.SFR,270));
        rates.add(new Rate(Currency.GBP,370));
        rates.add(new Rate(Currency.USD,300));
    }

    public CreditCard(long balance){
        this.balance=balance;
    }

    public CreditCard(long balance,Currency currency){
        for (Rate r :
                rates) {
            if (currency.equals(r.getCurrency())) {
                this.balance=(long) ((double)balance*r.getConversionFactor());
            }
        }
    }

    public boolean payment(long amount){
        if(amount>balance){
            return false;
        }
        balance-=amount;
        return true;
    }

    public boolean payment(long amount, Currency currency){
        for (Rate r :
                rates) {
            if (r.getCurrency().equals(currency)){
                return payment((long) ((double)amount*r.getConversionFactor()));
            }
        }
        return payment(amount);
    }

    public long getBalance() {
        return balance;
    }
}
