package hexlet.code;

import java.util.Scanner;

public class BrainGames {
    public static void brainGames() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!" + "\nMay I have your name?");
        String answer = in.nextLine();
        System.out.println("Hello, " + answer + "!" + "\nAnswer 'yes' if number even otherwise answer 'no'.");
        // Дописать логику
    }
}
