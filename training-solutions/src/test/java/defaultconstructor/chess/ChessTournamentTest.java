package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChessTournamentTest {
    @Test
    void testTournament(){
        ChessTournament tournament = new ChessTournament();
        List<Player> players = new ArrayList<>(Arrays.asList(
                new Player(),
                new Player(),
                new Player()
        ));
        players.get(0).setName("Jani");
        players.get(1).setName("Peti");
        players.get(2).setName("Gabi");
        players.get(0).setEmail("asd@gmail.com");
        players.get(1).setEmail("asd@gmail.com");
        players.get(2).setEmail("asd@gmail.com");
        tournament.addPlayersToTeam(players);
        assertEquals("Gabi",tournament.getTeams().get(1).getPlayerOne().getName());
    }
}