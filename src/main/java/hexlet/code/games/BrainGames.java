package hexlet.code.games;
import hexlet.code.Engine;

public class BrainGames {
    public static void brainGames() {
        Engine.greet();
        String name = Engine.userName();
        System.out.println("Hello, " + name + "!" + "\nAnswer 'yes' if number even otherwise answer 'no'.");
        while (Engine.isWin()) {
            int question = (int) (Math.random() * 10 + 1);
            System.out.println(question);
            String userAnswer = Engine.getUserAnswer();
            String correctAnswer = "yes";
            Engine.getCorrectAnswer(correctAnswer);
            if (question % 2 != 0) {
                correctAnswer = "no";
            }
            if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                Engine.correct();
            } else {
                Engine.wrong();
            }
        }
        Engine.congrats();
    }
}
