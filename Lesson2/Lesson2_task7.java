import java.util.Scanner;

public class Lesson2_task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете кръгъл час");
		int hour = sc.nextInt();
		System.out.println("Kолко лева и стотинки имате?");
		double sum = sc.nextDouble();
		System.out.println("Добре ли си със здравето? (Добре = true/ Зле = false)");
		boolean health = sc.nextBoolean();
		
		System.out.println("Доктор Охболи реши:");
		if(health!=true && sum>=10){
			System.out.println("За лекарства отиди и във къщи си легни!");
		}
		if(health!=true && sum<10){
			System.out.println("Щом парички нямаш ти - чайче в къщи си сипи!");
		}
		if(health==true && sum>=10){
			System.out.println("Здрав си като бик. Тичай на кино с някой съученик!");
		}
		if(health==true && sum<10){
			System.out.println("Здрав си. Пий кафе навън!");
		}
		if(hour<8 || hour>22){
			System.out.println("Но от мен да знаеш ти - по това убито време най-добре е да се дреме");
		}
		if(hour<0 || hour>24){
			System.out.println("За часа ме поизлъга...");
		}
		
		
		sc.close();
	}

}
