package chars;

public class Whitespace {
    public String makeWhitespaceToStar(String text){
        char[] tmp = text.toCharArray();
        for(int i = 0;i<tmp.length;++i){
            if(Character.isWhitespace(tmp[i])){
                tmp[i]='*';
            }
        }
        String tmpString=new String(tmp);
        return tmpString;
    }

    public static void main(String[] args) {
        String test="art\r\n\n\ris art";
        Whitespace whitespace =new Whitespace();
        System.out.println(whitespace.makeWhitespaceToStar(test));
    }
}
