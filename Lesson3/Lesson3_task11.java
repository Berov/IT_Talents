import java.util.Scanner;

public class Lesson3_task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете положително число");
		int number = sc.nextInt();

		for (int i = 0; i <= number-1; i++) {

			for (int ii = 1; ii < number - i; ii++) {
				System.out.print(" ");
			}

			for (int ii = 1; ii < i+2; ii++) {
				System.out.print("*");
			}
			
			for (int ii = 0; ii < i; ii++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}

		sc.close();
	}

}
