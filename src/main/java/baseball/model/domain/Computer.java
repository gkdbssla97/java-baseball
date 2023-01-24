package baseball.model.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Integer> computerAnswer;

    public Computer() {
        this.computerAnswer = initComputerAnswer();
    }

    public List<Integer> initComputerAnswer() {
        computerAnswer = new ArrayList<>();
        while (computerAnswer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computerAnswer.contains(randomNumber)) {
                computerAnswer.add(randomNumber);
            }
        } return computerAnswer;
    }

    public List<Integer> getComputerAnswer() {
        return computerAnswer;
    }
}
