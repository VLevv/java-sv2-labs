package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        Name name = new Name("Kiss","","Jakab",Titles.Dr);
        System.out.println(name.concatNameHungarianStyle());
        System.out.println(name.concatNameWesternStyle());
    }
}
