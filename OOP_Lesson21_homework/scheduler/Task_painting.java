package scheduler;

public class Task_painting implements ITask {
	private String name = "painting";
	private final int PIN;
	public static int ID = 1;

	public Task_painting() {
		PIN = ID;
		ID++;
	}

	@Override
	public void doWork() {
		System.out.println("	I'm a great painter artist. Leonardooo bring me my paints...");
	}

	@Override
	public String toString() {
		return this.name + "-" + PIN;
	}
}
