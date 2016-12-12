
public class Lesson8_task13 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 9 };
		int[] arr2 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		int[] arr3 = createArray(arr1, arr2);
		printArray(arr3);

	}

	static int[] createArray(int[] a, int[] b) {
		int[] arr = new int[a.length + b.length];
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			arr[counter] = a[i];
			counter++;
		}
		for (int i = 0; i < b.length; i++) {
			arr[counter] = b[i];
			counter++;
		}
		return arr;
	}

	static void printArray(int[] p) {
		System.out.println("Създаденият масив (разпечатан с нов метод) е:");
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i] + " ");
		}
	}
}
