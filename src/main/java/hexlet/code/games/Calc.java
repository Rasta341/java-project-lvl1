package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
    public static void calc() {
        Engine.greet();
        System.out.println("What is the result of the expression?");
        final int multiplier = 3;
        final int one = 1;
        final int two = 2;
        final int three = 3;
        while (Engine.isWin()) {
            int operation = 1 + (int) (Math.random() * multiplier);
            int operand1 = Engine.getRandomNum100();
            int operand2 = Engine.getRandomNum100();
            int result = 0;
            switch (operation) {
                case one:
                    result = operand1 + operand2;
                    System.out.println("Question: " + operand1 + " + " + operand2);
                    break;
                case two:
                    result = operand1 - operand2;
                    System.out.println("Question: " + operand1 + " - " + operand2);
                    break;
                case three:
                    final int devider = 10;
                    result = (operand1 / devider) * (operand2 / devider);
                    System.out.println("Question: " + (operand1 / devider) + " * " + (operand2 / devider));
                    break;
                default:
                    break;
            }
            Engine.setCorrectAnswer(String.valueOf(result));
            String userAnswer = Engine.setUserAnswer();
            if (Integer.parseInt(userAnswer) == result) {
                Engine.correct();
            } else {
                Engine.wrong();
                break;
            }
        }
        Engine.congrats();
    }
}
