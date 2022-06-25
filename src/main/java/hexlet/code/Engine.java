package hexlet.code;
import java.util.Scanner;

public class Engine {
    static Scanner in = new Scanner(System.in);
    static String userAnswer = "";
    static String correctAnswer = "";
    static int countOfWins = 0;
    static int needWins = 3;
    static String username = "";
    
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
        return countOfWins < needWins;
    }
    
    //ответы игрока
    public static String getUserAnswer() {
        userAnswer = in.nextLine();
        System.out.println("Your answer: " + userAnswer);
        return String.valueOf(userAnswer);
    }
    
    //правильные ответы
    public static void getCorrectAnswer(String str) {
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
}