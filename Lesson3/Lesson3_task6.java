<<<<<<< HEAD
import java.util.Scanner;

public class Lesson3_task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���� ����������� �����");
		int number = sc.nextInt();
		int start = 1;
		int result = 0;

		while (start <= number) {
			result = result + start;
			start++;
		}

		System.out.println("���������� � " + result);

		sc.close();
	}

}
=======
import java.util.Scanner;

public class Lesson3_task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���� ����������� �����");
		int number = sc.nextInt();
		int start = 1;
		int result = 0;

		while (start <= number) {
			result = result + start;
			start++;
		}

		System.out.println("���������� � " + result);

		sc.close();
	}

}
>>>>>>> 4a969ad4eab46524680d1bbb6fef5d8299720e82
