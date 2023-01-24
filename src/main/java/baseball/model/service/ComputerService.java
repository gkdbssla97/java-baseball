package baseball.model.service;

import baseball.model.domain.Player;
import baseball.model.domain.Computer;

import java.util.List;

public class ComputerService {
    private Computer computer;
    private Player player;

    public ComputerService(Player player) {
        this.computer = new Computer();
        this.player = player;
    }
    
    public void getScore(List<Integer> playerAnswer) {
        this.player.initPlayerScoreBoard();
        for (int i = 0; i < 3; i++) {
            int index = playerAnswer.indexOf(computer.getComputerAnswer().get(i));
            if (index == i) {
                this.player.plusStrike();
            } else if (index != -1) {
                this.player.plusBall();
            }
        }
    }

    public Computer getComputer() {
        return computer;
    }
}
