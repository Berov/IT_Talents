import java.util.Scanner;

public class Lesson3_task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���� �����");
		int number = sc.nextInt();
		boolean flag = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("������� �� � ������");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("������� � ������");
		}
		sc.close();
	}

}
