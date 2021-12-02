package objectclass.bag;

import java.util.Objects;

public class Beer {
    private String name;
    private int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beer beer = (Beer) o;
        return price == beer.price && Objects.equals(name, beer.name);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Beer(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
