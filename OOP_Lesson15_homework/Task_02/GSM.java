package Task_02;

public class GSM {

	// String model = "";
	boolean hasSimCard = false;
	String simMobileNumber = "";
	double outgoingCallsDuration = 0;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	void insertSimCard(String simMobileNumber) {
		if (simMobileNumber.length() == 10 && simMobileNumber.substring(0, 2).equals("08")) {
			this.simMobileNumber = simMobileNumber;
			hasSimCard = true;
			System.out.println("Sim card with number " + this.simMobileNumber + " is loaded!");
		} else {
			System.out.println("Invalide phone number!!! Insert another sim card!");
		}
	}

	void removeSimCard() {
		hasSimCard = false;
		System.out.println("Sim card is removed!");
	}

	void call(GSM receiver, double duration) {
		if (duration > 0 && receiver.simMobileNumber != this.simMobileNumber && receiver.hasSimCard
				&& this.hasSimCard) {
			Call call = new Call();
			call.caller = this;
			call.duration = duration;
			call.receiver = receiver;

			this.lastOutgoingCall = call;
			receiver.lastIncomingCall = call;
			this.outgoingCallsDuration += duration;

			System.out.println(this.simMobileNumber + " is calling to " + receiver.simMobileNumber + " - " + duration
					+ " minutes.");
		}
	}

	String getSumForCall() {
		return String.format("%.2f", outgoingCallsDuration * Call.priceForAMinute);
	}

	void printInfoForTheLastOutgoingCall() {
		if (lastOutgoingCall != null) {
			System.out.println("Details for last outgoing call: duration-" + lastOutgoingCall.duration
					+ " min. , caller-" + lastOutgoingCall.caller.simMobileNumber + " , receiver-"
					+ lastOutgoingCall.receiver.simMobileNumber);
		} else {
			System.out.println("There is no last outgoing call!");
		}
	}

	void printInfoForTheLastIncomingCall() {
		if (lastIncomingCall != null) {
			System.out.println("Details for last incoming call: duration-" + lastIncomingCall.duration
					+ " min. , caller-" + lastIncomingCall.caller.simMobileNumber + " , receiver-"
					+ lastIncomingCall.receiver.simMobileNumber);
		} else {
			System.out.println("There is no last incoming call!");
		}

	}
}
