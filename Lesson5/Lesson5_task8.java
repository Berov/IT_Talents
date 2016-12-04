
public class Lesson5_task8 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 7, 9, 9, 9, 2, 0, 3, 3, 3, 3, 3, 3, 6, 8, 8, 6, 0, 3 };
		int counterLength = 1;
		int counterLengthTemp = 1;
		int counterPosition = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				counterLengthTemp++;
			}
			if (counterLengthTemp > counterLength) {
				counterLength = counterLengthTemp;
				counterPosition = i - counterLength + 1;

			}
			if (arr[i] != arr[i - 1]) {
				counterLengthTemp = 1;
			}
		}
		System.out.println("Най-дългата редица в масива се състои от следните " + counterLength + " символа:");
		for (int i = counterPosition; i < counterPosition + counterLength; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
