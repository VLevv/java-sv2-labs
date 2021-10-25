package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
    private List<String> titles=new ArrayList<>();

    public void addBook(String title){
        titles.add(title);
    }

    public List<String> getTitles() {
        return titles;
    }

    public void findBookAndSetAuthor(String title,String author){
        if(titles.contains(title)){
         titles.set(titles.indexOf(title),(author+": "+title));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Books books = new Books();
        System.out.println("Hány könyv címet szeretne eltárolni ?");
        int max= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Adja meg a könyv címeket!");
        for(int i=0;i<max;i++){
            books.addBook(scanner.nextLine());
        }
        books.findBookAndSetAuthor("Alma","Kiss Gyula");
        System.out.println(books.getTitles());
    }
}
