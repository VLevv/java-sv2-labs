package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a termélnevet és az árat!");
        Product product=new Product(scanner.nextLine(),scanner.nextInt());
        System.out.println(product.getName()+" "+product.getPrice());
        product.increasePrice(300);
        product.decreasePrice(200);
        System.out.println(product.getName()+" "+product.getPrice());
    }
}
