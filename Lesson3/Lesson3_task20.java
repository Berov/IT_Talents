
public class Lesson3_task20 {

	public static void main(String[] args) {
		int temp = 1;
		
		for (int i = 1; i <= 10; i++) {
			for (int ii = 1; ii <= 10; ii++) {
				System.out.print(temp + " ");
				temp++;
				if (temp == 10) {
					temp = 0;
				}
			}
			System.out.println();
			temp++;
			if (temp == 10) {
				temp = 0;
			}
		}
	}
}
