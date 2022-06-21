package hexlet.code;
public class App {
    public static void main(String[] args) {
        System.out.println("""
            Please enter the game number and press Enter.
            1 - Greet
            2 - Exit""");
        Cli.selectGame();
    }
}
