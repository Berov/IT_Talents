package scheduler;

public class Task_cooking implements ITask {
	private String name = "cooking";
	private final int PIN;
	public static int ID = 1;

	public Task_cooking() {
		PIN = ID;
		ID++;
	}

	@Override
	public void doWork() {
		System.out.println(
				"	Hey good looking what you got cooking\n	Hows about cooking something up for me\n	Hey sweet baby don't you think maybe\n	We could find us a brand new recipe...");
	}

	@Override
	public String toString() {
		return this.name + "-" + PIN;
	}
}
