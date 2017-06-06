//Да се изведат на екрана всички нечетни числа от -10 до 10

public class Task_03 {

	public static void main(String[] args) {

		// Option one
		for (int x = -10; x <= 10; x++) {
			if (x % 2 != 0) {
				System.out.println(x);
			}
		}

		System.out.println();
		
		// Option two - faster
		for (int y = -9; y < 10; y += 2) {
			System.out.println(y);
		}

	}

}
