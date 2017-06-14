/*Напишете програма, която намира и извежда най-дългата редица от
еднакви поредни елементи в даден масив.
*/
public class Task_08 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		
		int startIndex = 0;
		int endIndex = 0;
		int counter = 0;
		int tempCounter = 0;

		for (int i = 0; i < arr.length; i++) {
			tempCounter = 0;
			while (arr[i] == arr[i + tempCounter]) {
				tempCounter++;
				if (i + tempCounter >= arr.length) {
					break;
				}
			}
			if (tempCounter > counter) {
				counter = tempCounter;
				startIndex = i;
				endIndex = i + counter;
			}
		}

		if (counter > 1) {
			for (int i = startIndex; i < endIndex; i++) {
				System.out.print(arr[i] + " ");
			}
		} else {
			System.out.println("There is no sequential elements!");
		}
	}
}
