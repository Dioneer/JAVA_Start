import java.util.Random;

public class Algoritm2 {
	public static void main(String[] args) {
		ArrayInit();
		// int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44 };
		// System.out.println(binary(array, 22, 0, array.length - 1));
	}

	public static int[] ArrayInit() {
		Random random = new Random();
		return ArrayMaxInit(random.nextInt(10, 15));
	}

	public static int[] ArrayMaxInit(int length) {
		Random random = new Random();
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(-99, 100);
		}
		// directSort(array);
		// quickSort(array);
		heapSort(array);
		return array;
	}

	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.printf("%d\t", i);
		}
		System.out.println();
	}

	public static void directSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int maxValInd = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[maxValInd]) {
					maxValInd = j;
				}
			}
			if (maxValInd != i) {
				int tempo = array[i];
				array[i] = array[maxValInd];
				array[maxValInd] = tempo;
			}
		}
		printArray(array);
	}

	public static void quickSort(int[] array) {
		if (array == null)
			return;
		int[] array2 = quickSort(array, 0, array.length - 1);
		printArray(array2);
	}

	private static int[] quickSort(int[] array, int start, int end) {
		int left = start;
		int right = end;
		int middle = array[(start + end) / 2];
		do {
			while (array[left] < middle) {
				left++;
			}
			;
			while (array[right] > middle) {
				right--;
			}
			;
			if (left <= right) {
				if (left < right) {
					int tempo = array[left];
					array[left] = array[right];
					array[right] = tempo;
				}
				left++;
				right--;
			}
			;
		} while (left <= right);
		if (left < end) {
			quickSort(array, left, end);
		}
		if (start < right) {
			quickSort(array, start, right);
		}

		return array;
	}

	private static int binary(int[] array, int value, int left, int right) {
		if (right < left)
			return -1;
		int middle = (right + left) / 2;
		if (array[middle] == value)
			return middle;
		else if (array[middle] < value) {
			return binary(array, value, middle + 1, right);
		} else {
			return binary(array, value, left, middle - 1);
		}
	}

	private static int[] heapSort(int[] array) {
		// выстраиваем вершины кучек
		for (int i = array.length / 2 - 1; i >= 0; i--) {
			heapify(array, i, array.length);
		}
		// перемещаем первую вершину на последнее место
		for (int i = array.length - 1; i >= 0; i--) {
			int tempo = array[0];
			array[0] = array[i];
			array[i] = tempo;
			heapify(array, 0, i);
		}
		printArray(array);
		return array;
	}

	private static void heapify(int[] array, int i, int length) {
		int left = i * 2 + 1;
		int right = i * 2 + 2;
		int largest = i;
		if (left < length && array[left] > array[largest]) {
			largest = left;
		}
		if (right < length && array[right] > array[largest]) {
			largest = right;
		}
		if (largest != i) {
			int tempo = array[i];
			array[i] = array[largest];
			array[largest] = tempo;
			heapify(array, largest, length);
		}
	}
}
