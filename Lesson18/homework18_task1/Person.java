package homework18_task1;

public class Person {
	private String name;
	private int age;
	private boolean isMale;

	Person(String name, int age, boolean isMale) {
		this.setName(name);
		this.setAge(age);
		this.setMale(isMale);

	}

	String getName() {
		return name;
	}

	private void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} 
		else {
			if (isMale) {
				this.name = "Джон Доу";
			}
			this.name = "Джейн Доу";
	}
	}

	int getAge() {
		return age;
	}

	private void setAge(int age) {
		if (age < 1 && age > 120) {
			System.out.println("Е няма такъв човек!!! Възрастта му става... да кажем 20 години ;)");
			this.age = 20;
		} else {
			this.age = age;
		}

	}

	private void setMale(boolean isMale) {
		this.isMale = isMale;

	}

	void showPersonInfo() {
		System.out.println();
		System.out.print("Човекът се казва " + getName() + ". Той е на " + getAge() + " години ");
		if (isMale) {
			System.out.println("и е мъж.");
		} else {
			System.out.println("и е жена.");
		}
	}
}
