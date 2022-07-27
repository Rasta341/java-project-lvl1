package hexlet.code.games;
import hexlet.code.Engine;

public class BrainGames {
    public static void brainGames() {
        Engine.greet();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        while (Engine.isWin()) {
            int question = 1 + Engine.getRandomNum10();
            System.out.println("Question: " + question);
            String userAnswer = Engine.setUserAnswer();
            String correctAnswer = "yes";
            Engine.setCorrectAnswer(correctAnswer);
            if (question % 2 != 0) {
                correctAnswer = "no";
            }
            if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                Engine.correct();
            } else {
                Engine.wrong();
                break;
            }
        }
        Engine.congrats();
    }
}
