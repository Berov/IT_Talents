<<<<<<< HEAD
import java.util.Scanner;

public class Lesson2_task1 {

	public static void main(String[] args) {
		System.out.println("���� �������� ����� ���� ����� ");
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		System.out.println("���� �������� ����� ���� ����� ");
		int secondNumber = sc.nextInt();
		System.out.println("����� �� ������ � ����� ���� ����� ");
		int thirdNumber = sc.nextInt();
		if ((thirdNumber > firstNumber && thirdNumber < secondNumber) || (thirdNumber < firstNumber && thirdNumber > secondNumber)) {
			System.out.println("������� " + thirdNumber + " � ����� " + firstNumber + " � " + secondNumber);
		} else {
			System.out.println(
					"���������, �� ������� " + thirdNumber + " �� � ����� " + firstNumber + " � " + secondNumber);
		}
		
		sc.close();
	}

}

=======
import java.util.Scanner;

public class Lesson2_task1 {

	public static void main(String[] args) {
		System.out.println("���� �������� ����� ���� ����� ");
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		System.out.println("���� �������� ����� ���� ����� ");
		int secondNumber = sc.nextInt();
		System.out.println("����� �� ������ � ����� ���� ����� ");
		int thirdNumber = sc.nextInt();
		if ((thirdNumber > firstNumber && thirdNumber < secondNumber) || (thirdNumber < firstNumber && thirdNumber > secondNumber)) {
			System.out.println("������� " + thirdNumber + " � ����� " + firstNumber + " � " + secondNumber);
		} else {
			System.out.println(
					"���������, �� ������� " + thirdNumber + " �� � ����� " + firstNumber + " � " + secondNumber);
		}
		
		sc.close();
	}

}

>>>>>>> 4a969ad4eab46524680d1bbb6fef5d8299720e82
