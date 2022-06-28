package hexlet.code;
import hexlet.code.games.BrainGames;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Cli {
    public static void selectGame() {
        Scanner in = new Scanner(System.in);
        int answer = in.nextInt();
        switch (answer) {
            case 1:
                System.out.println("Your choice: 1");
                System.out.println("Welcome to the Brain Games!");
                break;
            case 2:
                System.out.println("Your choice: 2");
                BrainGames.brainGames();
                break;
            case 3:
                System.out.println("Your choice: 3");
                Calc.calc();
                break;
            case 4:
                System.out.println("Your choice: 4");
                GCD.gcd();
                break;
            case 5:
                System.out.println("Your choice: 5");
                Progression.progression();
                break;
            default: System.out.println("Unknown command, please try again.");
        }
    }
}
