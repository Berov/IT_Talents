import java.util.Scanner;

public class Lesson3_task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����� �����");
		int firstNumber = sc.nextInt();
		System.out.println("�������� ����� �����");
		int secondNumber = sc.nextInt();

		if (firstNumber > secondNumber) {
			int tempNumber = firstNumber;
			firstNumber = secondNumber;
			secondNumber = tempNumber;
		}

		while (firstNumber <= secondNumber) {
			System.out.println(firstNumber);
			firstNumber++;
		}
		sc.close();
	}

}
