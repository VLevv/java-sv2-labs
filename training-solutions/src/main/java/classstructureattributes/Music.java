package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Song song =new Song();
        System.out.println("Kérem adja meg a kedvenc zene számának az előadóját, címét és a hosszát percben!");
        song.band=scanner.nextLine();
        song.title=scanner.nextLine();
        song.length=scanner.nextInt();
        scanner.nextLine();
        System.out.println(song.band+" - "+song.title+" ("+song.length+" perc)");
    }
}
