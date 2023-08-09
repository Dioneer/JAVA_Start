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
	}
}
