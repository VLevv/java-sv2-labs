package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book=new Book("Tűzharc");
        System.out.println(book.getTitle());
        book.setTitle("Kéziszótár");
        System.out.println(book.getTitle());
    }
}
