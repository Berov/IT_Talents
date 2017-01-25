package homework18_task1;

public class Demo {

	public static void main(String[] args) {

		Person[] people = new Person[10];

		Employee employee1 = new Employee("Прокопи", 31, true, 25);
		people[0] = employee1;
		Person person1 = new Person("Ставри", 24, true);
		people[1] = person1;
		Employee employee2 = new Employee("Елза Парини", 17, true, 235);
		people[2] = employee2;
		Student student1 = new Student("Максим", 17, true, 3.4);
		people[3] = student1;
		Student student2 = new Student("Лаура", 16, false, 5.9);
		people[4] = student2;
		Person person2 = new Person("Гергана", 24, false);
		people[5] = person2;

		for (int i = 0; i < people.length; i++) {
			if (people[i] == null) {
				break;
			} else if (people[i] instanceof Person) {
				people[i].showPersonInfo();
			} else if (people[i] instanceof Student) {
				Student temp = (Student) people[i];
				temp.showStudentInfo();
			} else if (people[i] instanceof Employee) {
				Employee temp = (Employee) people[i];
				temp.showEmloyeeInfo();
			}
		}

		for (int i = 0; i < people.length; i++) {
			if (people[i] == null) {
				break;
			} else if (people[i] instanceof Employee) {
				Employee temp = (Employee) people[i];
				System.out.println();
				System.out.println(String.format(
						"%s е работник и получава допълнително %.2f лева за два часа допълнителна работа.",
						temp.getName(), temp.calculateOvertime(2)));
			}
		}

	}

}
