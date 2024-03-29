package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner in = new Scanner(System.in);
    private static String userAnswer = "";
    private static String correctAnswer = "";
    private static int countOfWins = 0;
    private static final int NEEDWINS = 3;
    private static String username = "";
    public static int getRandomNum10() {
        final int a = 1;
        final int b = 9;
        return a + (int) (Math.random() * b);
    }
    public static int getRandomNum100() {
        final int multiplier100 = 100;
        return (int) (Math.random() * multiplier100);
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        double s = Math.sqrt(number);
        for (int i = 2; i <= s; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    //Приветствие + имя игрока
    public static void greet() {
        System.out.println("Welcome to the Brain Games!" + "\nMay I have your name?");
        username = in.nextLine();
        System.out.println("Hello, " + username + "!");
    }
    //условие для победы в игре
    public static boolean isWin() {
        return countOfWins < NEEDWINS;
    }
    //ответы игрока
    public static String setUserAnswer() {
        userAnswer = in.nextLine();
        System.out.println("Your answer: " + userAnswer);
        return String.valueOf(userAnswer);
    }
    //правильные ответы
    public static void setCorrectAnswer(String str) {
        correctAnswer = str;
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
        if (countOfWins >= NEEDWINS) {
            System.out.println("Congratulations, " + username + "!");
        }
    }
}
