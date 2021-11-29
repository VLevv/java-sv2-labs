package recursion.vowels;

public class Vowels {
    public int getNumberOfVowels(String word){
        if(word.length()==1){
            if("aeuio".contains(word)){
                return 1;
            }
            return 0;
        }else {
            if("aeuio".contains(word.substring(0,1))){
                return 1+getNumberOfVowels(word.substring(1));
            }else {
                return 0+getNumberOfVowels(word.substring(1));
            }
        }
    }
}
