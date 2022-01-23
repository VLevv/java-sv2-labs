package collectionsequlashash.person;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int TAJ;

    public Person(String name, int age, int TAJ) {
        this.name = name;
        this.age = age;
        this.TAJ = TAJ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return TAJ == person.TAJ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(TAJ);
    }

    public static void main(String[] args) {
        Person person = new Person("Jani",23,123456789);
        Person person1 = new Person("Tibi",32,123456789);

        System.out.println(person1.equals(person));
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
    }
}
