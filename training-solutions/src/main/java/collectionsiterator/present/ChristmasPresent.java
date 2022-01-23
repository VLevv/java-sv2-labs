package collectionsiterator.present;

public class ChristmasPresent {
    private String description;
    private String targetName;
    private int price;

    public ChristmasPresent(String description, String targetName, int price) {
        this.description = description;
        this.targetName = targetName;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getTargetName() {
        return targetName;
    }

    public int getPrice() {
        return price;
    }
}
