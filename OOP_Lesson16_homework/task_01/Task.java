package task_01;

public class Task {

	private String name;
	private int workingHours;
	private boolean isNotReported = true;

	Task(String name, int workingHours) {
		if (!name.isEmpty() && name != null && workingHours > 0) {
			this.name = name;
			this.workingHours = workingHours;
		} else {
			System.out.println("It is not a legal task! Tray again!");
		}
	}

	public String getName() {
		return this.name;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		}
	}

	public boolean getIsNotReported() {
		return isNotReported;
	}

	public void setIsNotReported(boolean isNotReported) {
		this.isNotReported = isNotReported;
	}

}
