package collectionsTraining;

public class Person implements Comparable<Person> {
	private static int ID = 0;
	private String name;
	private int age;
	private int EGN;
	private Person friend = null;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.EGN = ID++;
	}

	public Person getFriend() {
		return friend;
	}

	public void setFriend(Person friend) {
		if (this.friend == null) {
			System.out.println(this.name + " has already a friend - " + this.friend.getName());
			return;
		}
		this.friend = friend;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getEGN() {
		return EGN;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", EGN=" + EGN + ", friend=" + friend + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + EGN;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (EGN != other.EGN)
			return false;
		return true;
	}

	@Override
	public int compareTo(Person o) {
		return (this.EGN - o.EGN);
	}

}
