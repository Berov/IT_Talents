package task_02;

import java.util.Scanner;

public class Computer {
	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;
	Scanner sc = new Scanner(System.in);

	Computer() {
		isNotebook = false;
		operationSystem = "Win XP";
	}

	Computer(int year, double price, double hardDiskMemory) {
		this();
		this.year = year;
		setPrice(price);
		setHardDiskMemory(hardDiskMemory);
	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem) {
		this(year, price, hardDiskMemory);
		setIsNotebook(isNotebook);
		setFreeMemory(freeMemory);
		setOperationSystem(operationSystem);
	}

	public int getYear() {
		return year;
	}

	// public void setYear(int year) {
	// this.year = year;
	// }

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		while (price < 0) {
			System.out.println("Enter a price 0 or bigger than 0!");
			price = sc.nextDouble();
		}
		this.price = price;
	}

	public boolean getIsNotebook() {
		return isNotebook;
	}

	public void setIsNotebook(boolean isNotebook) {
		this.isNotebook = isNotebook;
	}

	public double getHardDiskMemory() {
		return hardDiskMemory;
	}

	public void setHardDiskMemory(double hardDiskMemory) {
		while (price < 0) {
			System.out.println("Enter hard disk memory 0 or bigger than 0!");
			hardDiskMemory = sc.nextDouble();
		}
		this.hardDiskMemory = hardDiskMemory;
	}

	public double getFreeMemory() {
		return freeMemory;
	}

	public void setFreeMemory(double freeMemory2) {
		while (freeMemory2 < 0) {
			System.out.println("Enter free memory 0 or bigger than 0!");
			freeMemory2 = sc.nextDouble();
		}
		this.freeMemory = freeMemory2;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		while (operationSystem.isEmpty() || operationSystem == null) {
			System.out.println("Enter a real operation system please!");
			operationSystem = sc.nextLine();
		}
		this.operationSystem = operationSystem;
	}

	public int comparePrice(Computer c) {
		if (this.price > c.getPrice()) {
			return -1;
		} else if (this.price < c.getPrice()) {
			return 1;
		} else {
			return 0;
		}
	}

	public void useMemory(double memory) {
		if (memory > freeMemory) {
			System.out.println("Not enough free memory!");
		} else {
			freeMemory -= memory;
		}
	}
}
