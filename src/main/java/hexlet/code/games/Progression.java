package hexlet.code.games;
import hexlet.code.Engine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Progression {
    public static void progression() {
        Engine.greet();
        var name = Engine.userName();
        System.out.println("Hello, " + name + "!\nWhat number is missing in the progression?");
        while (Engine.isWin()) {
            int x = Engine.getRandomNum10();
            int d = Engine.getRandomNum100() + 1;
            final int arrLength = 10;
            int[] arr = new int[arrLength];
            arr[0] = x;
            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i - 1] + d;
            }
            Arrays.sort(arr);
            List<String> arr2 = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                arr2.add(i, String.valueOf(arr[i]));
            }
            int index = Engine.getRandomNum10();
            String correctAnswer = String.valueOf(arr2.get(index));
            Engine.setCorrectAnswer(correctAnswer);
            arr2.remove(index);
            arr2.add(index, "..");
            System.out.println("arr2: " + arr2);
            var userAnswer = Integer.parseInt(Engine.setUserAnswer());
            if (userAnswer == Integer.parseInt(correctAnswer)) {
                Engine.correct();
            } else {
                Engine.wrong();
            }
        }
        Engine.congrats();
    }
}
