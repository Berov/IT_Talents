<<<<<<< HEAD
import java.util.Scanner;

public class Lesson2_task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����� ���������� �����");
		int firstNumber = sc.nextInt();
		System.out.println("�������� ����� ���������� �����");
		int secondNumber = sc.nextInt();

		System.out.print("�������������� �� ����� ����� � " + firstNumber*secondNumber+ " � ���������� �� ����� � ");
		if( (firstNumber*secondNumber)%2==0){
			System.out.println("�����");
		} else {
			System.out.println("�������");
		}
		if(firstNumber<10 || firstNumber>99 || secondNumber<10 || secondNumber>99){
			System.out.println("������� ��� ��� �� �������� ���������� �����... ����, � ���� ���������� ������ ;)");
		}
		sc.close();
	}

}
=======
import java.util.Scanner;

public class Lesson2_task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����� ���������� �����");
		int firstNumber = sc.nextInt();
		System.out.println("�������� ����� ���������� �����");
		int secondNumber = sc.nextInt();

		System.out.print("�������������� �� ����� ����� � " + firstNumber*secondNumber+ " � ���������� �� ����� � ");
		if( (firstNumber*secondNumber)%2==0){
			System.out.println("�����");
		} else {
			System.out.println("�������");
		}
		if(firstNumber<10 || firstNumber>99 || secondNumber<10 || secondNumber>99){
			System.out.println("������� ��� ��� �� �������� ���������� �����... ����, � ���� ���������� ������ ;)");
		}
		sc.close();
	}

}
>>>>>>> 4a969ad4eab46524680d1bbb6fef5d8299720e82
