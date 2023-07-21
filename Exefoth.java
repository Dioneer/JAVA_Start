class Exefoth {
	public static void main(String[] args) {
		String result = getSolution("2? + ?5 = 69");
		System.out.println(result);
	}

	public static String getSolution(String str) {
		// Введите свое решение ниже
		String[] parts = str.split(" ");
		String[] bigParts = str.split("=");
		String result = "";
		String k = String.format("Given the equation: %s = %s", bigParts[0], bigParts[1]);
		String m = "";
		boolean found = false;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int q = Integer.parseInt(parts[0].replace("?", String.valueOf(i)));
				int w = Integer.parseInt(parts[2].replace("?", String.valueOf(j)));
				int e = Integer.parseInt(parts[4]);
				if (check(q, w, e)) {
					m = String.format("Result: %d + %d = %d", q, w, e);
					found = true;
				}
			}
		}
		if (!found) {
			m = "No solution";
		}
		result = k + "\n" + m;
		return result;
	}

	private static boolean check(int q, int w, int e) {
		return q + w == e;
	}

}