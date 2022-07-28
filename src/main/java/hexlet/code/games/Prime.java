package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void prime() {
        Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        boolean isPrime = false;
        while (Engine.isWin()) {
            int num = Engine.getRandomNum10();
            System.out.println("Question: " + num);
            String correctAnswer;
            String userAnswer = Engine.setUserAnswer();
            for (int i = 1; i <= num; i++) {
                isPrime = num % i == 0;
            }
            if (isPrime & num > 1 & num % num == 0) {
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
