//Да се създаде метод, който отпечатва масив в конзолата.

public class Task_11 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[][] arr2 = { 
				{ 1, 2, 3, 4, 5 }, 
				{ 3, 4, 5, 6 }, 
				{ 9, 8, 7, 6, 5 } 
				};
		char[] arr3 = { 'q', 'w', 'e', 'r', 't' };
		char[][] arr4 = { 
				{ 'q', 'w', 'e', 'r', 't' }, 
				{ 'a', 's', 'd', 'f' }, 
				{ 'z', 'x', 'c', 'v', 'b' } 
				};

		printIntArray(arr1);
		printIntArray2d(arr2);
		prinCharArray(arr3);
		printCharArray2d(arr4);

	}

	static void printIntArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	static void printIntArray2d(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void prinCharArray(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	static void printCharArray2d(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
