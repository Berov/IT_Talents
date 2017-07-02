/*Да се състави програма, която изчислява N-тото число на Фибоначи.
Първото и второто число на Фибоначи са 1-ци, всяко следващо е равно
на сбора на предходните 2.
Пример: 8
Изход: 21
Първите 5 числа на Фибоначи са : 1, 1, 2, 3, 5, 8, 13, 21
*/
public class Task_01 {

	public static void main(String[] args) {
		int n = 8;
		System.out.println(fibonacci(n));

	}

	static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
