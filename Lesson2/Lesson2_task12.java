import java.util.Scanner;

public class Lesson2_task12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете ден");
		int day = sc.nextInt();
		System.out.println("Въведете месец");
		int month = sc.nextInt();
		System.out.println("Въведете година");
		int year = sc.nextInt();
		boolean visokosna = false;
		boolean flag = true;

		if (year % 4 == 0) {
			visokosna = true;
		}
		if (year % 4 == 0 && year % 100 == 0) {
			visokosna = false;
		}
		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			visokosna = true;
		}
		if (month == 12 && day == 31) {
			year++;
			month = 1;
			day = 1;
			flag = false;
		}

		if (visokosna == false) {

			if (((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31) || ((month == 4 || month == 6 || month == 9 || month == 11 ) && day == 30) || (month == 2 && day == 28)) {
				day = 1;
				month++;
			} else {
				if(flag){
				day++;
				}
			}
		}

		
		if (visokosna == true) {

			if (((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31) || ((month == 4 || month == 6 || month == 9 || month == 11 ) && day == 30) || (month == 2 && day == 29)) {
				day = 1;
				month++;
			} else {
				if(flag){
				day++;
				}
			} 
		}		
		
		System.out.println("Следващия ден е: " + day + "." + month+"."+year);
		sc.close();
	}

}



//Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Часът е 7:03 сутринта. Ще се гръмна. Но си открих грешката. И двете.
