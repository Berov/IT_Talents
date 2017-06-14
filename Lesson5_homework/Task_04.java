/*Да се прочете масив и да се отпечата дали е огледален.
Следните масиви са огледални:
[3 7 7 3]
[4]
[1 55 1]
[6 27 -1 5 7 7 5 -1 27 6]
*/
public class Task_04 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
		boolean isMirrorImage = true;

		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != arr[arr.length - 1 - i]) {
				isMirrorImage = false;
				break;
			}
		}

		if (isMirrorImage) {
			System.out.println("The array is a mirror image");
		} else {
			System.out.println("The array is not a mirror image");
		}

	}

}
