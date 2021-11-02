package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
    private List<Double> kms;
    private String name;

    public Run(String name) {
        kms=new ArrayList<>();
        this.name = name;
    }

    public void addRun(double km){
        kms.add(km);
    }

    public String printFormattedRunText(){
        String tmp =String.format("Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod.\nMost %.1f km-t futottál. Csak így tovább!",name, LocalDate.now().toString(),kms.size(),kms.get(kms.size()-1));
        return tmp;
    }

    public static void main(String[] args) {
        Run run = new Run("Bartók Ferenc");
        run.addRun(3.24);
        run.addRun(6.64);
        run.addRun(9.44);
        run.addRun(13.34);
        System.out.println(run.printFormattedRunText());
    }
}
