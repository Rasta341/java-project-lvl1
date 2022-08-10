package hexlet.code.games;
import hexlet.code.Engine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import org.apache.commons.lang3.ArrayUtils;
public class Progression {
    public static void progression() {
        Engine.greet();
        System.out.println("What number is missing in the progression?");
        while (Engine.isWin()) {
            int x = Engine.getRandomNum10() + 1;
            int d = Engine.getRandomNum10() + 1;
            final int arrLength = 10;
            int[] arr = new int[arrLength];
            arr[0] = x;
            for (int i = 1; i < arr.length - 1; i++) {
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
            String str = String.valueOf(arr2);
            System.out.println("Question: " + str.replace('[', ' ')
                .replace(']', ' ')
                .replace(", ", " ")
                .trim());
            var userAnswer = Integer.parseInt(Engine.setUserAnswer());
            if (userAnswer == Integer.parseInt(correctAnswer)) {
                Engine.correct();
            } else {
                Engine.wrong();
                break;
            }
        }
        Engine.congrats();
    }
}
