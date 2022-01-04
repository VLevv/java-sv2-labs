package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine{
    private List<Person> vaccinationList=new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        for (Person p :
                registrated) {
            if (p.getAge() < 65 && p.getPregnant().equals(Pregnancy.NO) && p.getChronic().equals(ChronicDisease.NO)) {
                vaccinationList.add(p);
            }
        }
        for (Person p :
                registrated) {
            if (p.getPregnant().equals(Pregnancy.NO) && p.getChronic().equals(ChronicDisease.NO) && !vaccinationList.contains(p)){
                vaccinationList.add(p);
            }
        }
    }
}
