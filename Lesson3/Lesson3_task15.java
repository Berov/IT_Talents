import java.util.Scanner;

public class Lesson3_task15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����������� ����� N");
		long n = sc.nextInt();
		long sum = 0;
		long counter = 1;

		if (n > 0) {

			do {
				sum = sum + counter;
				counter++;
			} while (counter <= n);
			System.out.println("������ � " + sum);
		} else {
			System.out.println("������������ � �����!");
		}

		sc.close();
	}

}
