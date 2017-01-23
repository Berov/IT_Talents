package homework1_task2;

public class Student {

	String name;
	String subject;
	double grade; // 0 - 100 %
	int yearsInCollege;
	int age;
	boolean isDegree;
	double money; // BGN

	Student() {
		grade = 4;
		yearsInCollege = 1;
		isDegree = false;
		money = 0;
	}

	Student(String name, String subject, double grade, int yearsInCollege, int age, boolean isDegree, double money) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
		this.yearsInCollege = yearsInCollege;
		if (this.yearsInCollege == 4) {
			isDegree = true;
		}
		this.money = money;
		this.grade = grade;
	}

	void upYear() {
		if (!isDegree) {
			this.yearsInCollege++;
			if (this.yearsInCollege == 4) {
				isDegree = true;
			} else {
				System.out.println("Sorry but this man is no longer a student!");
			}
		}
	}

	double recieveScholarship(double min, double amount) {
		if (this.grade >= min && this.age < 30) {
			this.money += amount;
		}
		return this.money;
	}

}
