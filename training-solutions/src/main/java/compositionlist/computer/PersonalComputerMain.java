package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        PersonalComputer computer=new PersonalComputer(new Cpu("amd ssj",6000));
        computer.addHardware(new Hardware("video card","8gb"));
        computer.addHardware(new Hardware("mother board","45zjj3"));
        computer.addSoftware(new Software("Skype",32));
        System.out.println(computer);
    }
}
