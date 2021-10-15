package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store store1 =new Store("Alma");
        Store store2 =new Store("Körte");
        System.out.println(store1.getProduct()+" "+store1.getStock());
        System.out.println(store2.getProduct()+" "+store2.getStock());
        store1.store(13);
        store2.store(34);
        System.out.println(store1.getProduct()+" "+store1.getStock());
        System.out.println(store2.getProduct()+" "+store2.getStock());
        store1.dispatch(4);
        store2.dispatch(23);
        System.out.println(store1.getProduct()+" "+store1.getStock());
        System.out.println(store2.getProduct()+" "+store2.getStock());
    }
}
