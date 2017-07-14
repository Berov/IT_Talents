package Task_01;

public class Computer {
	short year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;

	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
	}

	void useMemory(int memory) {
		if (memory > freeMemory) {
			System.out.println("Not enought free memory!");
		} else {
			freeMemory -= memory;
		}
	}
}
