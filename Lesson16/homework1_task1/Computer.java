package homework1_task1;

public class Computer {
	int year;
	double price; // lv
	boolean isNotebook;
	double hardDiskMemory; // Mb
	double freeMemory; // Mb
	String operationSystem;
	int ID;
	static private int IDcounter = 1;

	Computer() {
		isNotebook = false;
		operationSystem = "Windows XP";
		this.ID = IDcounter;
		IDcounter++;
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem) {
		if (this.year > 2017 && this.year < 2000) {
			System.out.println("Your are a liar!");
			System.out.println("Year is set to 2000 year");
			this.year = 2000;
		} else {
			this.year = year;
		}
		if (this.price >= 0) {
			this.price = price;
		} else {
			this.price = 1;
		}
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		if (operationSystem != null && !operationSystem.isEmpty()) {
			this.operationSystem = operationSystem;
		} else {
			System.out.println("Put some real operation system please!");
			System.out.println("Autosetting to XP operation system!");
			System.out.println();
			this.operationSystem = "Windows XP";
		}
		this.ID = IDcounter;
		IDcounter++;
	}

	// In constructors can be done more and more validations

	void changeOperationSystem(String operationSystem) {
		System.out.println("Operation system " + this.operationSystem + " is changing to " + operationSystem);
		System.out.println();
		this.operationSystem = operationSystem;

	}

	void useMemory(int memory) {
		if (freeMemory - memory < 0) {
			System.out.println("No enought free memory!");
			System.out.println();
		} else {
			freeMemory -= memory;
		}
	}

	void printComputerDetails() {
		System.out.println("Computer ¹ " + this.ID);
		System.out.println("Year of manifacture - " + this.year);
		System.out.println("Price - " + this.price + " BGN");
		System.out.print("Laptop - ");
		if (this.isNotebook) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("Hard disk memory - " + this.hardDiskMemory + " Mb");
		System.out.println("Free memory - " + this.freeMemory + " Mb");
		System.out.println("Operation system - " + this.operationSystem);
		System.out.println();
	}

	int comparePrice(Computer c) {
		if (this.price > c.price) {
			System.out.println("The price of computer ¹" + this.ID + " is bigger than the price of computer ¹" + c.ID);
			return -1;
		}
		if (this.price < c.price) {
			System.out.println("The price of computer ¹" + this.ID + " is smaller than the price of computer ¹" + c.ID);
			return 1;
		}
		System.out.println("The price of computer ¹" + this.ID + " is equal to the price of computer ¹" + c.ID);
		return 0;
	}

}
