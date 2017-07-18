package task_01;

import java.util.Random;

public class Employee {

	private String name = "";
	private Task currentTask = null;
	private byte hoursLeft = 0;
	private static int drinksCounter = 0;

	Employee(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
	}

	public Task getCurrentTask() {
		return this.currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (!currentTask.getName().isEmpty() && currentTask.getWorkingHours() >= 0) {
			this.currentTask = currentTask;
			
			if (this.currentTask.getWorkingHours() == 0) {
				this.currentTask = null;
				this.hoursLeft = 0;
			}
		} else {
			this.currentTask = null;
		}
	}

	public byte getHoursLeft() {
		return this.hoursLeft;
	}

	public void setHoursLeft(byte hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		}
	}

	public String getName() {
		return this.name;
	}

	public void work() {
		if (currentTask != null && currentTask.getWorkingHours() > 0) {
			if (currentTask.getWorkingHours() > hoursLeft) {
				System.out.println(this.name + " is working by " + currentTask.getName() + ".");
				currentTask.setWorkingHours(currentTask.getWorkingHours() - hoursLeft);
				hoursLeft = 0;
			} else {
				System.out.println(this.name + " is working by " + currentTask.getName() + ".");
				hoursLeft -= currentTask.getWorkingHours();
				currentTask.setWorkingHours(0);
			}

		} else {
			System.out.println(this.name + " is lazy - no new tasks...");
			hoursLeft = 0;
		}
		showReport();
	}

	public void showReport() {
		System.out.print("       SUPERVISOR REPORTS: ");
		if (currentTask != null && currentTask.getWorkingHours() >= 0 && currentTask.getIsNotReported()) {
			System.out.print(name + " worked on the task of " + currentTask.getName() + ". ");
			System.out.print("He has " + hoursLeft + " hours of work left. ");
			System.out.println("The task " + this.currentTask.getName() + " remains " + currentTask.getWorkingHours() + " more hours of work. ");
			
			if (currentTask.getWorkingHours() == 0) {
				currentTask.setIsNotReported(false);
			}
		} else {
			System.out.println(this.name + " is drinking " + drinkGenerator() + ". There are no more tasks to do.");
			drinksCounter++;
		}
	}

	public static int getDrinksCounter() {
		return drinksCounter;
	}

	public String drinkGenerator() {
		String[] drinks = { "beer", "water", "whiskey", "Coca-Cola", "tonic", "cocktail", "tea", "limonade", "wine",
				"cognac", "tequila", "Baylis", "plum brandy", "vodka" };
		return drinks[new Random().nextInt(drinks.length)];
	}

}
