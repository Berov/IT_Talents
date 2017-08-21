package scheduler;

public class Task_singing implements ITask {
	private String name = "singing";
	private final int PIN;
	public static int ID = 1;

	public Task_singing() {
		PIN = ID;
		ID++;
	}

	@Override
	public void doWork() {
		System.out.println("	I'm siiinging in the rain...");

	}

	@Override
	public String toString() {
		return this.name + "-" + PIN;
	}
}
