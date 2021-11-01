package typeconversion;

public class ConversionMain {
    public static void main(String[] args) {
        Conversion conversion =new Conversion();
        int[] arr = {5, -14, 6, 2, 125, 354, 9738, 3};
        System.out.println(conversion.convertDoubleToDouble(5.23));
        byte[] bytes = conversion.convertIntArrayToByteArray(arr);
        for (byte b:
             bytes) {
            System.out.print(b+", ");
        }
        System.out.println();
        System.out.println(conversion.getFirsDecimal(5.43));
    }
}
