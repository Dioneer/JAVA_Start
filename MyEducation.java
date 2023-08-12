import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Formatter;
import java.util.*;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyEducation {
	public static void main(String[] args) {
		// var a = 123;
		// var b = 123.12;
		// char k = 'a';
		// String s = "qwerty";
		// System.out.println(s.indexOf('y'));
		// System.out.println(getType(a));
		// System.out.println(getType(b));
		// System.out.println(Integer.compare(-5, -6));
		// System.out.println(Character.toUpperCase(k));
		// ====================================================================================
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter your name: ");
		// boolean name = scanner.hasNextBoolean();
		// System.out.println(name);
		// scanner.close();
		// ====================================================================================
		// LocalTime time = LocalTime.now();
		// System.out.println(time.getHour());
		// long k = System.currentTimeMillis();
		// System.out.println(k);
		// ====================================================================================
		// try {
		// FileWriter file = new FileWriter("study.txt", true);
		// file.append("Hi! ");
		// file.append("My ");
		// file.append("name is ");
		// file.append("Elena.\n");
		// file.flush();
		// file.close();
		// } catch (IOException ex) {
		// System.out.println(ex.getMessage());
		// }
		// ====================================================================================
		// try {
		// FileReader read = new FileReader("study.txt");
		// int c;
		// while ((c = read.read()) != -1) {
		// char ch = (char) c;
		// if (ch == '\n') {
		// System.out.println(ch);
		// } else {
		// System.out.println(ch);
		// }
		// }
		// } catch (Exception ex) {
		// System.out.println(ex.getMessage());
		// }
		// ====================================================================================
		// try {
		// BufferedReader reader = new BufferedReader(new FileReader("study.txt"));
		// String str;
		// while ((str = reader.readLine()) != null) {
		// System.out.println(str);
		// }
		// reader.close();
		// } catch (Exception ex) {
		// System.out.println(ex.getMessage());
		// }
		// ====================================================================================
		// try {
		// String pathProject = System.getProperty("user.dir");
		// String filePath = pathProject.concat("log.txt");
		// File file = new File(filePath);
		// if (file.createNewFile()) {
		// System.out.println("File not existed");
		// } else {
		// System.out.println("File existed" + " " + file.lastModified());
		// }
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
		// ====================================================================================
		// Logger logger = Logger.getLogger(MyEducation.class.getName());
		// String pathProject = System.getProperty("user.dir");
		// String filePath = pathProject.concat("asdasd/sstudy.txt");
		// FileHandler fileHandler = null;

		// try {
		// fileHandler = new FileHandler("log.txt", true);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tF %1$tT
		// %5$s%n");
		// SimpleFormatter simplef = new SimpleFormatter();
		// fileHandler.setFormatter(simplef);
		// logger.addHandler(fileHandler);

		// try (FileWriter writer = new FileWriter(filePath, true)) {
		// writer.write(" Ho-ho.");
		// writer.flush();
		// writer.close();
		// } catch (Exception e) {
		// e.printStackTrace();
		// logger.log(Level.SEVERE, e.getMessage());
		// }
		// fileHandler.close();
		// logger.getHandlers()[0].close();
		// ====================================================================================
		// int[] a = new int[] { 1, 9 };
		// int[] b = new int[6];
		// System.arraycopy(a, 0, b, 0, a.length);
		// for (int i : b) {
		// System.out.println(i);
		// }
		// for (int i : a) {
		// System.out.println(i);
		// }

		// ArrayList<Integer> list = new ArrayList<Integer>();
		// list.add(48);
		// for (Object i : list) {
		// System.out.println(i);
		// }
		// StringBuilder f = new StringBuilder("a");
		// StringBuilder g = new StringBuilder("f");
		// StringBuilder h = new StringBuilder("g");
		// StringBuilder[] arr = new StringBuilder[] { f, g, h };
		// List<StringBuilder> array = Arrays.asList(arr);
		// for (StringBuilder stringBuilder : array) {
		// System.out.println(stringBuilder);
		// }
		// Character value = null;
		// List<Character> list1 = new ArrayList<Character>();
		// // Character[] arr1 = new Character[] { 'E', 'l', 'e', 'n', 'a' };
		// // list1 = Arrays.asList(arr1);
		// list1.add('E');
		// list1.add('l');
		// list1.add('e');
		// list1.add('n');
		// list1.add('a');
		// System.out.println(list1);
		// list1.remove(1);
		// List<Character> list2 = List.copyOf(list1);
		// System.out.println(list2);
		// ====================================================================================
		// private static String getType(Object o) {
		// return o.getClass().getName();
		// }
		// ====================================================================================
		// List<Integer> list = new ArrayList<Integer>();
		// for (int i = 0; i < 5; i++) {
		// list.add(1);
		// }
		// list.add(2, 2);
		// list.add(2, 3);
		// list.set(0, 4);
		// list.remove(list.size() - 1);
		// System.out.println(list);

		// int[] a = new int[5];
		// for (int i = 0; i < a.length; i++) {
		// a[i] = 1;
		// }

		// for (int i : a) {
		// System.out.printf(i + ",");
		// }

		// LinkedList<Integer> list = new LinkedList<Integer>();
		// list.add(0, 2);
		// list.add(1, 3);
		// list.add(2, 2);
		// list.set(0, 4);
		// list.remove(list.size() - 1);
		// System.out.println(list);

		// int[] a = new int[] { 1, 9 };
		// int[] b = new int[4];
		// System.arraycopy(a, 0, b, 0, a.length);
		// for (int i : b) {
		// System.out.println(i);
		// }
		// for (int i : a) {
		// System.out.println(i);
		// }
	}
	// =============================================================================================
	// общая куча переделала
	// =============================================================================================
	// public static void add(int num, char c1, char c2) {
	// StringBuilder stringbuilder = new StringBuilder();
	// for (int i = 0; i < num / 2; i++) {
	// stringbuilder.append(c1).append(c2).append('-');
	// }
	// System.out.println(stringbuilder.toString());
	// }

	// public static void show(String str) {
	// StringBuilder stringbuilder = new StringBuilder();
	// int count = 0;
	// char[] arr = str.toCharArray();
	// Arrays.sort(arr);
	// System.out.println(arr);
	// for (int i = 1; i < arr.length; i++) {
	// if (arr[i] == arr[i - 1]) {
	// count++;
	// } else {
	// count++;
	// stringbuilder.append(arr[i - 1]).append(count);
	// count = 0;
	// }
	// }
	// System.out.println(stringbuilder.toString());
	// }

	// public static void reverse(String str) {
	// StringBuilder stringBuilder = new StringBuilder(str);
	// String str2 = stringBuilder.reverse().toString();
	// System.out.println(str.equals(str2));
	// }

	// public static void writeFile(String str) {
	// String pathProject = System.getProperty("user.dir");
	// String filePath = pathProject.concat("\\lesson6\\log.txt");
	// File file = new File(filePath);
	// try {
	// FileWriter writeFile = new FileWriter(file, true);
	// writeFile.append(str);
	// writeFile.flush();
	// writeFile.close();
	// } catch (IOException ex) {
	// System.out.println(ex.getMessage());
	// }
	// }

	// public static void loggerFile() {
	// String pathProject = System.getProperty("user.dir");
	// String filePath = pathProject.concat("asdasd/sstudy/log.txt");
	// Logger logger = Logger.getLogger(Main.class.getName());
	// File file = new File(filePath);
	// FileHandler handler = null;
	// try {
	// handler = new FileHandler("log.txt", true);
	// } catch (IOException ex) {
	// System.out.println(ex.getMessage());
	// }
	// SimpleFormatter formatt = new SimpleFormatter();
	// handler.setFormatter(formatt);
	// logger.addHandler(handler);

	// try {
	// FileWriter writeFile = new FileWriter(file, true);
	// writeFile.append("ho-ho");
	// writeFile.flush();
	// writeFile.close();
	// } catch (IOException ex) {
	// System.out.println(ex.getMessage());
	// logger.log(Level.SEVERE, ex.getMessage());
	// }
	// handler.close();
	// logger.getHandlers()[0].close();
	// }
	// public static void shop(String janre, String athor, List<List<String>> books)
	// {
	// for (int i = 0; i < books.size(); i++) {
	// if (books.get(i).get(0).equals(janre)) {
	// books.get(i).add(athor);
	// return;
	// }
	// }
	// List<String> newList = new ArrayList<String>();
	// newList.add(janre);
	// newList.add(athor);
	// books.add(newList);
	// }
}
