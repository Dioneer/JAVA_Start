package Algoritm3;

import java.util.LinkedList;

public class Algoritm3 {
	public static void main(String[] args) {
		LinkedList<Emloyee> linkedList1 = new LinkedList<>();
		linkedList1.addFirst(new Emloyee("Elena", 34));
		linkedList1.addFirst(new Emloyee("Nina", 34));
		linkedList1.addFirst(new Emloyee("Marina", 34));
		linkedList1.addFirst(new Emloyee("Mirra", 34));
		linkedList1.addFirst(new Emloyee("Serafima", 34));
		linkedList1.addLast(new Emloyee("Sergey", 34));
		linkedList1.removeLast();
		System.out.println(linkedList1);
	}
}
