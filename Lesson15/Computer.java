
public class Computer {
	int year;
	double price; // lv
	boolean isNotebook;
	int hardDiskMemory; // Mb
	int freeMemory; // Mb
	String operationSystem;
	String name;

	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
	}

	void useMemory(int memory) {
		if (freeMemory - memory < 0) {
			System.out.println("No enought free memory!");
		} else {
			freeMemory -= memory;
		}
	}
}
