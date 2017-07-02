/*Да се състави програма, която проверява дали въведено естествено
число е просто.
Пример: 101
Изход: просто
*/
public class Task_03 {

	public static void main(String[] args) {
		int n = 19;

		if (primeNumberCheck(n, n - 1)) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}

	}

	static boolean primeNumberCheck(int n, int index) {
		if (index > 1) {
			if (n % index == 0) {
				return false;
			}
			return primeNumberCheck(n, index - 1);
		}
		return true;
	}

}
