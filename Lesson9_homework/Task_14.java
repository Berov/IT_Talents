/*Да се състави метод, който приема за стойност число N и връща
стойността на N! (N факториел).
*/
public class Task_14 {

	public static void main(String[] args) {
		int n = 5;

		System.out.println(factorial(n));

		long x = factorial(10);
		System.out.println(x);

	}

	static long factorial(int n) {
		if (n == 2) {
			return 2;
		}
		return n * (factorial(n - 1));
	}

}
