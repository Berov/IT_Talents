package task_03;

import java.util.Scanner;

public class StudentGroup {
	private String groupSubject;
	private Student[] students;
	private int freePlaces;
	Scanner sc = new Scanner(System.in);
	private int amountOfGroupPlaces = 5; // a positive number!!! TO DO check...

	StudentGroup() {
		emptyGroup();
	}

	StudentGroup(String subject) {
		this();
		while (subject.isEmpty() || subject == null) {
			System.out.println("Enter a group subject please!");
			subject = sc.nextLine();
		}
		System.out.println("There is a new student group - " + subject + "!");
		this.groupSubject = subject;
	}

	public void addStudent(Student s) {
		if (freePlaces > 0 && s.getSubject().equals(groupSubject)) {
			students[students.length - freePlaces] = s;
			freePlaces--;
		} else if (freePlaces <= 0) {
			System.out.println("Sorry! There are no free places in the group.");
		} else if (!s.getSubject().equals(groupSubject)) {
			System.out.println("Sorry! The student " + s.getName() + " has a different focusof learning, different from the subject of the group - " + this.groupSubject + ". Can't be added!");
		} else {
			System.out.println("SORRY! IT'S A STRANGE ERROR!");
		}
	}

	public void emptyGroup() {
		students = new Student[amountOfGroupPlaces];
		freePlaces = amountOfGroupPlaces;
	}

	public String nameOfTheBestStudent() {
		Student theBest;
		if (freePlaces == amountOfGroupPlaces) {
			return "Sorry! There are no students in this group!";
		} else {
			theBest = students[0];
			for (int i = 1; i < students.length - freePlaces; i++) {
				if (students[i].getGrade() > theBest.getGrade()) {
					theBest = students[i];
				}
			}
		}
		return theBest.getName();
	}

	public void printStudentsInGroup() {
		System.out.println("          ---------- Group of " + this.groupSubject + " ----------");
		if (freePlaces == amountOfGroupPlaces) {
			System.out.println("There are no students in this group yet!");
		} else {
			for (int i = 0; i < students.length - freePlaces; i++) {
				System.out.print("№" + (i + 1) + " - " + students[i].getName() + " Scholarship - " + students[i].recieveScholarship(0, 0) + "lv. ");
				if (students[i].getIsDegree()) {
					System.out.print("He is degree ");
				} else {
					System.out.print("He is " + students[i].getYearInCollege() + "-th year in college ");
				}
				System.out.println("with the grade - " + students[i].getGrade() + ".");
			}
		}
		System.out.println("          ---------- End  of " + this.groupSubject + " ----------");
		System.out.println();
	}

	public Student[] getStudents() {
		return students;
	}

	public int getFreePlaces() {
		return this.freePlaces;
	}

	public String getGroupSubject() {
		return this.groupSubject;
	}

}
