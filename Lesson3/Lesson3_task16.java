<<<<<<< HEAD
import java.util.Scanner;

public class Lesson3_task16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����� �� 10 �� 5555");
		int aNum = sc.nextInt();
		System.out.println("�������� ����� ����� �� 10 �� 5555");
		int bNum = sc.nextInt();

		if (bNum < aNum) {
			int tempNum = aNum;
			aNum = bNum;
			bNum = tempNum;
		}

		if (aNum != bNum && aNum >= 10 && aNum <= 5555 && bNum >= 10 && bNum <= 5556) {
			for (int i = bNum; i >= aNum; i--) {
				if (i % 50 == 0) {
					System.out.print(i);
					if (i - 50 > aNum) {
						System.out.print(",");
					}
				}
			}
		} else {
			System.out.println("������������ � �����!");
		}

		sc.close();
	}

}
=======
import java.util.Scanner;

public class Lesson3_task16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����� �� 10 �� 5555");
		int aNum = sc.nextInt();
		System.out.println("�������� ����� ����� �� 10 �� 5555");
		int bNum = sc.nextInt();

		if (bNum < aNum) {
			int tempNum = aNum;
			aNum = bNum;
			bNum = tempNum;
		}

		if (aNum != bNum && aNum >= 10 && aNum <= 5555 && bNum >= 10 && bNum <= 5556) {
			for (int i = bNum; i >= aNum; i--) {
				if (i % 50 == 0) {
					System.out.print(i);
					if (i - 50 > aNum) {
						System.out.print(",");
					}
				}
			}
		} else {
			System.out.println("������������ � �����!");
		}

		sc.close();
	}

}
>>>>>>> 4a969ad4eab46524680d1bbb6fef5d8299720e82
