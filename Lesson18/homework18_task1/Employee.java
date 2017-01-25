package homework18_task1;

public class Employee extends Person {

	private double daySalary;

	Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		if (daySalary < 5) {
			System.out.println("Прекалено малка заплата! Да я вдигнем на 20 лева за ден (социална политика)");
			this.daySalary = 20;
		} else {
			this.daySalary = daySalary;
		}
	}

	private double getDaySalary() {
		return daySalary;
	}

	// private void setDaySalary(double daySalary) {
	// this.daySalary = daySalary;
	// }

	double calculateOvertime(double hours) {
		if (this.getAge() < 18) {
			return 0;
		}
		return daySalary / 8 * 1.5 * hours;
	}

	void showEmloyeeInfo() {
		showPersonInfo();
		System.out.println("Освен това " + getName() + " е работник с дневна заплата - " + getDaySalary());
	}
}
