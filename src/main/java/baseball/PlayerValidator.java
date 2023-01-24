package baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerValidator {

    public PlayerValidator(List<Integer> playerAnswer) {

    }

    public static List<Integer> isNumber(String answer) {
        List<Integer> checkAnswerList = new ArrayList<>();
        boolean matches = Arrays.asList(answer).stream().
                allMatch(number -> number.matches("[1-9]+$"));
        if (matches) {
            for (int i = 0; i < answer.length(); i++) {
                checkAnswerList.add(answer.charAt(i) - '0');
            }
            return checkAnswerList;
        } throw new IllegalArgumentException();
    }

    public static boolean validatePlayerAnswer(String answer) {
        List<Integer> playerAnswer = isNumber(answer);
        return checkLength(playerAnswer) && checkRange(playerAnswer)
                && checkDistinct(playerAnswer);
    }

    private static boolean checkLength(List<Integer> inputPlayerAnswer) {
        System.out.println(inputPlayerAnswer);
        return inputPlayerAnswer.size() == 3;
    }

    private static boolean checkRange(List<Integer> inputPlayerAnswer) {
        return inputPlayerAnswer.stream()
                .filter(number -> 1 <= number && number <= 9)
                .count() == 3;
    }

    private static boolean checkDistinct(List<Integer> inputPlayerAnswer) {
        return inputPlayerAnswer.stream()
                .distinct()
                .count() == 3;
    }

    public static boolean checkCommand(String command) throws IllegalArgumentException{
        if (command.equals("1")) {
            return true;
        } else if (command.equals("2")) {
            return false;
        } throw new IllegalArgumentException();
    }
}
