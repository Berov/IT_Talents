/*Да се прочете масив и да се намери най-малкото число кратно на
3 от масива.
*/

public class Task_01 {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 1, 3, 1, 3, 1, 1, 1, -12, 12 };

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if ((min % 3 != 0 && arr[i] % 3 == 0) || (arr[i] < min && arr[i] % 3 == 0)) {
				min = arr[i];
			}
		}

		if (min % 3 != 0) {
			System.out.println("There is no numbers divided by 3!");
		} else {
			System.out.println("The minimum nuber divided by 3 in this array is " + min);
		}

	}

}
