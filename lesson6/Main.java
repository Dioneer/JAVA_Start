package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		// task1();
		// task2();
		List<String> list1 = new ArrayList<String>();
		Set<Cat> setCat = new HashSet<>();
		list1.add("asdasd");
		Cat cat1 = new Cat("Will", "Math", "asdasd", 15, list1);
		Cat cat2 = new Cat("Chack", "Kirill", "veslo", 5, list1);
		Cat cat3 = new Cat("Will", "Math", "asdasd", 15, list1);
		setCat.add(cat1);
		setCat.add(cat2);
		setCat.add(cat3);
		System.out.println(setCat);
		System.out.println(cat1.equals(cat3));
	}

	// public static void task1() {
	// Integer[] arr = { 1, 2, 8, 11, 58, 36, 3, 4, 5, 6, 8, 9 };
	// Set<Integer> setItem = new HashSet<>(Arrays.asList(arr));
	// Set<Integer> setTree = new TreeSet<>(Arrays.asList(arr));
	// Set<Integer> setKinked = new LinkedHashSet<>(Arrays.asList(arr));
	// System.out.println(setItem);
	// System.out.println(setTree);
	// System.out.println(setKinked);
	// }

	// public static void task2() {
	// Integer[] arr = { 1, 2, 8, 11, 58, 36, 3, 4, 5, 6, 8, 9, 9, 9, 9, 9, 9 };
	// Set<Integer> setArr = new HashSet<>(Arrays.asList(arr));
	// double result = setArr.size() * 100.0 / arr.length;
	// System.out.println(Math.round(result));
	// }

}