
public class Lesson5_task1 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 5, 7, -2, 8, 0, 5, 2 };
		int minNumber = 0;
		int tempMinNumber = 0;
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				minNumber = arr[i];
				if (flag) {
					if (tempMinNumber > minNumber) {
						tempMinNumber = minNumber;
					}
				} else {
					tempMinNumber = minNumber;
					flag = true;
				}

			}

		}

		if (tempMinNumber == 0) {
			System.out.println("Няма число кратно на три");

		} else {
			System.out.println("Най-малкото число кратно на три е " + tempMinNumber);
		}

	}

}
