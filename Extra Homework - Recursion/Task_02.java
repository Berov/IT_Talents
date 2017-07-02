/*Да се състави програма, която изчислява произведение на две
естествени числа =>2, като се използва само събиране.
Входни данни: 2 естествени числа.
Пример: 4, 5
Изход: 20
*/
public class Task_02 {

	public static void main(String[] args) {
		int a = 9;
		int b = 7;
		int sum = 0;
		System.out.println(recursiveMultiplication(a, b, sum));

	}

	static int recursiveMultiplication(int a, int b, int sum) {
		if (a > 0) {
			sum += b;
			return recursiveMultiplication(a - 1, b, sum);
		}
		return sum;
	}
}
