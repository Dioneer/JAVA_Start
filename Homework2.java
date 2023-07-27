import java.util.logging.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Homework2 {
	public static void main(String[] args) {
		// String QUERY = "select * from students where ";
		// String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\",
		// \"city\":\"Moscow\", \"age\":\"null\"} ";
		// String ans = StringBuilder(QUERY, PARAMS);
		// System.out.println(ans);
		// int[] arr = new int[] { 9, 4, 8, 3, 1 };
		// sort(arr);
		// answer("[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},"
		// +
		// "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
		// "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]",
		// "Студент ", " получил ",
		// " по предмету ");
	}

	// private static String StringBuilder(String qUERY, String pARAMS) {
	// StringBuilder stringBuilder = new StringBuilder(qUERY);
	// pARAMS = pARAMS.replace("{", "").replace("}", "").replace("\"", "").trim();
	// String[] arrayData = pARAMS.split(", ");
	// for (int i = 0; i < arrayData.length; i++) {
	// String[] arrData = arrayData[i].split(":");
	// if (!arrData[1].equals("null")) {
	// stringBuilder.append(arrData[0]);
	// stringBuilder.append("=");
	// stringBuilder.append("'");
	// stringBuilder.append(arrData[1]);
	// stringBuilder.append("'");
	// if (i < arrayData.length - 2)
	// stringBuilder.append(" and ");
	// }

	// }
	// return stringBuilder.toString();
	// }

	// public static void sort(int[] mas) throws IOException {
	// File log = new File("log.txt");
	// FileWriter fileWriter = new FileWriter(log);
	// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	// int temp = 0;
	// boolean isSorted = false;
	// while (!isSorted) {
	// isSorted = true;
	// for (int i = 0; i < mas.length - 1; i++) {
	// if (mas[i] > mas[i + 1]) {
	// isSorted = false;
	// temp = mas[i];
	// mas[i] = mas[i + 1];
	// mas[i + 1] = temp;
	// }
	// // logger.info(Arrays.toString(mas));
	// }
	// fileWriter.write(dateFormat.format(new Date()) + " " +
	// Arrays.toString(mas) + "\n");
	// }
	// fileWriter.flush();
	// fileWriter.close();
	// }

	// public static void answer(String JSON, String ELEMENT1, String ELEMENT2,
	// String ELEMENT3) {
	// StringBuilder stringBuilder = new StringBuilder();
	// JSON = JSON.replace("{", "").replace("}", "").replace("\"", "").replace("[",
	// "").replace("]", "")
	// .replace("фамилия", "Студент ").replace("оценка", " получил
	// ").replace("предмет", " по предмету ")
	// .replace(":", "")
	// .trim();
	// String[] arrData = JSON.split(",");
	// for (int j = 0; j < arrData.length; j++) {
	// stringBuilder.append(arrData[j]);
	// if (j == 2 || j == 5 || j == arrData.length - 1) {
	// stringBuilder.append("\n");
	// }
	// }
	// System.out.println(stringBuilder.toString());
	// }

	// public static int calculate(char op, int a, int b) throws Exception {
	// File log = new File("log.txt");
	// FileWriter fileWriter = new FileWriter(log);
	// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	// int result = 0;
	// switch (op) {
	// case '+':
	// result = a + b;
	// break;
	// case '-':
	// result = a - b;
	// break;
	// case '/':
	// result = a / b;
	// break;
	// case '*':
	// result = a * b;
	// break;
	// default:
	// break;
	// }
	// fileWriter.write(dateFormat.format(new Date()) + " " + "User entered the
	// first operand = " + Integer.toString(a) + "\n");
	// fileWriter.write(dateFormat.format(new Date()) + " " + "User entered the
	// operation = " + Character.toString(op) + "\n");
	// fileWriter.write(dateFormat.format(new Date()) + " " + "User entered the
	// second operand = " + Integer.toString(b) + "\n");
	// fileWriter.write(dateFormat.format(new Date()) + " " + "Result is " +
	// Integer.toString(result) + "\n");
	// fileWriter.flush();
	// fileWriter.close();
	// return result;
	// }
}
