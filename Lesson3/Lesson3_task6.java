import java.util.Scanner;

public class Lesson3_task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете едно положително число");
		int number = sc.nextInt();
		int start = 1;
		int result = 0;

		while (start <= number) {
			result = result + start;
			start++;
		}

		System.out.println("Резултатът е " + result);

		sc.close();
	}

}
