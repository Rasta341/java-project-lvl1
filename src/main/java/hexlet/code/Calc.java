package hexlet.code;

import java.util.Scanner;

public class Calc {
    public static void calc() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!" + "\nMay I have your name?");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!" + "\nWhat is the result of the expression?");
    
        int needWins = 3;
        int countOfWins = 0;
        while(countOfWins < needWins) {
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
            }
    
            int answer = in.nextInt();
            System.out.println("Your answer: " + answer);
            if (answer == result) {
                System.out.println("Correct!");
                countOfWins ++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. " +
                    "Correct answer is: '" + result + "'. " +
                    "\nLet's try again, " + name + "!");
                countOfWins = 0;
            }
    
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
