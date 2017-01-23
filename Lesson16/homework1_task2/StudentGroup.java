package homework1_task2;

public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;

	StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	StudentGroup(String subject) {
		this();
		if (subject != null && !subject.isEmpty()) {
			this.groupSubject = subject;
		} else {
			System.out.println("Please give a real subject for the group!");
		}
	}

	// ---------------------------------------

	void addStudent(Student s) {
		if (this.freePlaces > 0 && s.subject == groupSubject) {
			for (int i = 0; i < students.length; i++) {
				if (students[i] == null) {
					students[i] = s;
					break;
				}
			}
			freePlaces--;
		} else {
			System.out
					.println("There is no free places in this group or the student's subject is not the same! Sorry!");
		}
	}

	void emptyGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	Student theBestStudent() {
		Student theBest = students[0];
		for (int i = 1; i < students.length; i++) {
			if (students[i].grade > theBest.grade) {
				theBest = students[i];
			}
		}
		return theBest;
	}

	void printStudentsInGroup() {
		int studentsCounter = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				studentsCounter++;
			}
		}

		for (int i = 0; i < studentsCounter; i++) {
			System.out.println(students[i].name + " is studing " + this.groupSubject + ". His grade is "
					+ students[i].grade + ". He is " + students[i].yearsInCollege + " years in the college and he is "
					+ students[i].age + " old. He has " + students[i].money + " BGN.");
		}
	}

}
