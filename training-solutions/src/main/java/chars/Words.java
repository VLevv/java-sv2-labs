package chars;

public class Words {
    public String pushWord(String word){
        String tmp="";
        for (int i = 0;i<word.length();++i){
            tmp=tmp+(char)(word.charAt(i)+1);
        }
        return tmp;
    }

    public static void main(String[] args) {
        String test = "alma";
        Words words = new Words();
        System.out.println(words.pushWord(test));
    }
}
