/*Дадени са два едномерни масива с естествени числа.
Да се състави програма, която сравнява всички числа с еднакви
индекси от двата масива и записва в трети масив, по-голямото от
двете числа.
Да се изведе съдържанието и на трите масива
Пример:
18,19,32,1,3, 4, 5, 6, 7, 8
1, 2, 3,4,5,16,17,18,27,11
Изход:
18,19,32 ,4,5,16,17,18,27,11
*/
public class Task_18 {

	public static void main(String[] args) {
		int[] arr1 = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		int[] arr3;
		int extraArrLength = 0;
		int flag = 0;

		if (arr1.length > arr2.length) {
			arr3 = new int[arr1.length];
			extraArrLength = arr1.length - arr2.length;
			flag = 1;
		} else if (arr1.length < arr2.length) {
			arr3 = new int[arr2.length];
			extraArrLength = arr2.length - arr1.length;
			flag = 2;
		} else {
			arr3 = new int[arr1.length];
			extraArrLength = 0;
		}

		switch (flag) {
		case 0:
			for (int i = 0; i < arr3.length; i++) {
				if (arr1[i] > arr2[i]) {
					arr3[i] = arr1[i];
				} else {
					arr3[i] = arr2[i];
				}
			}
			break;
		case 1:
			for (int i = 0; i < arr3.length - extraArrLength; i++) {
				if (arr1[i] > arr2[i]) {
					arr3[i] = arr1[i];
				} else {
					arr3[i] = arr2[i];
				}
			}
			for (int i = arr3.length - extraArrLength; i < arr3.length; i++) {
				arr3[i] = arr1[i];
			}
			break;
		case 2:
			for (int i = 0; i < arr3.length - extraArrLength; i++) {
				if (arr1[i] > arr2[i]) {
					arr3[i] = arr1[i];
				} else {
					arr3[i] = arr2[i];
				}
			}
			for (int i = arr3.length - extraArrLength; i < arr3.length; i++) {
				arr3[i] = arr2[i];
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
}
// Works with different arrays's lengths. Can be optimized!!!