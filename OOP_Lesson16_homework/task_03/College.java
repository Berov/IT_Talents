package task_03;

import java.util.Random;

public class College {

	public static void main(String[] args) {
		int shownYears = 7;// a positive number. TO DO - check it!
		int numberOfCandidateStudents = 20; // 0 or more. TO DO - check it!
		int numberOfGroupsPerYear = 5; // positive number. TO DO - check it!

		StudentGroup[][] groupsPerYear = new StudentGroup[shownYears][numberOfGroupsPerYear];

		System.out.println("IT Talents Camp - College:\n\n");

		for (int j = 1; j < shownYears + 1; j++) {
			System.out.println("============================== START OF YEAR - " + j + " ==============================\n");

			// creates groups for this year
			for (int i = 0; i < numberOfGroupsPerYear; i++) {
				groupsPerYear[0][i] = new StudentGroup(subjectCreator());
			}
			System.out.println();

			// creates candidate students
			Student[] candidateStudents = new Student[numberOfCandidateStudents];
			for (int i = 0; i < numberOfCandidateStudents; i++) {
				candidateStudents[i] = studentCreator();
			}

			// add candidate students into groups
			for (int i = 0; i < candidateStudents.length; i++) {
				for (int k = 0; k < numberOfGroupsPerYear; k++) {
					if (groupsPerYear[0][k].getFreePlaces() > 0 && groupsPerYear[0][k].getGroupSubject().equals(candidateStudents[i].getSubject())) {
						groupsPerYear[0][k].addStudent(candidateStudents[i]);
						System.out.println(candidateStudents[i].getName() + " will study " + groupsPerYear[0][k].getGroupSubject());
					}
				}
			}
			System.out.println();

			// real studing -
			System.out.println();
			System.out.println("A YEAR OF HARD REAL STUDING..............");
			System.out.println();
			for (int i = 0; i < 4; i++) {
				for (int k = 0; k < groupsPerYear[i].length; k++) {
					if (groupsPerYear[i][k] != null) {
						Student[] workGroup = groupsPerYear[i][k].getStudents();
						for (int k2 = 0; k2 < groupsPerYear[i][k].getStudents().length
								- groupsPerYear[i][k].getFreePlaces(); k2++) {
							workGroup[k2].recieveScholarship(4, new Random().nextDouble() * 100);
							workGroup[k2].setGrade(new Random().nextDouble() * 100);
						}
					}
				}
			}

			// Report
			System.out.println("          Now the IT Talents-College looks like that:");
			for (int i = 0; i < 4; i++) { // 1,2,3,4-th course/year
				System.out.println("----------------------------------------> " + (i + 1)
						+ " year of studing <----------------------------------------");
				for (int k = 0; k < groupsPerYear[i].length; k++) { // exploring groups"
					if (groupsPerYear[i][k] != null) {
						groupsPerYear[i][k].printStudentsInGroup();
					} else {
						System.out.println("There is no group yet!");
					}
				}
			}

			System.out.println();

			// moves groups up
			for (int i = 4; i > 0; i--) {
				for (int k = 0; k < numberOfGroupsPerYear; k++) {
					groupsPerYear[i][k] = groupsPerYear[i - 1][k];
					if (groupsPerYear[i][k] != null) {
						for (int k2 = 0; k2 < groupsPerYear[i][k].getStudents().length - groupsPerYear[i][k].getFreePlaces(); k2++) {
							groupsPerYear[i][k].getStudents()[k2].upYear();
						}
					}
				}
			}

			System.out.println( "=============================== END OF YEAR - " + j + " ===============================\n");
		}

	}

	static Student studentCreator() {
		String[] firstName = { "George", "Steven", "Michael", "Jim", "John", "Thomas", "Garry", "Marvin", "Tim",
				"Peter", "Walter", "Carl", "Harold", "Joe", "Justin", "Terry", "Samuel", "Brandon", "Harry", "Billy",
				"Jeremy", "Randy", "Carlos", "Martin", "Todd", "Craig", "Alan", "Sean", "Danny" };
		String[] secondName = { "Thomas", "Jones", "Harris", "Young", "Nelson", "Morgan", "Rogers", "Murphy",
				"Peterson", "Foster", "Griffin", "Jordan", "West", "Hamilton", "Gomez", "Gibson", "Simpson", "Daniels",
				"Hudson", "Spencer", "Ray", "Watkins", "Olson", "Bradley", "Fox", "J", "Junior" };

		Student newStudent = new Student(
				firstName[new Random().nextInt(firstName.length)] + " "
						+ secondName[new Random().nextInt(secondName.length)],
				subjectCreator(), (short) (new Random().nextInt(30) + 10));
		System.out.println("There is a new  candidate student - " + newStudent.getName() + ". He wants to study "
				+ newStudent.getSubject() + ". He is " + newStudent.getAge() + " years old.");

		return newStudent;
	}

	static String subjectCreator() {
		String[] subjects = { "PHP", "Java Script", "Java EE", "Android", "Flash Design", "HTML", "Hacking",
				"3D Modeling", "3D Rendering", "Phone Repairing", "3D Shadowing", "CSS", "Photoshop" };
		String newSubject = subjects[new Random().nextInt(subjects.length)];
		// System.out.println("There is a new group subject: " + newSubject);
		return newSubject;
	}

}
