package homework1_task2;

import java.util.Random;

public class CollegeGame {

	public static void main(String[] args) {

		String[] subjects = { "poetry", "acting", "mathematics", "programming", "Java programming" };
		String[] firstNames = { "Ivan", "Dragan", "Petar", "Gogo", "Nikolai", "Vlado", "Krasi", "Momchil", "Levitan",
				"Dragomir", "Pepi", "Dancho", "Kiril", "Samuil", "Gugo", "Filip", "Jeliazko", "Stamat", "Prokopi",
				"Stavri", "Geno", "Atanas" };
		String[] lastNames = { "Jeliazkov", "Asenov", "Akaciev", "Berov", "Vinkelov", "Krumov", "Dermendjiev",
				"Popangelov", "Shvarz", "Tapanchev", "Brutalnikov" };

		StudentGroup[][] group = new StudentGroup[4][subjects.length];

		Student[][][] student = new Student[4][subjects.length][5];
		for (int i = 0; i < 4; i++) { // yearsInCollege
			for (int j = 0; j < subjects.length; j++) { // number of subjects

				for (int k = 0; k < student[i][j].length; k++) {
					Random rnd = new Random();
					int randomFirstName = rnd.nextInt(firstNames.length);
					Random rnd2 = new Random();
					int randomLastName = rnd2.nextInt(lastNames.length);

					// Random rnd3 = new Random();
					// double randomGrade = rnd3.nextDouble(100);
					Random r = new Random();
					double randomGrade = (100) * r.nextDouble();

					Random rnd4 = new Random();
					int randomAge = rnd4.nextInt(29);
					boolean Degree;
					if (i == 4) {
						Degree = true;
					} else {
						Degree = false;
					}
					Random rnd5 = new Random();
					double randomMoney = rnd5.nextInt(100);
					student[i][j][k] = new Student(firstNames[randomFirstName] + " " + lastNames[randomLastName],
							subjects[j], 33.5, i, randomAge, false, 22.2);
					System.out.println("new student is born" + " in group ");
					System.out.println("k = " + k);
					System.out.println("j = " + j);
					System.out.println("i = " + i);
					System.out.println(student[i][j][k].name);
					System.out.println(student[i][j][k].subject);

					group[i][j].addStudent(student[i][j][k]);
				}
			}
		}
		// Random rnd = new Random();
		// int y = rnd.nextInt(5);
		// StudentGroup group1 = new StudentGroup(subjects[y]);
		// System.out.println(y);
		// Student student1 = new Student(firstNames[2] + " " + lastNames[5],
		// subjects[y], 24, 3, 18, false, 27.5);
		// group1.addStudent(student1);
		// group1.printStudentsInGroup();
		// student1.recieveScholarship(2, 27.5);
		// student1.upYear();
		// group1.printStudentsInGroup();

	}

	static void createStudentsInCollege(String[] subjects, String[] firstNames, String[] lastNames) {
		// static void createStudentsInTheCollege(){
		StudentGroup[][] group = new StudentGroup[4][subjects.length - 1];
		Student[][][] student = new Student[4][subjects.length - 1][5];
		for (int i = 0; i < 4; i++) { // yearsInCollege
			for (int j = 0; j < subjects.length; j++) { // number of subjects

				for (int k = 0; k < student.length; k++) {
					Random rnd = new Random();
					int randomFirstName = rnd.nextInt(firstNames.length);
					Random rnd2 = new Random();
					int randomLastName = rnd2.nextInt(lastNames.length);

					// Random rnd3 = new Random();
					// double randomGrade = rnd3.nextDouble(100);
					Random r = new Random();
					double randomGrade = (100) * r.nextDouble();

					Random rnd4 = new Random();
					int randomAge = rnd4.nextInt(29);
					boolean Degree;
					if (i == 4) {
						Degree = true;
					} else {
						Degree = false;
					}
					Random rnd5 = new Random();
					double randomMoney = rnd5.nextInt(100);
					student[i][j][k] = new Student(firstNames[randomFirstName] + " " + lastNames[randomLastName],
							subjects[j], randomGrade, i, randomAge, Degree, randomMoney);
					group[i][j].addStudent(student[i][j][k]);
				}
			}
		}
	}

}
