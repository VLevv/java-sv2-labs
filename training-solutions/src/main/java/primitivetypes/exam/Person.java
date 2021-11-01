package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate yearOfBirth;
    private int zipCode;
    private double averageScore;

    public Person(String name, LocalDate yearOfBirth, int zipCode, double averageScore) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.zipCode = zipCode;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", zipCode=" + zipCode +
                ", averageScore=" + averageScore +
                '}';
    }
}
