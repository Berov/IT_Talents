
public class Lesson3_task23 {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;

		while (y <= 9) {
			while (x <= 9) {
				System.out.print(y + "*" + x + "; ");
				x++;
			}
			System.out.println();
			y++;
			x = y;
		}

	}

}
