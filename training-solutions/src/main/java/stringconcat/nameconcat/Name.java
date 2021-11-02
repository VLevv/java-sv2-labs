package stringconcat.nameconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Titles title;

    public Name(String familyName, String middleName, String givenName, Titles title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle(){
        String tmp="";
        if(title!=null){
            tmp = title.getValue();
        }
        tmp+=givenName;
        tmp+=middleName;
        tmp+=familyName;
        return tmp;
    }
    public String concatNameHungarianStyle(){
        if(title!=null){
            return title.getValue().concat(familyName).concat(middleName).concat(givenName);
        }
        return familyName.concat(middleName).concat(givenName);
    }
}
