import java.util.Scanner;

public class Lesson2_task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� � �����?");
		int hour = sc.nextInt();

		if (hour > 4 && hour <= 9) {
			System.out.println("����� ����");
		}

		if (hour > 9 && hour <= 18) {
			System.out.println("����� ���");
		}

		if (hour >= 0 && hour <= 4 || hour > 18 && hour <= 24) {
			System.out.println("����� �����");
		}
		sc.close();
	}

}
