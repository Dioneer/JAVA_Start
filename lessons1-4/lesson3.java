import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class lesson3 {
	public static void main(String[] args) {
		// task1();
		// add(1, 26);
		// bilder();
		// lastTask();
	}

	// static void task1() {
	// String s1 = "hello";
	// String s2 = "hello";
	// String s3 = s1;
	// String s4 = "h" + "e" + "l" + "l" + "o";
	// String s5 = new String("hello");
	// String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });

	// System.out.println(s1 == s2);
	// System.out.println(s2 == s3);
	// System.out.println(s3 == s4);
	// System.out.println(s4 == s5);
	// System.out.println(s5 == s6);
	// System.out.println(s1.equals(s2));
	// System.out.println(s2.equals(s3));
	// System.out.println(s3.equals(s4));
	// System.out.println(s4.equals(s5));
	// System.out.println(s5.equals(s6));
	// }

	// static void add(int from, int to) {
	// List<Integer> numList = new ArrayList<Integer>();
	// int[] arr = new int[] { 1, 2, 3 };
	// for (int i = 0; i < 11; i++) {
	// numList.add((int) ((Math.random()) * (to - from + 1) + from));
	// }
	// System.out.println(numList);
	// System.out.println(arr);
	// Collections.sort(numList, Comparator.reverseOrder());
	// System.out.println(numList);
	// }

	// static void bilder() {
	// List list = new ArrayList<>();
	// list.add(1);
	// list.add("hello");
	// list.add(2);
	// list.add("manky");
	// list.add(3);
	// list.add("snow");

	// for (Object object : list) {
	// if (object instanceof Integer) {
	// System.out.println(object);
	// }
	// }

	// Iterator iterator = list.iterator();
	// while (iterator.hasNext()) {
	// Object el = iterator.next();
	// if (el instanceof Integer) {
	// iterator.remove();
	// }
	// }
	// System.out.println(list);
	// }

	// static void lastTask() {
	// List<ArrayList<String>> bookshop = new ArrayList<>();
	// addBook("adasdasd", "1", bookshop);
	// addBook("adasdasd", "2", bookshop);
	// addBook("adasdasd", "3", bookshop);
	// addBook("adasdasd", "4", bookshop);
	// addBook("adasdasd", "5", bookshop);
	// addBook("zxczc", "5", bookshop);
	// System.out.println(bookshop);
	// }

	// static void addBook(String janre, String name, List<ArrayList<String>> shop)
	// {

	// for (int i = 0; i < shop.size(); i++) {
	// if (shop.get(i).get(0).equals(janre)) {
	// shop.get(i).add(name);
	// return;
	// }
	// }
	// ArrayList<String> list = new ArrayList<String>();
	// list.add(janre);
	// list.add(name);
	// shop.add(list);
	// }
}
