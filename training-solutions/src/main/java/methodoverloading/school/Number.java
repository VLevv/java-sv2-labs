package methodoverloading.school;

public enum Number {
    ONE(0),TWO(1),THREE(2);

    private int values;

    Number(int values) {
        this.values = values;
    }

    public int getValues() {
        return values;
    }
}
