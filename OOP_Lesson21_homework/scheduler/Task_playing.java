package scheduler;

public class Task_playing implements ITask {
	private String name = "playing";
	private final int PIN;
	public static int ID = 1;

	public Task_playing() {
		PIN = ID;
		ID++;
	}

	@Override
	public void doWork() {
		System.out.println("	I'm playing...");

	}

	@Override
	public String toString() {
		return this.name + "-" + PIN;
	}
}
