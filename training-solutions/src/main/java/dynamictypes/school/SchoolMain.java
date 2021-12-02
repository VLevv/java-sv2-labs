package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School("School",20);
        School primarySchool=new PrimarySchool("Primary",10);
        School secondarySchool= new SecondarySchool("Seconrary",14);
        System.out.println(school);
        System.out.println(primarySchool);
        System.out.println(secondarySchool);
    }
}
