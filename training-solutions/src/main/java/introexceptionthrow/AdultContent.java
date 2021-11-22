package introexceptionthrow;

public class AdultContent {
    public static void main(String[] args) {
        Adult adult = new Adult("Jani",21);
        Adult adultish = new Adult("Jancsi",17);
        System.out.println(adult.getAge());
        System.out.println(adult.getName());
        System.out.println(adultish.getAge());
        System.out.println(adultish.getName());
    }
}
