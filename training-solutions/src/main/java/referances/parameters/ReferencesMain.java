package referances.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person =new Person("Laci",20);
        Person person1=person;
        person1.setName("Peti");
        System.out.println(person);
        System.out.println(person1);
        int number=24;
        int number1=number;
        number1++;
        System.out.println(number);
        System.out.println(number1);
        person1=new Person("Sanyi",30);
        System.out.println(person);
        System.out.println(person1);
    }
}
