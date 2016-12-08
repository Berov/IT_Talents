import java.util.Scanner;

public class Lesson3_task25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете положително число по-малко от 64");
		long n = sc.nextInt();
		long count = 1;
		long sum = 1;

		do {
			sum = sum * count;
			count++;

		} while (count <= n);

		System.out.println(sum);
		sc.close();
	}

}
