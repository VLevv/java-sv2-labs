package stringconcat.nameconcat;

public enum Titles {
    Mr("Mr. "),Mrs("Mrs. "),Ms("Ms. "),Dr("Dr. ");

    private final String value;

    Titles(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
