package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void selectGame() {
        Scanner in = new Scanner(System.in);
        int answer = in.nextInt();
        switch (answer) {
            case 1:
                BrainGames.brainGames();
                break;
            case 2:
                break;
            default: System.out.println("Unknown command, please try again.");
        }
    }
}
