package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
    public static void calc() {
        Engine.greet();
        String name = Engine.userName();
        System.out.println("Hello, " + name +  "!" + "\nWhat is the result of the expression?");
        
        while (Engine.isWin()) {
            int operation = 1 + (int) (Math.random() * 3);
            int operand1 = (int) (Math.random() * 100);
            int operand2 = (int) (Math.random() * 100);
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
                    result = (operand1 / 10) * (operand2 / 10);
                    System.out.println("Question: " + (operand1 / 10) + "*" + (operand2 / 10));
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
