package hexlet.code.games;
import hexlet.code.Engine;
public class Prime {
    public static void prime() {
        Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        final int[] primeNumbers = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53};
        while (Engine.isWin()) {
            int num = Engine.getRandomNum100();
            System.out.println("Question: " + num);
            String correctAnswer = "";
            String userAnswer = Engine.setUserAnswer();
            for (int number : primeNumbers) {
                if (number == num) {
                    correctAnswer = "yes";
                    break;
                } else {
                    correctAnswer = "no";
                }
                Engine.setCorrectAnswer(correctAnswer);
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
