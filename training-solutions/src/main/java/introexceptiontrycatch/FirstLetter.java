package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.List;

public class FirstLetter {
    private List<String> words = new ArrayList<>();

    public void printFirstLetter(){
        for (String s :
                words) {
            System.out.println(s.charAt(0));
        }
    }

    public void addWord(String word){
        words.add(word);
    }

    public static void main(String[] args) {
        FirstLetter letter = new FirstLetter();
        letter.addWord("alma");
        letter.addWord("banán");
        letter.addWord("répa");
        letter.addWord("kaktusz");
        letter.addWord("bors");
        letter.addWord("keszeg");
        letter.addWord(null);
        try {
            letter.printFirstLetter();
        }
        catch (NullPointerException exception){
            System.out.println("Nem adott meg szót!");
        }
    }
}
