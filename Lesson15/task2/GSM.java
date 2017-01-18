
public class GSM {

	String model;
	boolean hasSimCard = false;
	String simMobileNumber;
	double outgoingCallsDuration = 0;
	String lastIncomingCall;
	String lastOutgoingCall;

	void insertSimCard(String simMobileNumber) {
		if (simMobileNumber.substring(0, 2).equals("08") && simMobileNumber.length() == 10) {
			this.simMobileNumber = simMobileNumber;
			hasSimCard = true;
		} else {
			System.out.println(model + " has invalid number!");
			System.out.println();
		}
	}

	void removeSimCard() {
		hasSimCard = false;
		simMobileNumber = null;
	}

	void call(GSM reciever, double duration) {
		if (hasSimCard && duration > 0 && reciever.hasSimCard && !simMobileNumber.equals(reciever.simMobileNumber)) {
			lastOutgoingCall = reciever.simMobileNumber;
			reciever.lastIncomingCall = simMobileNumber;
			outgoingCallsDuration += duration;
			printInfoForTheLastOutgoingCall();
			printInfoForTheLastIncomingCall();
			System.out.println("Spent money for all calls - " +getSumForCall());
		} else {
			System.out.println("Impossible call!");
			System.out.println();
		}
	}

	void printInfoForTheLastOutgoingCall() {
		if (lastOutgoingCall != null) {
			System.out.println(model + ": last outgoing call - " + lastOutgoingCall);
			System.out.println();
		}
	}

	void printInfoForTheLastIncomingCall() {
		if (lastIncomingCall != null) {
			System.out.println(model + ": last incoming call - " + lastIncomingCall);
			System.out.println();
		}
	}

	double getSumForCall() {
		return outgoingCallsDuration * Call.priceForAMinute;
	}
}

//