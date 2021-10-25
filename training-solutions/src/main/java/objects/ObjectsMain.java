package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        Book emptyBook = new Book();
        System.out.println(emptyBook);
        emptyBook = null;
        System.out.println(emptyBook);
        System.out.println(emptyBook==null);
        Book book = emptyBook;
        System.out.println(book);
        book =null;
        System.out.println(book);
        book=new Book();
        System.out.println(book);
        Book anotherBook = new Book();
        System.out.println(book==anotherBook);
        book=anotherBook;
        System.out.println(book);
        System.out.println(book==anotherBook);


        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;


        Book[] shelf = {book1, book2, book3};
        List<Book> shelf2= Arrays.asList(book1,book2,book3);
        List<Book> shelf3=new ArrayList<>();
        shelf3.add(book);
        shelf3.add(book1);
        shelf3.add(book2);
        for (Book i:shelf) {
            System.out.println(i);
        }
        System.out.println(shelf2);
        System.out.println(shelf3);
    }
}
