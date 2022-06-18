package hexlet.code;

import java.util.Scanner;

public class Cli {
	public static void startDialog(){
		Scanner in = new Scanner(System.in);
		String answer = in.nextLine();
		System.out.println("Hello, " + answer);
	}
}
