import java.util.Scanner;

public class Lesson5_task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 0;

		System.out.println("�������� ������� �� 1 �����");
		int length1 = sc.nextInt();
		int[] arr1 = new int[length1];
		for (int i = 0; i < length1; i++) {
			System.out.println("�������� " + (i + 1) + " �������� �� ����� �����");
			arr1[i] = sc.nextInt();
		}

		System.out.println("�������� ������� �� 2 �����");
		int length2 = sc.nextInt();
		int[] arr2 = new int[length2];
		for (int i = 0; i < length2; i++) {
			System.out.println("�������� " + (i + 1) + " �������� �� ����� �����");
			arr2[i] = sc.nextInt();
		}

		if (arr1.length == arr2.length) {
			flag = 1;
			for (int i = 0; i < arr1.length; i++)
				if (arr1[i] == arr2[i]) {
					flag = 2;
				}
		}

		switch (flag) {
		case 0:
			System.out.println("�������� �� �� ������� � �� �� � ������� ������");
			break;
		case 1:
			System.out.println("�������� �� �� �������, �� �� � ������� ������");
			break;
		case 2:
			System.out.println("�������� �� ������� � �� � ������� ������");
			break;
		}
		
		sc.close();
	}

}
