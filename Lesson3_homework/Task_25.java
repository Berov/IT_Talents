import java.util.Scanner;

/*Да се направи програма, която по дадено число N, да изчислява
N!, т.е. 1*2*3*4...*N.
Пример: 5
Изход: 120
Използвайте цикъл do-while. 
*/
public class Task_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		long sum = 1;
		int counter = 1;

		do {
			System.out.println("Enter a number (1-20)");
			n = sc.nextInt();
		} while (n < 1 || n > 20);

		do {
			sum = sum * counter;
			counter++;
		} while (counter <= n);

		System.out.println(sum);

		sc.close();
	}

}
