package company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;

import company.restaurant.employee.Employee;
import company.restaurant.employee.JuniorWaiter;
import company.restaurant.employee.Manager;
import company.restaurant.employee.NormalWaiter;
import company.restaurant.employee.RobotManager;
import company.restaurant.employee.SeniorWaiter;
import company.restaurant.employee.Waiter;
import order.Order;

public class Company {

	// ---------- restaurant names
	enum RestaurantNames {

		RESTAURANT1("", null), RESTAURANT2("", null), RESTAURANT3("Kamelia", null), RESTAURANT4("", null), RESTAURANT5("", null), 
		RESTAURANT6("", null), RESTAURANT7("", null), RESTAURANT8("", null), RESTAURANT9("", null), RESTAURANT10("", null);

		private String restaurantName;
		private Manager manager;

		private RestaurantNames(String restaurantName, RegionalManager manager) {
			this.restaurantName = restaurantName;
			this.manager = new RobotManager("no manager yet");
		}

		public String getRestaurantName() {
			return this.name();
		}

		public void setRestaurantName(String newName) {
			this.restaurantName = newName;
		}
	}

	// --------------Reg Manager-----------
	public class RegionalManager extends Manager {

		public RegionalManager(String name, double salary) {
			super(name, salary);
		}

		@Override
		public void printReport() {
			// TODO Auto-generated method stub

		}

		@Override
		public void printProfit() {
			// TODO Auto-generated method stub

		}

	}

	// ------------Stuff Manager---------------
	public class StuffManager extends Manager {

		public StuffManager(String name, double salary) {
			super(name, salary);
		}

		@Override
		public void printReport() {
			// TODO Auto-generated method stub

		}

		@Override
		public void printProfit() {
			// TODO Auto-generated method stub

		}

	}

	// --------- The restaurant-----------------
	// private class Restaurant {
	//
	// private String name;
	//
	// }

	// --------------- the real Company ---------------
	private String companyName;
	private HashMap<RestaurantNames, HashSet<Employee>> restaurants;
	RegionalManager auto = new RegionalManager("Auto Manager", 0);

	public Company(String companyName) {
		this.companyName = companyName;
		restaurants = new HashMap<RestaurantNames, HashSet<Employee>>();
		for (RestaurantNames restaurantNames : RestaurantNames.values()) {
			HashSet<Employee> hs = new HashSet<Employee>();
			restaurants.put(restaurantNames, hs);
		}
	}

	@Override
	public String toString() {
		System.out.println("THE COMPANY - " + this.companyName);

		for (RestaurantNames restaurantNames : RestaurantNames.values()) {
			System.out.print("	RESTAURANT: ");
			if (restaurantNames.restaurantName.isEmpty() || restaurantNames.restaurantName.equals("")) {
				System.out.print("\'no name yet\' ");
			} else {
				System.out.print("\'" + restaurantNames.restaurantName + "\' ");
			}

			System.out.println("	manager - " + restaurantNames.manager.getName());

			System.out.println("		 Employees:");

			// HashMap<RestaurantNames, HashSet<Waiter>>

			if (restaurants.get(restaurantNames).size() < 1) {
				System.out.println("			There are not employees yet!");
			} else {

				for (Iterator<Employee> it = (restaurants.get(restaurantNames)).iterator(); it.hasNext();) {
					System.out.println(it.next().toString());
				}
			}
		}
		return "";
	}

	public void addEmployee(String newEmployeeName, String restaurantName) {
		boolean hasRestaurant = false;

		// checks has a restaurant
		for (RestaurantNames restaurantNames : RestaurantNames.values()) {
			if (restaurantNames.restaurantName.equals(restaurantName)) {
				System.out.println("There is a restaurant \'" + restaurantName + "\'");
				hasRestaurant = true;
				break;
			}
		}

		// if has no restaurant
		if (!hasRestaurant) {
			System.out.println("There is not a restaurant \'" + restaurantName + "\'");

			// if has free restaurant names - add it and add the new employee as
			// a Stuff Manager
			boolean hasEmptyRestaurantName = false;

			for (RestaurantNames restaurantNames : RestaurantNames.values()) {
				if (restaurantNames.restaurantName.equals("")) {
					System.out.println("There is a restaurant with a new name - " + restaurantName);
					restaurantNames.setRestaurantName(restaurantName);
					restaurants.get(restaurantNames).add(new StuffManager(newEmployeeName, 0)); // 0-StuffManagersalary
					System.out.println("Congratilations! " + newEmployeeName
							+ " is the new Stuff Manager in the restaurant \'" + restaurantName + "\'");
					hasEmptyRestaurantName = true;
					break;
				}
			}

			// if has no empty restaurant names
			if (!hasEmptyRestaurantName) {
				System.out.println("Sorry! Has no restaurant with name - \'" + restaurantName + "\'");
				return;
			}
			return;
		}

		// if has a restaurant with this name - add new employee at random
		// position
		for (RestaurantNames restaurantNames : RestaurantNames.values()) {
			if (restaurantNames.restaurantName.equals(restaurantName)) {
				Employee newEmployee = null;
				switch (new Random().nextInt(3)) {
				case 0:
					newEmployee = new JuniorWaiter(newEmployeeName, new Random().nextInt(200) + 400);
					System.out.println("Congratilations! " + newEmployeeName
							+ " is a junior waiter in the restaurant \'" + restaurantName + "\'");
					break;
				case 1:
					newEmployee = new NormalWaiter(newEmployeeName, new Random().nextInt(200) + 400);
					System.out.println("Congratilations! " + newEmployeeName + " is a waiter in the restaurant \'"
							+ restaurantName + "\'");
					break;
				case 2:
					newEmployee = new SeniorWaiter(newEmployeeName, new Random().nextInt(200) + 400);
					System.out.println("Congratilations! " + newEmployeeName
							+ " is a senior waiter in the restaurant \'" + restaurantName + "\'");
					break;

				}
				restaurants.get(restaurantNames).add(newEmployee);
			}

		}

	}

	public void addOrder(String restaurant, Order order) {
		// check order restaurant
		// HashMap<RestaurantNames, HashSet<Employee>> restaurants;
		for (Entry<RestaurantNames, HashSet<Employee>> e : restaurants.entrySet()) {
			if (e.getKey().getRestaurantName().equals(restaurant)) {//-------------------------------
				System.out.println("There is a restaurant with name \'" + restaurant + "\'");
				while (true) {
					// podai na sluchaen kelner porachkata
					// -------------------
					Iterator<Employee> it = e.getValue().iterator();
					for (int i = 0; i < new Random().nextInt(e.getValue().size()); i++) {
						it.next();
					}
					if (it.hasNext()) {
						Employee emp = it.next();
						//
						if (!(emp instanceof Manager)) {
							// ako e mladshi - random prehvarli porachka
							if (emp instanceof JuniorWaiter) {
								if (new Random().nextBoolean()) {
									((JuniorWaiter) emp).doOrder(order);
								} else {
									((JuniorWaiter) emp).transferOrderToOther();
								}
							} else {
								((Waiter) emp).doOrder(order);
							}
							return;
						}
					}
				}
			} else {
				System.out.println("Sorry! There is no a restaurant with name \'" + restaurant + "\'");
			}
		}
		return;
	}

	// Да се обработи заплатите. Фирмата трябва да раздаде заплати на
	// служителите. Ако служителят е сервитьор тогава заплатата му се начислява
	// по следната формула - базова заплата между
	// 400 и 600 лв + процент от собствения оборот на сервитьора, като
	// процентите са както следва според ранга на сервитьора (2%, 4% и 6%). Да
	// се има в предвид че ако сервитьора има оплаквания се санкционира с 20 лв
	// за всяко едно от тях. Ако служителят е мениджър на смяна заплатата му е
	// 4% от оборота на заведението, като той също търпи санкции за обърканите
	// поръчки на сервитьорите (по 10 лв на объркана поръчка). Ако е регионален
	// мениджър получава 6% от оборота на заведенията, които ръководи. На
	// конзолата да се изкара информация на кого, каква заплата е дадена и
	// накрая - колко пари сумарно отиват за заплати. (10%)

	// Да се изведат данни за всички обработени поръчки –
	// заглавие и сложност, сортирани по сложност. (5%)

	// Операция служител на месеца - да се изведе
	// сервитьора с най-малко объркани поръчки. (5%)

	// Да се изведе името на сервитьора , за който сумарно
	// има най-много объркани поръчки. (5%)

	// Да се изведат първите 3 ресторанта с най-малко
	// сгрешени поръчки и да се раздадат бонуси на служителите
	// в съответните ресторанти. (5%)

}
