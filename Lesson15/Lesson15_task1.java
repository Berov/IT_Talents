
public class Lesson15_task1 {

	public static void main(String[] args) {
		Computer comp1 = new Computer();
		comp1.year = 2000;
		comp1.price = 200.5;
		comp1.isNotebook = false;
		comp1.hardDiskMemory = 8000;
		comp1.freeMemory = 1000;
		comp1.operationSystem = "Windows XP";

		Computer comp2 = new Computer();
		comp2.year = 2015;
		comp2.price = 1950;
		comp2.isNotebook = true;
		comp2.hardDiskMemory = 200000;
		comp2.freeMemory = 16000;
		comp2.operationSystem = "Windows 10";

		comp1.useMemory(100);
		comp2.changeOperationSystem("Ubuntu 10");

		System.out.println("Компютър 1:");
		System.out.println("Година на производство - " + comp1.year + "г.");
		System.out.println("Цена - " + comp1.price + " лв.");
		System.out.print("Лаптоп - ");
		if (comp1.isNotebook) {
			System.out.println("Да");
		} else {
			System.out.println("Не");
		}
		System.out.println("Памет на харддиска - " + comp1.hardDiskMemory);
		System.out.println("Свободна памет - " + comp1.freeMemory);
		System.out.println("Операционна система - " + comp1.operationSystem);

		System.out.println();

		System.out.println("Компютър 2:");
		System.out.println("Година на производство - " + comp2.year + "г.");
		System.out.println("Цена - " + comp2.price + " лв.");
		System.out.print("Лаптоп - ");
		if (comp2.isNotebook) {
			System.out.println("Да");
		} else {
			System.out.println("Не");
		}
		System.out.println("Памет на харддиска - " + comp2.hardDiskMemory);
		System.out.println("Свободна памет - " + comp2.freeMemory);
		System.out.println("Операционна система - " + comp2.operationSystem);

	}

}
