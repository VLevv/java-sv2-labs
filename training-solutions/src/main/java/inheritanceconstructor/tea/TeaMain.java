package inheritanceconstructor.tea;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea = new Tea("Fekete",300);
        HerbalTea herbal= new HerbalTea("Zöld",400);

        System.out.println(tea.getName());
        System.out.println(tea.getPrice());
        System.out.println(herbal.getName());
        System.out.println(herbal.getPrice());
    }
}
