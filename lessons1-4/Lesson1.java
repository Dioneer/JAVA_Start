import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson1 {
	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter your name: ");
		// String name = scanner.nextLine();
		// LocalTime time = LocalTime.now();
		// int hour = time.getHour();
		// if (hour >= 5 && hour < 12) {
		// System.out.println("Good morning, " + name);
		// } else if (hour >= 12 && hour < 18) {
		// System.out.println("Good day, " + name);
		// } else if (hour >= 18 && hour < 23) {
		// System.out.println("Good evening, " + name);
		// } else {
		// System.out.println("Good night, " + name);
		// }
		// scanner.close();
		// =================================================================
		// task1();
		// =================================================================
		// task2();
		// =================================================================
		// task3("Hello to Java script!");
		// =================================================================
		task4(4, 2);
	}

	static void task1() {
		int[] arr = { 1, 1, 0, 1, 1, 1, 1 };
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
			} else {
				if (count > maxCount) {
					maxCount = count;
				}
				count = 0;
			}
		}
		if (count > maxCount) {
			maxCount = count;
		}
		System.out.println(maxCount);
	}

	static void task2() {
		int[] arr = { 3, 2, 2, 3 };
		int val = 3;
		int[] tempo = new int[arr.length];
		int current = 0;
		Arrays.fill(tempo, val);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != val) {
				tempo[current++] = arr[i];
			}
		}
		// for (int i = 0; i < tempo.length; i++) {
		// System.out.println(tempo[i]);
		// }
		System.out.println(Arrays.toString(tempo));
	}

	static void task3(String str) {
		StringBuilder stb = new StringBuilder();
		String[] word = str.split(" ");
		for (int i = 0; i < word.length; i++) {
			stb.append(word[word.length - 1 - i]).append(" ");
		}
		System.out.println(stb.toString());
	}

	static void task4(int num, int num2) {
		double result = num;
		if (num2 > 0) {
			for (int i = 1; i < num2; i++) {
				result *= num;
			}
		} else if (num2 < 0) {
			for (int i = 0; i < Math.abs(num2); i++) {
				result /= num;
			}
		} else {
			result = 1;
		}
		System.out.println(result);
	}
}
