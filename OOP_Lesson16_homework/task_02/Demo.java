package task_02;

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

--------------------------------------

Допълнете задачата със следните неща:
Класът Computer да има следните конструктори:
-конструктор по подразбиране Computer() , който иниацилизира полето isNotebook 
със стойност false и полето operationSystem с "Win XP".

-конструктор с параметри Computer(int year, double price, double hardDiskMemory), 
който първо извиква конструктора по подразбиране и после инициализира останалите полета 
със стойностите, подадени като аргументи.

-конструктор с параметри Computer(int year, double price, boolean isNotebook, double hardDiskMemory, 
double freeMemory, String operationSystem), 
който инициализира всички полета със стойностите, подадени като аргументи на конструктора.

-метод comparePrice(Computer c), който сравнява цените на 2 компютъра.
 Ако цената на първия компютър (този, за който се вика метода) е по-висока от тази на компютъра, 
 подаден като аргумент, метода връща -1. Ако цената е по-ниска се връща 1, а ако са равни, метода връща стойност 0.

В рамките на main метода да се създадат няколко обекта от тип Computer 
(посредством някой от наличните конструктори). Да се сравнят цените на компютрите 
(посредством метода comparePrice) и да се изведе подходящото съобщение.
*/

public class Demo {

	public static void main(String[] args) {
		Computer pc1 = new Computer();

		Computer pc2 = new Computer(2002, 925, 8456);

		Computer pc3 = new Computer(2015, 2148.99, true, 256000, 16000, "Linux RedHat");

		printPcDetails(pc1);
		printPcDetails(pc2);
		printPcDetails(pc3);

		System.out.println();
		System.out.println("Some changes... \nAfter changes:\n");

		pc1.setFreeMemory(8000);
		pc1.useMemory(100);
		pc2.setOperationSystem("Windows 10 Hacker Edition");
		pc3.useMemory(100);

		printPcDetails(pc1);
		printPcDetails(pc2);
		printPcDetails(pc3);

		System.out.println();

		switch (pc1.comparePrice(pc2)) {
		case -1:
			System.out.println("PC-1 is more expensive than PC-2.");
			break;
		case 0:
			System.out.println("PC-1 has the same prace like PC-2.");
			break;
		case 1:
			System.out.println("PC-1 is less expensive than PC-2.");
			break;
		default:
			System.out.println("We have no enough information about the prices!");
			break;
		}

		switch (pc3.comparePrice(pc2)) {
		case -1:
			System.out.println("PC-3 is more expensive than PC-2.");
			break;
		case 0:
			System.out.println("PC-3 has the same prace like PC-2.");
			break;
		case 1:
			System.out.println("PC-3 is less expensive than PC-2.");
			break;
		default:
			System.out.println("We have no enough information about the prices!");
			break;
		}

	}

	static void printPcDetails(Computer pc) {
		if (pc.getIsNotebook()) {
			System.out.print("This computer is a notebook. ");
		} else {
			System.out.print("This computer is a PC. ");
		}
		System.out.print("It has " + pc.getFreeMemory() + "Mb free memory, hard disk - " + pc.getHardDiskMemory()
				+ "Mb. Operation System - \"" + pc.getOperationSystem() + "\". Price - " + pc.getPrice()
				+ " lv. Vended - " + pc.getYear() + " year.");
		System.out.println("");
	}

}
