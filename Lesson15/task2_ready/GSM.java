
public class GSM {

	String model;
	boolean hasSimCard = false;
	String simMobileNumber;
	double outgoingCallsDuration = 0;
	Call lastIncomingCall;
	Call lastOutgoingCall;

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
		if (this.hasSimCard && duration > 0 && reciever.hasSimCard
				&& !this.simMobileNumber.equals(reciever.simMobileNumber)) {
			Call calling = new Call();
			calling.reciever = reciever;
			calling.caller = this;
			calling.duration = duration;
			this.lastOutgoingCall = calling;
			reciever.lastIncomingCall = calling;
			this.outgoingCallsDuration += calling.duration;
			System.out.println(this.model + " with number:" + this.simMobileNumber + " has next details:");
			System.out.println("All spent money - " + getSumForCall() + " BGN");
			printInfoForTheLastOutgoingCall();
			printInfoForTheLastIncomingCall();
		} else {
			System.out.println("Impossible call!");
			System.out.println();
		}
	}

	// double getSumForCall(double price) {
	double getSumForCall() {
		return outgoingCallsDuration * Call.priceForAMinute;
	}

	void printInfoForTheLastOutgoingCall() {
		if (this.lastOutgoingCall != null) {
			System.out.println("Last outgoing call - " + this.lastOutgoingCall.reciever.simMobileNumber);
			System.out.println();
		}
	}

	void printInfoForTheLastIncomingCall() {
		if (lastIncomingCall != null) {
			System.out.println("Last incoming call - " + this.lastIncomingCall.caller.simMobileNumber);
			System.out.println();
		}
	}
}
