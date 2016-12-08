import java.util.Scanner;

public class Lesson2_task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Какъв е обема за пълнене?");
		int obem = sc.nextInt();
		int broi = obem / 5;
		int ostatak = obem - broi * 5;
		if (ostatak == 0) {
			System.out.println("Ще е необходимо " + broi + " пъти да се пълнят кофите от 2 и 3 литра");
		}
		if (ostatak == 1) {
			System.out.println("Ще е необходимо " + (broi - 1) + " пъти да се пълни кофата от 2 литра и " + (broi+1) + " пъти да се пълни кофата от три литра");
		}
		if (ostatak == 2) {
			System.out.println("Ще е необходимо " + (broi + 1) + " пъти да се пълни кофата от 2 литра и " + broi + " пъти да се пълни кофата от три литра");
		}
		if (ostatak == 3) {
			System.out.println("Ще е необходимо " + broi + " пъти да се пълни кофата от 2 литра и " + (broi + 1) + " пъти да се пълни кофата от три литра");
		}
		if (ostatak == 4) {
			System.out.println("Ще е необходимо " + (broi+2) + " пъти да се пълни кофата от 2 литра и " + broi + " пъти да се пълни кофата от три литра");
		}
		
		sc.close();
	}

}
