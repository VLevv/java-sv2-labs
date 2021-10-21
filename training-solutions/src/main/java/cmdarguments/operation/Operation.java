package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {
    for (int i = 0; i< args.length;++i){
        switch (args[i]){
            case "/list":
                System.out.println("Listázás") ;break;
            case "/add":
                System.out.println("Hozzáadás");break;
            case "/delete":
                System.out.println("Törlés");break;
            default:
                System.out.println("Ismeretlen művelet");
        }
    }
    }
}
