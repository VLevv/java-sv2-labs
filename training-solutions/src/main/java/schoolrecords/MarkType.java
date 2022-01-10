package schoolrecords;

public enum MarkType {

    A(5, "excellent"), B(4, "very good"), C(3, "improvement needed"), D(2, "close fail"), F(1, "fail");

    private int mark;
    private String markType;

    MarkType(int mark, String markType) {
        this.mark = mark;
        this.markType = markType;
    }

    public int getMark() {
        return mark;
    }

    public String getMarkType() {
        return markType;
    }

    @Override
    public String toString() {
        return markType+"("+mark+")";
    }
}
