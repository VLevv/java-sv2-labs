package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Kaliko Jack","New Land");
        book.register("23423");
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getRegNumber());
    }
}
