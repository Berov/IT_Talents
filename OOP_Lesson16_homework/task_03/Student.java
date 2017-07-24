package task_03;

import java.util.Scanner;

public class Student {
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private short age;
	private boolean isDegree = false;
	private double money;
	Scanner sc = new Scanner(System.in);

	Student() {
		this.grade = 4;
		this.yearInCollege = 1;
		// this.isDegree = false;
		this.money = 0;
	}

	Student(String name, String subject, short age) {
		this();
		setName(name);
		setSubject(subject);
		setAge(age);
	}

	public void setAge(short age) {
		while (age < 0) {
			System.out.println("Enter an age please!");
			age = sc.nextShort();
		}
		this.age = age;
	}

	public void setSubject(String subject) {
		while (subject.isEmpty() || subject == null) {
			System.out.println("Enter a real subject please!");
			subject = sc.nextLine();
		}
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setName(String name) {
		while (name.isEmpty() || name == null) {
			System.out.println("Enter a real student name please!");
			name = sc.nextLine();
		}
		this.name = name;

	}

	public void upYear() {
		if (this.yearInCollege < 4) {
			yearInCollege++;
			System.out.println(this.name + " is a year up.");
			if (yearInCollege == 4) {
				isDegree = true;
				// System.out.println(this.name + " is already degree!
				// Congratulations!!!.");
			}
		} else {
			System.out.println(this.name + " is already degree!");
		}
	}

	public double recieveScholarship(double min, double amount) {
		if (this.age < 30 && this.grade >= min) {
			this.money += amount;
		}
		return money;
	}

	public String getName() {
		return this.name;
	}

	public double getGrade() {
		return this.grade;
	}

	public void setGrade(double grade) {
		if (grade > 0) {
			this.grade = grade;
		} else {
			this.grade = 0;
		}
	}

	public boolean getIsDegree() {
		return this.isDegree;
	}

	public int getYearInCollege() {
		return this.yearInCollege;
	}

	public short getAge() {
		return this.age;
	}

}
