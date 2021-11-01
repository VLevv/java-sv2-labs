package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(4));
        Operators operators = new Operators();
        System.out.println(operators.isNull(""));
        System.out.println(operators.isNull(null));
        System.out.println(operators.getResultOfDivision(6,4));
        System.out.println(operators.isEven(4));
        System.out.println(operators.isEven(5));
        System.out.println(operators.isEmpty("3"));
        System.out.println(operators.isEmpty(""));
        System.out.println(operators.isEmpty(null));
    }
}
