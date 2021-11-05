package controlselection.accents;

public class WithoutAccents {
    public char decent(char character){
        switch (Character.toLowerCase(character)){
            case ('á'):
                return 'a';
            case ('é'):
                return 'e';
            case ('í'):
                return 'i';
            case ('ó'):
                return 'o';
            case ('ő'):
                return 'ö';
            case ('ú'):
                return 'u';
            case ('ű'):
                return 'ü';
            default:
                return character;
        }
    }
}
