package algoritmsmax.trainer;

import algorithmsmax.trainer.MaxAgeCalculator;
import algorithmsmax.trainer.Trainer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {
    @Test
    void testTrainer(){
        List<Trainer> trainers = Arrays.asList(
                new Trainer("Jani",20),
                new Trainer("Peti",30),
                new Trainer("Gabi",40),
                new Trainer("Gyuri",44),
                new Trainer("Dani",24)
        );
        assertEquals(trainers.get(3),new MaxAgeCalculator().getTrainerWithMaxAge(trainers));
    }
}
