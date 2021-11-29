package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {
    public Trainer getTrainerWithMaxAge(List<Trainer> trainers){
        int max= trainers.get(0).getAge();
        for (Trainer trainer:trainers) {
            if(max<trainer.getAge()){
                max=trainer.getAge();
            }
        }
        for (Trainer t :
                trainers) {
            if (t.getAge() == max) {
                return t;
            }
        }
        return null;
    }
}
