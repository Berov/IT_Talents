package task_01;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		byte workingHoursPerDay = 8; // 1 or more but no more than maxHoursForStrike!!! Or else... :)
		int numberOfEmployees = 4; // 1 or more
		int numberOfTasks = 5; // 0 or more
		int maxHoursPerTask = 34; // 1 or more
		byte maxHoursForStrike = 9; // more than 1 but less than 17! Or else... ;)

		if (!(maxHoursForStrike < 2 || maxHoursForStrike > 16)) {
			if (!(numberOfEmployees < 1 || numberOfTasks < 0 || maxHoursPerTask < 1 || workingHoursPerDay < 1 || workingHoursPerDay > maxHoursForStrike)) {

				// Creates workers
				Employee[] workers = new Employee[numberOfEmployees];
				for (int i = 0; i < workers.length; i++) {
					workers[i] = employeeCreator();
				}
				System.out.println();

				// Creates tasks
				Task[] tasks = new Task[numberOfTasks];
				for (int i = 0; i < numberOfTasks; i++) {
					tasks[i] = taskCreator(maxHoursPerTask, i);
				}
				System.out.println();

				// all the work
				int day = 1;
				while (true) {
					System.out.println("-------------------------------------     DAY " + day + ":     -------------------------------------");

					// It's a morning. Workers get power...
					for (int i = 0; i < workers.length; i++) {
						workers[i].setHoursLeft(workingHoursPerDay);
						System.out.println(workers[i].getName() + " is drinking milk in the morning and has power for " + workingHoursPerDay + " hours hard working.");
					}

					// a working day
					while (true) {
						System.out.println();
						System.out.println("                          MEETING WITH THE BOSS:");
						for (int i = 0; i < workers.length; i++) {
							if (numberOfTasks - 1 >= 0 && (workers[i].getCurrentTask() == null || workers[i].getCurrentTask().getWorkingHours() == 0)) {
								workers[i].setCurrentTask(tasks[numberOfTasks - 1]);
								numberOfTasks--;
								System.out.println("          Next task--> " + workers[i].getName() + " takes up the task " + workers[i].getCurrentTask().getName() + ".");

							} else if (numberOfTasks == 0 && (workers[i].getCurrentTask() == null || workers[i].getCurrentTask().getWorkingHours() == 0)) {
								System.out.println("          There are no more free tasks! " + workers[i].getName() + " is free of work.");
								workers[i].setHoursLeft((byte) 0);
							} else {
								System.out.println("          Unfinished task--> " + workers[i].getName() + " continue the task " + workers[i].getCurrentTask().getName() + ".");
							}
						}
						System.out.println();

						// the real working
						for (int i = 0; i < workers.length; i++) {
							workers[i].work();
						}

						// checks workers's power(hours left)
						boolean workersHaveNoMorePower = true;
						for (int i = 0; i < workers.length; i++) {
							if (workers[i].getHoursLeft() > 0) {
								workersHaveNoMorePower = false;
							}
						}
						// end of a working day
						if (workersHaveNoMorePower) {
							break;
						}
						// check tasks
						boolean hasNoMoreUnfinishedTasks = true;
						for (int i = 0; i < tasks.length; i++) {
							if (tasks[i].getWorkingHours() > 0) {
								hasNoMoreUnfinishedTasks = false;
							}
						}
						// end of all work
						if (hasNoMoreUnfinishedTasks) {
							break;
						}
					}

					// check tasks
					boolean hasNoMoreUnfinishedTasks = true;
					for (int i = 0; i < tasks.length; i++) {
						if (tasks[i].getWorkingHours() > 0) {
							hasNoMoreUnfinishedTasks = false;
						}
					}
					// end of all work
					if (hasNoMoreUnfinishedTasks) {
						break;
					}

					System.out.println();
					day++;
				}

				System.out.println();
				System.out.println("All the work is done!");
				System.out.println("The BOSS is happy! :)");

				if (Employee.getDrinksCounter() == 0) {
					System.out.println(workers[0].getName() + " is a hero! He did not drink at work!");
				} else if (Employee.getDrinksCounter() > 0 && Employee.getDrinksCounter() < 10) {
					System.out.println("BOSS, we drank just a bottle at work.");
				} else {
					System.out.println("How hard is working... No one wonts to drink more... :)))");
					System.out.println("BOSS we need a doctor...");
				}
			} else {
				if (numberOfEmployees < 1) {
					System.out.println("BOSS, you need some workers to finish that work!!!");
				}
				if (numberOfTasks < 0 || maxHoursPerTask < 1) {
					System.out.println("BOSS, you are kidding us! All the work is done.");
				}
				if (workingHoursPerDay < 1) {
					System.out.println("No one finish some job with no working!!!");
				}
				if (workingHoursPerDay > maxHoursForStrike) {
					System.out.println("Syndicate says: have to work no more than " + maxHoursForStrike + " hours per day!");
					System.out.println("WE NEED SLEEPING!");
					System.out.println("STRIKE!!!   STRIKE!!!   STRIKE!!!    ");
				}
			}

		} else {
			if (maxHoursForStrike < 2) {
				System.out.println("It's not normal! Syndicate's Error - It is necessary to think! :)");
			}
			if (maxHoursForStrike > 16) {
				System.out.println("We dont need any syndicates! It's a civil war!!!");
				System.out.println();
				System.out.print( "Allons enfants de la Patrie,\nLe jour de gloire est arrivé !\nContre nous de la tyrannie,\nL'étendard sanglant est levé,");
				System.out.println( "\nEntendez-vous dans les campagnes\nMugir ces féroces soldats ?\nIls viennent jusque dans vos bras\nEgorger vos fils et vos compagnes !\n");
				System.out.println( "Aux armes, citoyens,\nFormez vos bataillons,\nMarchons, marchons !\nQu'un sang impur\nAbreuve nos sillons !..");
			}
		}

	}

	private static Task taskCreator(int maxHoursPerTask, int ID) {
		String[] taskNames = { "cleaning", "printing", "singing", "building", "repairing", "trimming", "playing",
				"programming", "wood carving", "welding", "sewing", "digging", "knitting" };
		Task newTask = new Task(taskNames[new Random().nextInt(taskNames.length)] + "-" + ID, (short) (new Random().nextInt(maxHoursPerTask) + 1));
		System.out.println("There is a new task: " + newTask.getName() + ", working hours - " + newTask.getWorkingHours());

		return newTask;
	}

	private static Employee employeeCreator() {
		String[] firstName = { "George", "Steven", "Michael", "Jim", "John", "Thomas", "Garry", "Marvin", "Tim",
				"Peter", "Walter", "Carl", "Harold", "Joe", "Justin", "Terry", "Samuel", "Brandon", "Harry", "Billy",
				"Jeremy", "Randy", "Carlos", "Martin", "Todd", "Craig", "Alan", "Sean", "Danny" };
		String[] secondName = { "Thomas", "Jones", "Harris", "Young", "Nelson", "Morgan", "Rogers", "Murphy",
				"Peterson", "Foster", "Griffin", "Jordan", "West", "Hamilton", "Gomez", "Gibson", "Simpson", "Daniels",
				"Hudson", "Spencer", "Ray", "Watkins", "Olson", "Bradley", "Fox", "J", "Junior" };
		Employee newWorker = new Employee(firstName[new Random().nextInt(firstName.length)] + " " + secondName[new Random().nextInt(secondName.length)]);
		System.out.println(newWorker.getName() + " is born. ");

		return newWorker;
	}

}
