package statements;

public class Investment {
    private double cost;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        this.active=true;
        this.cost=0.3;
    }

    public int getFund() {
        return fund;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public double getYield(int days){
        return (((double)days/365)*interestRate)*fund/100;
    }

    public double close(int days){
        double temp = active==true?((fund+this.getYield(days))*(100-cost)):0;
        active=false;
        return temp;
    }
}
