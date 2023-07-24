import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Algoritm1 {
	public static void main(String[] args) {
		AtomicInteger counter = new AtomicInteger();
		// System.out.println("Сумма числе от 1 до " + 25 + " равна " + sum(25,
		// counter));
		// System.out.println(counter.get());
		// System.out.println(sum2(25));
		counter.set(0);
		System.out.println(findSimple(500, counter));
		System.out.println(counter.get());
	}

	public static int sum(int lastNumber, AtomicInteger counter) {
		int sum = 0;
		for (int i = 1; i <= lastNumber; i++) {
			sum += i;
			counter.getAndIncrement();
		}
		return sum;
	}

	public static int sum2(int lastNumberr) {
		return ((1 + lastNumberr) * lastNumberr) / 2;
	}

	public static List<Integer> findSimple(int lastNumber, AtomicInteger counter) {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i < lastNumber; i++) {
			boolean simple = true;
			for (int j = 2; j < i; j++) {
				counter.getAndIncrement();
				if (i % j == 0) {
					simple = false;
					break;
				}
			}
			if (simple) {
				numbers.add(i);
			}
		}
		return numbers;
	}

	public static fibo(){
		
	}
}