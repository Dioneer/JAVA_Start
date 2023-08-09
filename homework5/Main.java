package homework5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите имя и номер телефона через запятую: ");
		String[] input = scanner.nextLine().trim().split(",");
		scanner.close();
	}
}
