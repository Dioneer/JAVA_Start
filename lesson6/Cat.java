package lesson6;

import java.util.List;

public class Cat {
	private String name;
	private String owner;
	private String breed;
	private int age;
	private List<String> healthHistory;

	public Cat(String name, String owner, String breed, int age, List<String> healthHistory) {
		this.name = name;
		this.owner = owner;
		this.breed = breed;
		this.age = age;
		this.healthHistory = healthHistory;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.name);
		stringBuilder.append(", ");
		stringBuilder.append(this.owner);
		stringBuilder.append(", ");
		stringBuilder.append(this.breed);
		stringBuilder.append(", ");
		stringBuilder.append(this.age);
		stringBuilder.append(", ");
		stringBuilder.append(this.healthHistory);
		stringBuilder.append(".");
		return stringBuilder.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Cat) {
			Cat cat = (Cat) obj;
			if (cat.name.equals(name) && cat.owner.equals(owner) && cat.breed.equals(breed) && cat.age == age) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + owner.hashCode() + age + breed.hashCode();
	}
}
