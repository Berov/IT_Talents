package demo;

import java.util.Random;

import company.Company;
import order.Order;
import order.OrdinaryOrder;

public class Demo {

	public static void main(String[] args) {

		// Point 1 - create a new company
		Company fastFood = new Company("Berov's food");

		System.out.println("The new company looks like:");
		System.out.println(fastFood.toString() + "\n");

		// Point 2 - add at random some stuff
		System.out.println("New assignments...");
		for (int i = 0; i < 70; i++) {
			fastFood.addEmployee(Util.nameGenerator(), Util.restaurantNamesGenerator());
		}

		System.out.println("\nAfter assignments the company looks like:");
		System.out.println(fastFood.toString() + "\n");

		// Point 3 - add regional managers

		Order order = new OrdinaryOrder(new Random().nextDouble() * 30 + 2, new Random().nextInt(20) + 1, new Random().nextInt(30) + 1, new Random().nextInt(120) + 1);
		fastFood.addOrder(Util.restaurantNamesGenerator(), order);

		// да се генерират по 50 поръчки на ресторант с
		// най-различна сложност и като 10 от тях да бъдат поръчки
		// от тип проверка и да се подадат на служителите за
		// изпълнение, като половината от младшите сервитьори да
		// извикат операцията “прехвърли на друг”
		// на произволни 5 човека да им се изкарат всички
		// статистики

		// на произволни 5 ресторанта, на мениджърите им на смяна
		// да им се изпълни операцията “ нахокай сервитьора ”
		// да се изкарат всички статистики на фирмата
		// (10%)

	}

}
