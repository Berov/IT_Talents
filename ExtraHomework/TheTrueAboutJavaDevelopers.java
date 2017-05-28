import java.util.Scanner;

public class TheTrueAboutJavaDevelopers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean someGuyIsSmart = true;
		String answer = new String();
		System.out.println("Please enter the word ANDROID");
		answer = sc.nextLine();

		if (answer.equals("android") || answer.equals("андроид")) {
			System.out.println("Maybe this guy is smart.");
		} else {
			System.out.println("Maybe this guy isn't too smart. Too bad.");
			someGuyIsSmart = false;
		}

		if (!someGuyIsSmart) {
			System.out.println("Think about the word Java/жаба especially if you wanna become a Java developer!");
		}

		sc.close();
	}
}
