
public class Lesson5_task4 {

	public static void main(String[] args) {
		int[] arr = { 8, 2, 3, 2,  5, 2, 3, 2, 8 };
		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[arr.length - 1 - i])
				flag = false;
		}

		if (flag) {
			System.out.println("Масивът е огледален");
		} else {
			System.out.println("Масивът не е огледален");
		}

	}

}
