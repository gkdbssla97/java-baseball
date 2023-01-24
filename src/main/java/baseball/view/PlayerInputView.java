package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class PlayerInputView {

    public static String inputAnswerByPlayer() {
        System.out.print(MessageView.INPUT_NUMBER.getMessage());
        return Console.readLine();
    }

    public static String inputCommandByPlayer() {
        System.out.println(MessageView.RETRY_GAME.getMessage());
        return Console.readLine();
    }
}
