
public class Demo_task2 {

	public static void main(String[] args) {
		GSM samsung = new GSM();
		samsung.model = "Samsung Galaxy Y";
		samsung.insertSimCard("0888999999");

		GSM nokia = new GSM();
		nokia.model = "Nokia Lumia";
		nokia.insertSimCard("0883111111");

		samsung.call(nokia, 3.5);

		nokia.call(nokia, 2.8);

		nokia.call(samsung, 2.8);

		samsung.call(nokia, 10);

		nokia.call(samsung, 10);

	}

}
