package baseball.model.service;

import baseball.model.domain.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerService {
    Player player;
    List<Integer> playerAnswer;

    public PlayerService() {
        this.player = new Player();
        this.playerAnswer = new ArrayList<>();
        initPlayerAnswer();
    }

    public void initPlayerAnswer() {
        player.setPlayerAnswer(playerAnswer);
    }

    public List<Integer> getPlayerAnswer() {
        return playerAnswer;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayerAnswer(List<Integer> playerAnswer) {
        this.playerAnswer = playerAnswer;
        this.player.setPlayerAnswer(this.playerAnswer);
    }
}
