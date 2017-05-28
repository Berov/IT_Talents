import java.util.Scanner;

/*Високосни години са всички години кратни на 4 с изключения
столетията, но без столетия кратни на 400, т.е. 1900 не е високосна,
но 1600 и 2000 са високосни.
Съставете програма, която по дадени ден, месец, година отпечатва
следващата дата.
*/

public class Task_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean leapYear = false;

		System.out.println("Въведете година");
		int year = sc.nextInt();
		System.out.println("Въведете месец");
		int month = sc.nextInt();
		System.out.println("Въведете ден (дата)");
		int day = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			leapYear = true;
		}

		if (((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31)
				|| ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30)
				|| (month == 2 && day == 28 && !leapYear) || (month == 2 && leapYear && day == 29)) {
			++month;
			day = 1;
		} else if (month == 12 && day == 31) {
			month = 1;
			day = 1;
			++year;
		} else {
			++day;
		}

		System.out.println("Следващата дата е " + day + "." + month + "." + year);

		sc.close();
	}

}
