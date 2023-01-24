package baseball.controller;

import baseball.PlayerValidator;
import baseball.model.domain.Player;
import baseball.model.service.ComputerService;
import baseball.model.service.PlayerService;
import baseball.view.GeneralOutputView;
import baseball.view.PlayerInputView;

public class ComputerController {
    private final ComputerService computerService;
    private PlayerService playerService;

    public ComputerController() {
        this.playerService = new PlayerService();
        this.computerService = new ComputerService(playerService.getPlayer());
    }

    public void initStartGame() {
        GeneralOutputView.printStartGame();
    }

    public void initPlayerAnswer() {
        String inputPlayerAnswer = PlayerInputView.inputAnswerByPlayer();
        if (!PlayerValidator.validatePlayerAnswer(inputPlayerAnswer)) {
            throw new IllegalArgumentException();
        } playerService.setPlayerAnswer(PlayerValidator.isNumber(inputPlayerAnswer));
    }

    public void getScore() {
        computerService.getScore(playerService.getPlayerAnswer());
    }

    public void initPrintAnswer() {
        GeneralOutputView.printAnswer(playerService);
    }

    public boolean checkAllStrike() {
        Player player = playerService.getPlayer();
        return player.getStrike() == 3;
    }

    public String initGameCommandByPlayer() {
        return PlayerInputView.inputCommandByPlayer();
    }

    public boolean askRestart() {
        GeneralOutputView.printResult();
        return PlayerValidator.checkCommand(initGameCommandByPlayer());
    }

    public ComputerService getComputerService() {
        return computerService;
    }
}
/**
 * 숫자 야구 게임을 시작합니다.
 * 숫자를 입력해주세요 : 123
 * 1볼 1스트라이크
 * 숫자를 입력해주세요 : 145
 * 1볼
 * 숫자를 입력해주세요 : 671
 * 2볼
 * 숫자를 입력해주세요 : 216
 * 1스트라이크
 * 숫자를 입력해주세요 : 713
 * 3스트라이크
 * 3개의 숫자를 모두 맞히셨습니다! 게임 종료
 * 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
 * 1
 * 숫자를 입력해주세요 : 123
 * 1볼
 */