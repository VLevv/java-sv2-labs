package introexceptioncatchtrace;

public class Jackpot {
    public static void main(String[] args) {
        Winner winner = new Winner();
        winner.addNames("Jhon");
        winner.addNames("Jane");
        winner.addNames("Jack");
        winner.addNames(null);
        winner.addNames("James");
        try{
            System.out.println(winner.getWinner());
        }catch (NullPointerException npe){
            System.out.println("Nem volt név megadva!");
        }
    }
}
