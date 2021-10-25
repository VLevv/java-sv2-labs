package attributes.bill;

public class BillMain {
    public static void main(String[] args) {
        BillItems items = new BillItems("kenyér",350,2,0.27);
        System.out.println(items.calculateTotalPrice());
    }
}
