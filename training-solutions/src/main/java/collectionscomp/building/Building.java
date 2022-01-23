package collectionscomp.building;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building>{
    private String address;
    private double area;
    private Integer levels;

    public Building(String address, double area, int levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    public String getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public int getLevels() {
        return levels;
    }

    @Override
    public int compareTo(Building other) {
        return levels.compareTo(other.levels);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(levels, building.levels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", levels=" + levels +
                '}';
    }

    public static void main(String[] args) {
        Set<Building> buildings = new TreeSet<>(Set.of(
                new Building("asd",10,4),
                new Building("asd",10,3),
                new Building("asd",10,6)
        ));
        System.out.println(buildings);
    }
}
