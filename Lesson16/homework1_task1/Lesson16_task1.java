package homework1_task1;

public class Lesson16_task1 {
	public static void main(String[] args) {

		Computer comp1 = new Computer();
		comp1.printComputerDetails();

		Computer comp2 = new Computer(2011, 200.5, 90000, 2000);
		comp2.printComputerDetails();

		Computer comp3 = new Computer(2015, 1925, true, 200000, 16000, "Windows 10 Home Edition");
		comp3.printComputerDetails();

		Computer comp4 = new Computer(2017, 3210, true, 1000000, 16000, "");
		comp4.changeOperationSystem("Linux Debian");
		comp4.printComputerDetails();

		Computer comp5 = new Computer();

		comp3.comparePrice(comp1);
		comp3.comparePrice(comp4);
		comp2.comparePrice(comp1);
		comp1.comparePrice(comp5);

		int x = comp1.comparePrice(comp5);
		switch (x) {
		case -1:
			System.out.println("I know that the return type is integer ;) The return value is " + x);
			break;
		case 1:
			System.out.println("I know that the return type is integer ;) The return value is " + x);
			break;
		case 0:
			System.out.println("I do not forget the 'switch' method and the return type. The return value is " + x);
			break;
		}

	}

}
