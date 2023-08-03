import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class lesson4 {
	public static void main(String[] args) {
		// task1();
		// task2();
		// task3();
		task4();
	}

	// static void task1() {
	// List<Integer> list1 = new ArrayList<Integer>();
	// List<Integer> list2 = new LinkedList<Integer>();

	// Long start = System.currentTimeMillis();

	// for (int i = 0; i < 100000; i++) {
	// list1.add(0, i);
	// }

	// Long middle = System.currentTimeMillis();

	// for (int i = 0; i < 100000; i++) {
	// list2.add(0, i);
	// }
	// Long end = System.currentTimeMillis();

	// System.out.println("First sycle: " + (middle - start));
	// System.out.println("First sycle: " + (end - middle));
	// }

	// static void task2() {
	// LinkedList<String> list = new LinkedList<>();
	// Scanner scanner = new Scanner(System.in);
	// boolean flag = true;
	// while (flag) {
	// System.out.println("Enter command: ");
	// String line = scanner.nextLine();
	// String[] arr = line.split("~");
	// int num = Integer.parseInt(arr[1]);
	// String text = arr[0];
	// System.out.println();
	// switch (text) {
	// case "print":
	// System.out.println(list.remove(num));
	// break;
	// case "exit":
	// System.out.println("Goodbye");
	// flag = false;
	// break;
	// default:
	// list.add(num, text);
	// break;
	// }
	// }
	// }

	// static void task3() {
	// LinkedList<String> list = new LinkedList<>();
	// Scanner scanner = new Scanner(System.in);
	// boolean flag = true;
	// while (flag) {
	// System.out.println("Enter command: ");
	// String text = scanner.nextLine();
	// switch (text) {
	// case "print":
	// ListIterator listIterator = list.listIterator(list.size());
	// while (listIterator.hasPrevious()) {
	// System.out.println(listIterator.previous());
	// }
	// break;
	// case "exit":
	// System.out.println("Goodbye");
	// flag = false;
	// break;
	// case "revert":
	// System.out.println(list.removeLast());
	// break;
	// default:
	// System.out.println(list.add(text));
	// break;
	// }
	// }
	// }

	static void task4() {
		Integer[] arr = { 1, 2, 3, 4, 5, 6 };
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
			queue.offer(arr[i]);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
