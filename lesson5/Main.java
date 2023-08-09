package lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.List;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// task1();
		// System.out.println(task2("paperp", "titlet"));
		// System.out.println(task2("barks", "fooor"));
		System.out.println(task3("(a + b * (b - a))"));
	}

	public static void task1() {
		Lesson5 lesson = new Lesson5();
		lesson.add("123456", "zxcvghjkhk");
		lesson.add("654321", "qwekghjkj");
		lesson.add("111111", "ewqghjkhj");
		lesson.add("222222", "dsasdasd");
		lesson.add("333333", "dsasdasd");
		lesson.add("444444", "dsasdasd");
		System.out.println(lesson.getAll());
		System.out.println(lesson.getbyPassnum("222222"));
		System.out.println(lesson.getbyPassname("dsasdasd"));
	}

	public static boolean task2(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		Map<Character, Character> tempo = new HashMap();
		Map<Character, Character> item = new HashMap();
		int index = 0;
		int jindex = 0;
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		for (int i = 0; i < arr1.length; i++) {
			if (item.containsKey(arr1[i])) {
				if (arr2[i] != item.get(arr1[i])) {
					return false;
				}
			} else {
				item.put(arr1[i], arr2[i]);
			}
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr2[i] == arr2[j]) {
					index = i;
					jindex = j;
				}
			}
		}
		tempo.put(arr1[index], arr2[index]);
		tempo.put(arr1[jindex], arr2[jindex]);
		if (tempo.size() >= 2) {
			return false;
		}
		return true;
	}

	public static boolean task3(String str) {
		Map<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		map.put('<', '>');
		Stack<Character> stack = new Stack<>();
		char[] items = str.toCharArray();
		for (int i = 0; i < items.length; i++) {
			if (map.containsKey(items[i])) {
				stack.push(items[i]);
			}
			if (map.containsValue(items[i])) {
				if (stack.isEmpty() || map.get(stack.pop()) != items[i]) {
					return false;
				}
			}
		}
		if (!stack.isEmpty()) {
			return false;
		}
		return true;
	}
}
