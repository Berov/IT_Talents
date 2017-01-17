
public class Lesson15_task2 {

	public static void main(String[] args) {
		GSM samsung = new GSM();
		samsung.model = "Samsung Galaxy Y";
		samsung.insertSimCard("0884123456");

		GSM nokia = new GSM();
		nokia.model = "Nokia Lumia";
		nokia.insertSimCard("0883111111");

		printGsmDetails(samsung);
		printGsmDetails(nokia);

		System.out.println(nokia.model + " calls to " + nokia.model);
		System.out.println();
		nokia.call(nokia, 3.5);

		printGsmDetails(samsung);
		printGsmDetails(nokia);

		System.out.println(samsung.model + " calls to " + nokia.model);
		System.out.println();
		samsung.call(nokia, 7.1);

		printGsmDetails(samsung);
		printGsmDetails(nokia);

		System.out.println(nokia.model + " calls to " + samsung.model);
		System.out.println();
		nokia.call(samsung, 2.1);

		printGsmDetails(samsung);
		printGsmDetails(nokia);

		System.out.println("Removing sim card to " + samsung.model);
		System.out.println();
		samsung.removeSimCard();

		printGsmDetails(samsung);
		printGsmDetails(nokia);

	}

	static void printGsmDetails(GSM model) {
		System.out.println("GSM model - " + model.model);
		System.out.println("Phone number - " + model.simMobileNumber);
		System.out.println("Has sim Card - " + model.hasSimCard);
		System.out.println("Outgoing calls duration - " + model.outgoingCallsDuration + " min.");
		if (model.lastIncomingCall != null) {
			System.out.println("Last incoming call - " + model.lastIncomingCall);
		} else {
			System.out.println("Last incoming call - none");
		}
		if (model.lastOutgoingCall != null) {
			System.out.println("Last outgoing call - " + model.lastOutgoingCall);
		} else {
			System.out.println("Last outgoing call - none");
		}
		System.out.println();
	}
}
