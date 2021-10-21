package finalmodifier;

public class TaxCalculator {
    public static final double ÁFA= 0.27;

    public double tax(double price){
        return price*ÁFA;
    }

    public double priceWithTax(double price){
        return price+tax(price);
    }
}
