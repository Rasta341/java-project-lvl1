package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static int gcdResult(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcdResult(num2, num1 % num2);
    }
    public static void gcd() {
        Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        while (Engine.isWin()) {
            int num1 = Engine.getRandomNum100();
            int num2 = Engine.getRandomNum100();
            System.out.println("Question: " + num1 + " " + num2);
            int result = gcdResult(num1, num2);
            Engine.setCorrectAnswer(String.valueOf(result));
            String userAnswer = Engine.setUserAnswer();
            if (Integer.parseInt(userAnswer) == result) {
                Engine.correct();
            } else {
                Engine.wrong();
            }
        }
        Engine.congrats();
    }
}
