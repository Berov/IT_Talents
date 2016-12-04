import java.util.Scanner;

public class Lesson5_task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 0;

		System.out.println("Въведете дължина на 1 масив");
		int length1 = sc.nextInt();
		int[] arr1 = new int[length1];
		for (int i = 0; i < length1; i++) {
			System.out.println("Въведете " + (i + 1) + " стойност от първи масив");
			arr1[i] = sc.nextInt();
		}

		System.out.println("Въведете дължина на 2 масив");
		int length2 = sc.nextInt();
		int[] arr2 = new int[length2];
		for (int i = 0; i < length2; i++) {
			System.out.println("Въведете " + (i + 1) + " стойност от втори масив");
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
			System.out.println("Масивите не са еднакви и не са с еднакъв размер");
			break;
		case 1:
			System.out.println("Масивите не са еднакви, но са с еднакъв размер");
			break;
		case 2:
			System.out.println("Масивите са еднакви и са с еднакъв размер");
			break;
		}
		
		sc.close();
	}

}
