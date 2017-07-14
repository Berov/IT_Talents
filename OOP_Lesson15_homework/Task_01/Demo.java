package Task_01;

/*
Създайте клас Computer, който представя компютър.
Класът да има следните полета:
year – числова стойност, показваща година на производство на
компютъра
price – числова стойност (не е задължително да е цяло число),
показваща цената на компютъра
isNotebook – булева стойност – дали компютъра е преносим или не
hardDiskMemory – числова стойност за размера на хардиска
freeMemory – числова стойност, показваща размера на свободната
памет
operationSystem – текстово поле за операционната система на
компютъра
Класът да дефинира следните методи:
-метод changeOperationSystem(newOperationSystem), който сменя
стойността на полето operationSystem със стойността, подадена като
параметър.
-метод useMemory(memory), който намалява свободната памет
(freeMemory) със стойността, подадена като аргумент.
Ако стойността на аргумента е по-голяма от свободната памет,
извежда съобщение "Not enough free memory!"
Да се създадат 2 обекта от тип Computer.
Да се зададат стойности на всеки от компютрите за year, price,
hardDiskMemory, freeMemory, operationSystem.Нека единият компютър
да е лаптоп. На единия от двата компютъра да се задели памет 100
(чрез метода useMemory), а на другия, да се смени операционната
система (чрез метода changeOperationSystem), след което да се
изведат на екрана всичките полета на двата компютъра.
*/
public class Demo {

	public static void main(String[] args) {
		Computer pc1 = new Computer();
		pc1.freeMemory = 256; // Mb
		pc1.hardDiskMemory = 1024; // Mb
		pc1.isNotebook = false;
		pc1.operationSystem = "Linux RedHat";
		pc1.price = 210.5; // lv
		pc1.year = 2001;

		Computer pc2 = new Computer();
		pc2.freeMemory = 2048; // Mb
		pc2.hardDiskMemory = 20000; // Mb
		pc2.isNotebook = true;
		pc2.operationSystem = "Mac OS";
		pc2.price = 21923.8; // lv
		pc2.year = 2013;

		printPcDetails(pc1);
		printPcDetails(pc2);

		System.out.println();
		System.out.println("Some changes... \nAfter changes:");

		pc1.useMemory(100);
		pc2.changeOperationSystem("Windows 10 Hacker Edition");

		printPcDetails(pc1);
		printPcDetails(pc2);

	}

	static void printPcDetails(Computer pc) {
		if (pc.isNotebook) {
			System.out.print("This computer is a notebook. ");
		} else {
			System.out.print("This computer is a PC. ");
		}
		System.out.print("It has " + pc.freeMemory + "Mb free memory, hard disk - " + pc.hardDiskMemory
				+ "Mb. Operation System - \"" + pc.operationSystem + "\". Price - " + pc.price + " lv. Vended - "
				+ pc.year + " year.");
		System.out.println("");
	}

}
