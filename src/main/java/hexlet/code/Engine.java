package hexlet.code;
import java.util.Scanner;

public class Engine {
    private static Scanner in = new Scanner(System.in);
    private static String userAnswer = "";
    private static String correctAnswer = "";
    private static int countOfWins = 0;
    private static final int NEEDWINS = 3;
    private static String username = "";
    //Приветствие + имя игрока
    public static void greet() {
        System.out.println("Welcome to the Brain Games!" + "\nMay I have your name?");
    }
    public static String userName() {
        username = in.nextLine();
        return username;
    }
    //условие для победы в игре
    public static boolean isWin() {
        return countOfWins < NEEDWINS;
    }
    //ответы игрока
    public static String getUserAnswer() {
        userAnswer = in.nextLine();
        System.out.println("Your answer: " + userAnswer);
        return String.valueOf(userAnswer);
    }
    //правильные ответы
    public static String getCorrectAnswer(String str) {
        correctAnswer = str;
        return correctAnswer;
    }
    //уведомления
    public static void correct() {
        System.out.println("Correct!");
        countOfWins++;
    }
    public static void wrong() {
        countOfWins = 0;
        System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
            + correctAnswer + "'. \nLet's try again, " + username + "!");
    }
    public static void congrats() {
        System.out.println("Congratulations, " + username + "!");
    }
    public static int getRandomNum10() {
        final int multiplier10 = 10;
        return (int) (Math.random() * multiplier10);
    }
    public static int getRandomNum100() {
        final int multiplier100 = 100;
        return (int) (Math.random() * multiplier100);
    }
}
