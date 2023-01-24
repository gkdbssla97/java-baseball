package baseball;

import baseball.controller.ComputerController;
import baseball.model.domain.Computer;

public class Game {
    private ComputerController computerController;

    public Game() {
        this.computerController = new ComputerController();
        run();
    }

    void run() {
        computerController.initStartGame();
        System.out.println(computerController.getComputerService().getComputer().getComputerAnswer());
        do {
            computerController.initPlayerAnswer();
            computerController.getScore();
            computerController.initPrintAnswer();
        } while(!computerController.checkAllStrike());
    }

    boolean askRestart() {
        return computerController.askRestart();
    }
}
