package stringtype;

public class StirngTypeMain {
    public static void main(String[] args) {
        String prefix ="Hello ";
        String name="Jhon Doe";
        String massage = prefix + name;
        massage=massage+444;
        boolean b ="Hello Jhon Doe".equals(massage);
        boolean c ="Hello Jhon Doe444".equals(massage);
        System.out.println(prefix);
        System.out.println(name);
        System.out.println(massage);
        System.out.println(b);
        System.out.println(c);
        System.out.println(""+"");
        System.out.println((""+"").length());
        System.out.println("Abcde".length());
        System.out.println("Abcde".substring(0,1)+", "+"Abcde".substring(2,3));
        System.out.println("Abcde".substring(0,3));
    }
}
