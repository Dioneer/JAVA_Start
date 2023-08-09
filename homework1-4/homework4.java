// import java.util.ArrayList;
// import java.util.LinkedList;

// public class homework4 {
// static List<Integer> result = new ArrayList<Integer>();

// public static void main(String[] args) {
// LinkedList<Object> ll = new LinkedList<>();

// if (args.length == 0 || args.length != 4) {
// // При отправке кода на Выполнение, вы можете варьировать эти параметры
// ll.add(1);
// ll.add("One");
// ll.add(2);
// ll.add("Two");
// } else {
// ll.add(Integer.parseInt(args[0]));
// ll.add(args[1]);
// ll.add(Integer.parseInt(args[2]));
// ll.add(args[3]);
// }

// LLTasks answer = new LLTasks();
// System.out.println(ll);
// LinkedList<Object> reversedList = answer.revert(ll);
// System.out.println(reversedList);
// }

// }

// class LLTasks {
// public static LinkedList<Object> revert(LinkedList<Object> ll) {
// // Напишите свое решение ниже
// LinkedList<Object> newList = new LinkedList<>();
// for (int i = ll.size() - 1; i >= 0; i--) {
// newList.add(ll.get(i));
// }
// return newList;
// }
// }

// class MyQueue<T> {
// // Напишите свое решение ниже
// LinkedList<T> queue = new LinkedList<T>();

// public void enqueue(T element) {
// // Напишите свое решение ниже
// queue.addLast(element);
// }

// public T dequeue() {
// // Напишите свое решение ниже
// return queue.pollFirst();
// }

// public T first() {
// // Напишите свое решение ниже
// return queue.peekFirst();
// }

// public LinkedList<T> getElements() {
// // Напишите свое решение ниже
// return queue;
// }
// }

// class Calculator {
// static ArrayDeque<Integer> result = new ArrayDeque<Integer>();

// public int calculate(char op, int a, int b) {
// int returnres;
// // Напишите свое решение ниже
// switch (op) {
// case '+':
// result.add(a + b);
// break;
// case '-':
// result.add(a - b);
// break;
// case '/':
// result.add(a / b);
// break;
// case '*':
// result.add(a * b);
// break;
// case '<':
// int last = result.removeLast();
// result.add(result.getLast());
// break;
// default:
// break;
// }
// return result.getLast();
// }
// }
