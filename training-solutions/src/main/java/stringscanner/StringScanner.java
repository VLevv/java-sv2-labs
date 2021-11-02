package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Ez egy olyan mondat, amely több tagmondatból áll, és ezért megfelel a feladatkiírásnak.");
        Scanner scanner1 = new Scanner("Ez egy olyan mondat, amely több tagmondatból áll, és ezért megfelel a feladatkiírásnak.").useDelimiter(", ");
        while (scanner1.hasNext()){
            System.out.println(scanner1.next());
        }
    }
}
