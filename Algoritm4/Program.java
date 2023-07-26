package Algoritm4;

public class Program {
	public static void main(String[] args) {
		Employee employee2 = new Employee("Marina", 28);
		System.out.println(employee2.hashCode());
		HashMap<String, String> hashMap = new HashMap<>(4);
		String v = hashMap.put("+79265235254", "Mira");
		v = hashMap.put("+79265212345", "Ira");
		v = hashMap.put("+79265265412", "Kira");
		v = hashMap.put("+79265298764", "Mira");
		v = hashMap.put("+79265298764", "Sergei");

		String search = hashMap.get("+79265298764");

		for (HashMap.Entity entity : HashMap.HashMapIterator()) {
			System.out.printf(String.valueOf(entity.key) + ":" + String.valueOf(entity.value));
		}
	}
}
