package staticattrmath.bank;

public class BankTransaction {
    private static final long MIN_TRANSACTION_VALUE=1;
    private static final long MAX_TRANSACTION_VALUE=10000000;
    private static long countOfTransactions;
    private static long sumOfTransactions;
    private static long currentMinValue;
    private static long currentMaxValue;

    public BankTransaction(long transactionValue) {
        if (transactionValue > MAX_TRANSACTION_VALUE || transactionValue < MIN_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("Invalid transaction");
        }
        countOfTransactions++;
        sumOfTransactions += transactionValue;
        if (transactionValue < currentMinValue) {
            currentMinValue = transactionValue;
        }
        if (transactionValue > currentMaxValue) {
            currentMaxValue = transactionValue;
        }
    }

    public static void initTheDay(){
        countOfTransactions=0;
        sumOfTransactions=0;
        currentMaxValue=0;
        currentMinValue=Long.MAX_VALUE;
    }

    public static long getAverageOfTransaction(){
        return sumOfTransactions==0||countOfTransactions==0?0:sumOfTransactions/countOfTransactions;
    }

    public static long getCurrentMinValue() {
        return currentMinValue==Long.MAX_VALUE?0:currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return currentMaxValue;
    }

    public static long getSumOfTransactions() {
        return sumOfTransactions;
    }
}
