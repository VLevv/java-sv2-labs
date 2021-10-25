package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Address address=new Address("Hungary","Budapest","1146");
        Person person=new Person("Jani","456824PA");
        person.moveTo(address);
        System.out.println(person.personToString());
        System.out.println(address.addressToString());
        person.correctData();
        System.out.println(person.personToString());
        System.out.println(address.addressToString());
    }
}
