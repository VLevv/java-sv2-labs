package defaultconstructor.chess;

import java.util.Arrays;
import java.util.List;

public class ChessTournament {
    private List<Team> teams;

    public ChessTournament(){
        teams= Arrays.asList(new Team(),new Team(),new Team());
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void addPlayersToTeam(List<Player> playersRegistrated){
        for(int i=0;i< teams.size();i++){
            if(i*2<playersRegistrated.size()) {
                teams.get(i).setPlayerOne(playersRegistrated.get(i*2));
            }
            if(i*2+1<playersRegistrated.size()){
            teams.get(i).setPlayerTwo(playersRegistrated.get(i*2+1));
            }
        }
    }
}
