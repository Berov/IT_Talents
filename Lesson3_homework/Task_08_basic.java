import java.util.Scanner;

/*По зададено число n, да се изведе на екрана таблица по следния начин:
	
Въведете n:		Въведете n:		Въведете n:		Въведете n:
1				2				3				4
0				11				222				3333
				33				444				5555
								666				7777
												9999
*/

public class Task_08_basic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a digit");
		int n = sc.nextInt();

		for (int i = 1, temp = n - 1; i <= n; i++, temp += 2) {
			for (int j = 1; j <= n; j++) {
				System.out.print(temp);
			}
			System.out.println();
		}

		sc.close();

	}

}
