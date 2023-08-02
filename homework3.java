import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class homework3 {
	public static void main(String[] args) {
		// int[] a = new int[] { 8, 1, 6, 4, 7 };
		// merge(a);
		// for (int i : a) {
		// System.out.println(i);
		// }
		// Integer[] arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// removeEvenNumbers(arr);
		Integer[] arr = new Integer[] { 4, 2, 7, 5, 1, 3, 8, 6, 9 };
		analyzeNumbers(arr);
	}

	// static public void merge(int[] array) {
	// int n = array.length;
	// if (n < 2) {
	// return;
	// }
	// int middle = n / 2;
	// int[] left = new int[middle];
	// int[] right = new int[n - middle];
	// for (int i = 0; i < middle; i++) {
	// left[i] = array[i];
	// }
	// for (int i = middle; i < n; i++) {
	// right[i - middle] = array[i];
	// }
	// merge(left);
	// merge(right);
	// mmerge(array, left, right);
	// }

	// static public void mmerge(int[] array, int[] left, int[] right) {
	// int l = left.length;
	// int r = right.length;
	// int i = 0;
	// int j = 0;
	// int index = 0;
	// while (i < l && j < r) {
	// if (left[i] < right[j]) {
	// array[index] = left[i];
	// i++;
	// index++;
	// } else {
	// array[index] = right[j];
	// j++;
	// index++;
	// }
	// }
	// for (int k = i; k < l; k++) {
	// array[index++] = left[k];
	// }
	// for (int m = j; m < r; m++) {
	// array[index++] = right[m];
	// }
	// }

	// public static void removeEvenNumbers(Integer[] arr) {
	// // ArrayList<Integer> k = new ArrayList(Arrays.asList(arr));
	// ArrayList<Integer> k = new ArrayList<Integer>();
	// for (int i = 0; i < arr.length; i++) {
	// k.add(arr[i]);
	// }
	// Iterator<Integer> iterator = k.iterator();

	// while (iterator.hasNext()) {
	// Integer el = iterator.next();
	// if (el % 2 == 0) {
	// iterator.remove();
	// }
	// }
	// System.out.println(k);
	// }
	public static void analyzeNumbers(Integer[] arr) {
		// Введите свое решение ниже
		ArrayList<Integer> k = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			k.add(arr[i]);
		}
		Collections.sort(k);
		System.out.println(k);
		int mm = Collections.min(k);
		int mmm = Collections.max(k);
		int mmmm = (int) k.stream().mapToInt(val -> val).average().orElse(0.0);
		System.out.println("Minimum is " + mm);
		System.out.println("Maximum is " + mmm);
		System.out.println("Maximum is " + mmmm);
	}
}
