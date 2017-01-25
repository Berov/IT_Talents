package homework18_task1;

public class Student extends Person {

	private double score; // range 2-6

	Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		if (score > 2 && score < 6) {
			setScore(score);
		} else {
			System.out.println();
			System.out.println("Съжалявам, но това не е реална оценка за ученик в България!!! " + this.getName()
					+ " oстава без оценка...");
		}
	}

	private double getScore() {
		return score;
	}

	private void setScore(double score) {
		this.score = score;
	}

	void showStudentInfo() {
		showPersonInfo();
		System.out.println("Освен това " + getName() + " е ученик с оценка - " + getScore());
	}

}
