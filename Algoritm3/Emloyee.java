package Algoritm3;

public class Emloyee {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Emloyee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Emloyee) {
			Emloyee emloyee = (Emloyee) obj;
			if (emloyee.name.equals(name) && emloyee.age == age) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		return String.format("%s - %d", name, age);
	}
}
