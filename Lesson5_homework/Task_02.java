
/*Нека по въведен масив да се конструира нов, като половината му
елементи са точно като на оригиналния, а другите да са тези
елементи, но в обратен ред. Последно, да се изведе новия масив
на екрана
*/
public class Task_02 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] newArr = new int[arr.length];

		for (int i = 0, ii = arr.length - 1; i < arr.length; i++, ii--) {

			if (i < arr.length / 2) {
				newArr[i] = arr[i];
			} else {
				newArr[i] = arr[ii];
			}
		}

		System.out.println("The new array is:");
		for (int i = 0; i < newArr.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(newArr[i]);
		}

	}

}
