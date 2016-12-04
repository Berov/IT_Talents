
public class Lesson2_task11 {

	public static void main(String[] args) {

		int x = 155; // въведено число без нула!!!

					// int a = x / 100;
					// int b = (x - (x / 100)*100) / 10;
					// int c = (x - (x / 100)*100 - ((x - (x / 100)*100) / 10)*10);
					// System.out.println(a + " " + b + " " + c);

		if ((x % x / 100 == 0) && (x % ((x - (x / 100) * 100) / 10) == 0) && (x % ((x - (x / 100) * 100 - ((x - (x / 100) * 100) / 10) * 10)) == 0)) {

			System.out.println("Числото " + x + " се дели на всяка своя цифра");
		} else {
			System.out.println("Числото " + x + " не се дели на всяка своя цифра");
		}

	}

}
