/*Напишете програма, която първо чете 2 масива и после извежда
съобщение дали са еднакви, и дали са с еднакъв размер.
*/
public class Task_06 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int flag = 0; // 0 = same length && equal ; 1 = different length && not equal; 2 = same length && not equal

		if (arr1.length != arr2.length) {
			flag = 1;
		} else {
			for (int i = 0; i < arr2.length; i++) {
				if (arr1[i] != arr2[i]) {
					flag = 2;
				}
			}
		}

		switch (flag) {
		case 0:
			System.out.println("These arrays are with the same size and they are equal");
			break;
		case 1:
			System.out.println("These arrays are completely different - different length && not equal");
			break;
		case 2:
			System.out.println("These arrays are with the same size but they are not equal");
			break;
		}
	}
}
