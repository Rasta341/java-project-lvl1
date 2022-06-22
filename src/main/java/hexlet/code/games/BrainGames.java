package hexlet.code.games;
import java.util.Scanner;
public class BrainGames {
    public static void brainGames() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!" + "\nMay I have your name?");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!" + "\nAnswer 'yes' if number even otherwise answer 'no'.");
        int countOfWins = 0;
        int needWins = 3;
        while (countOfWins < needWins) {
            int question = (int) (Math.random() * 10 + 1);
            System.out.println(question);
            String answer = in.nextLine();
            if (question % 2 == 0) {
                String correctAnswer = "yes";
                if ("yes".equalsIgnoreCase(answer)) {
                    System.out.println("Correct!");
                    countOfWins++;
                } else {
                    countOfWins = 0;
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'. \nLet's try again, " + name + "!");
                }
            } else {
                String correctAnswer = "no";
                if ("no".equalsIgnoreCase(answer)) {
                    System.out.println("Correct!");
                    countOfWins++;
                } else {
                    countOfWins = 0;
                    System.out.println("'" + answer + " is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'. \nLet's try again, " + name + "!");
                }
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
