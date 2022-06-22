package hexlet.code;
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
            default: System.out.println("Unknown command, please try again.");
        }
    }
}
