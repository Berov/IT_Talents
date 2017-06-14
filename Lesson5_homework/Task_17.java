/*Една редица от естествени числа ще наричаме зигзагообразна нагоре,
ако за елементите и са изпълняват условията:
N1 < N2 > N3 < N4 > N5 <..
Съставете програма, която проверява дали въведени в едномерен
масив редица от числа изпълняват горните изисквания.
Пример: 1 3 2 4 3 7
Изход: изпълнява изискванията за зигзагообразна нагоре редица
*/
public class Task_17 {

	public static void main(String[] args) {
		int[] arr = { -1, 2, 1, 3, 2, 4, 3, 7 };
		boolean flag = true;

		for (int i = 0; i < arr.length - 2; i++) {
			if (!((arr[i] > arr[i + 1] && arr[i + 1] < arr[i + 2])
					|| (arr[i] < arr[i + 1] && arr[i + 1] > arr[i + 2]))) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("This array is jagged");
		} else {
			System.out.println("This array is not jagged");
		}
	}
}
