package homework1_task2;

public class College {
	public static void main(String[] args) {
				
				StudentGroup javaProgramming = new StudentGroup("Java programming");
				
				Student student1 = new Student("Vancho Jeliazkov", "Java programming", 23.5, 2, 24, false, 55.8);
				javaProgramming.addStudent(student1);
				javaProgramming.printStudentsInGroup();
				Student student2 = new Student("Gogo Naumov", "Poetry", 45.8, 1, 19, false, 20);
				javaProgramming.addStudent(student2);
				Student student3 = new Student("Petar Dimov", "Java programming", 45.8, 1, 19, false, 20);
				javaProgramming.addStudent(student3);
				javaProgramming.printStudentsInGroup();
	}

}
