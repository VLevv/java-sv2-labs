package controlselection.consonant;

public class ToConsonant {
    public char consonant(char character){
        switch (Character.toLowerCase(character)){
            case ('a'):
                return 'b';
            case ('e'):
                return 'f';
            case ('i'):
                return 'j';
            case ('o'):
                return 'p';
            case ('u'):
                return 'v';
            default:
                return character;
        }
    }
}
