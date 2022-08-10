package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void prime() {
        Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (Engine.isWin()) {
            int num = Engine.getRandomNum10();
            System.out.println("Question: " + num);
            String correctAnswer;
            String userAnswer = Engine.setUserAnswer();
            if (Engine.isPrime(num)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            Engine.setCorrectAnswer(correctAnswer);
            if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                Engine.correct();
            } else {
                Engine.wrong();
            }
        }
        Engine.congrats();
    }
}
