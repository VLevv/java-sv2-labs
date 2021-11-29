package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {
    public void getMarried(Woman woman,Man man){
        setupMan(man);
        setupWoman(woman,man);
    }

    private void setupWoman(Woman woman,Man man){
        woman.setName(man.getName().substring(0,man.getName().indexOf(" "))+woman.getName().substring(woman.getName().indexOf(" ")));
        woman.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.now()));
    }

    private void setupMan(Man man){
        man.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.now()));
    }
}
