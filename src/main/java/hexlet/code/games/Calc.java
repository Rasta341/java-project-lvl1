package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
    public static void calc() {
        Engine.greet();
        String name = Engine.userName();
        System.out.println("Hello, " + name +  "!" + "\nWhat is the result of the expression?");
        final int multiplier = 3;
        while (Engine.isWin()) {
            int operation = 1 + (int) (Math.random() * multiplier);
            int operand1 = Engine.getRandomNum100();
            int operand2 = Engine.getRandomNum100();
            int result = 0;
            switch (operation) {
                case 1:
                    result = operand1 + operand2;
                    System.out.println("Question: " + operand1 + "+" + operand2);
                    break;
                case 2:
                    result = operand1 - operand2;
                    System.out.println("Question: " + operand1 + "-" + operand2);
                    break;
                case 3:
                    final int devider = 10;
                    result = (operand1 / devider) * (operand2 / devider);
                    System.out.println("Question: " + (operand1 / devider) + "*" + (operand2 / devider));
                    break;
                default:
                    break;
            }
            Engine.getCorrectAnswer(String.valueOf(result));
            String userAnswer = Engine.getUserAnswer();
            if (Integer.parseInt(userAnswer) == result) {
                Engine.correct();
            } else {
                Engine.wrong();
            }
        }
        Engine.congrats();
    }
}
