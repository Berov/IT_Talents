
public class Lesson15_task1 {

	public static void main(String[] args) {
		Computer comp1 = new Computer();
		comp1.year = 2000;
		comp1.price = 200.5;
		comp1.isNotebook = false;
		comp1.hardDiskMemory = 8000;
		comp1.freeMemory = 1000;
		comp1.operationSystem = "Windows XP";
		comp1.name = "Компютър 1"; //

		Computer comp2 = new Computer();
		comp2.year = 2015;
		comp2.price = 1950;
		comp2.isNotebook = true;
		comp2.hardDiskMemory = 200000;
		comp2.freeMemory = 16000;
		comp2.operationSystem = "Windows 10";
		comp2.name = "Компютър 2";

		comp1.useMemory(100);
		comp2.changeOperationSystem("Ubuntu 10");

		printComputerDetales(comp1);
		System.out.println();
		printComputerDetales(comp2);
	}

	static void printComputerDetales(Computer compNumber) {
		System.out.println(compNumber.name + ":");
		System.out.println("Година на производство - " + compNumber.year + "г.");
		System.out.println("Цена - " + compNumber.price + " лв.");
		System.out.print("Лаптоп - ");
		if (compNumber.isNotebook) {
			System.out.println("Да");
		} else {
			System.out.println("Не");
		}
		System.out.println("Памет на харддиска - " + compNumber.hardDiskMemory + " Mb");
		System.out.println("Свободна памет - " + compNumber.freeMemory + " Mb");
		System.out.println("Операционна система - " + compNumber.operationSystem);
		return;
	}
}
