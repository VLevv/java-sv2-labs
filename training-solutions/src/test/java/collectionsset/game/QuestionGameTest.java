package collectionsset.game;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestionGameTest {

    @Test
    void drawWinners() {
        QuestionGame game = new QuestionGame(new ArrayList<>(Arrays.asList(
                new RightAnswer("Jani"),
                new RightAnswer("Peti"),
                new RightAnswer("Dani"),
                new RightAnswer("Jani"),
                new RightAnswer("Peti"),
                new RightAnswer("Jani"),
                new RightAnswer("Gabi"),
                new RightAnswer("Peti"),
                new RightAnswer("Jani"),
                new RightAnswer("Mari")
        )));
        QuestionGame game1 = new QuestionGame(new ArrayList<>(Arrays.asList(
                new RightAnswer("Jani"),
                new RightAnswer("Peti"),
                new RightAnswer("Dani"),
                new RightAnswer("Jani"),
                new RightAnswer("Peti"),
                new RightAnswer("Jani"),
                new RightAnswer("Gabi"),
                new RightAnswer("Peti"),
                new RightAnswer("Jani")
        )));
        assertEquals(5,game.drawWinners().size());
        assertThrows(IllegalArgumentException.class,()->game1.drawWinners());
    }
}