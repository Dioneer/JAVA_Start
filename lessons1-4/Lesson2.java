import java.io.FileWriter;
import java.util.logging.Level;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Lesson2 {
	public static void main(String[] args) {
		// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет
		// строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с
		// c1.
		// task0(100, 'h', 'a');
		// ===============================================================================================
		// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
		// task1("aaaaaaabbbbbbbcccccuuuuu");
		// ===============================================================================================
		// Напишите метод, который принимает на вход строку (String) и определяет
		// является ли строка палиндромом (возвращает boolean значение).
		// System.out.println(task2("11111"));
		// ===============================================================================================
		// Напишите метод, который составит строку, состоящую из 100 повторений слова
		// TEST и метод, который запишет эту строку в простой текстовый файл,
		// обработайте исключения.
		// saveFile(repeat("Test", 20));
		// ================================================================================================
		saveToFileAndLog("adasdasdasd");
	}

	static void task0(int n, char c1, char c2) {
		StringBuilder stringBuilder = new StringBuilder();
		if (n % 2 == 0) {
			for (int i = 0; i < n / 2; i++) {
				stringBuilder.append(c1).append(c2);
			}
			System.out.println(stringBuilder);
		} else {
			System.out.println("N is not even number.");
		}
	}

	static void task1(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		int count = 0;
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				count++;
			} else {
				stringBuilder.append(arr[i - 1]).append(count + 1);
				count = 0;
			}
		}
		stringBuilder.append(arr[arr.length - 1]).append(count + 1);
		System.out.println(stringBuilder);
	}

	static boolean task2(String str) {
		StringBuilder stringBuilder = new StringBuilder(str);
		String str2 = stringBuilder.reverse().toString();
		return str.equalsIgnoreCase(str2);
	}

	static String repeat(String str, int n) {
		StringBuilder stringBuilder = new StringBuilder();
		str = str + "\n";
		for (int i = 0; i < n; i++) {
			stringBuilder.append(i + 1).append(" ").append(str);
		}
		return stringBuilder.toString();
	}

	static void saveFile(String str) {
		String path = "text.txt";
		try {
			FileWriter writer = new FileWriter(path);
			writer.write(str);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// =========================================================================
	static void saveToFileAndLog(String str) {
		/*
		 * Текст задачи:
		 * Напишите метод, который составит строку, состоящую из 100
		 * повторений слова TEST и метод, который запишет эту строку в простой текстовый
		 * файл, обработайте исключения.
		 */

		Logger logger = Logger.getAnonymousLogger();
		FileHandler fileHandler = null;
		try {
			fileHandler = new FileHandler("log.txt", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.addHandler(fileHandler);
		SimpleFormatter simpleFormatter = new SimpleFormatter();
		fileHandler.setFormatter(simpleFormatter);

		String path = "f/f/f/f/f/text.txt";
		try (FileWriter writer = new FileWriter(path, true)) {
			writer.write(str);
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Level.ALL, e.getMessage());
		}
		fileHandler.close();
		logger.getHandlers()[0].close();
	}

}
